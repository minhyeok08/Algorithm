import java.util.*;
import java.io.*;

class Person{
	int id;
	int danger;
	public Person(int id, int danger){	// person 생성자
		this.id=id;
		this.danger=danger;
	}
}

class Main {	
	public int solution(int n, int m, int[] arr){
		int answer=0;
		Queue<Person> Q=new LinkedList<>();
		for(int i=0; i<n; i++){
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty()){	// Queue의 값이 없을 때까지 while문 수행
			Person tmp=Q.poll();	// poll 값을 tmp객체에 저장
			for(Person x : Q){	// queue 내부 값 순환
				if(x.danger>tmp.danger){	// if x의 위험도 값이 tmp의 위험도 값 보다 크다면 => tmp가 진료를 받지 못한다면
					Q.offer(tmp);	// tmp 값을 queue에 넣고 => 후순위로 다시 넣고
					tmp=null;	// tmp 값 null로 초기화 후 break
					break;
				}
			}
			if(tmp!=null){	// tmp가 진료를 받을 수 있다면
				answer++;	// answer 값 증가
				if(tmp.id==m) 
					return answer;	// tmp의 id 값이 제시 한 id 값과 같다면 answer return
			}
		}
		return answer;
	}

	public static void main(String[] args) throws IOException{
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));	
	}
}
/*
 *	 person 생성자를 통해 (id, danger) 객체를 생성하고
 *	 Queue에 값을 넣는다
 *	 
 *	 Queue를 poll 하고 그 값을 tmp로 넣어 후 순위 값들과 위험도(danger)를 비교한다
 *	 비교한 뒤 tmp의 위험도가 낮다면 큐에 다시 offer하고 tmp값을 null로 초기화하고 break로 for문을 빠져나온다
 *   
 *   다시 poll한값을 queue에 넣고 다시 비교하는 과정을 반복한다
 *   만약 tmp의 danger 값보다 높은 환자가 없을 시 tmp != null 이면 진료를 보는것이므로 answer 값을 ++ 해준다
 *   
 *   위 과정을 반복해서 진료를 보는 수를 카운트 하는데 tmp.id == m 값이라면 answer 값 카운트한 값을 return한다
 */
