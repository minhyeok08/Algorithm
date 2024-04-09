package Inflearn.Stack_Queue;
/*
 * 5 2
60 50 70 80 90
 */
import java.util.*;
class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}
public class 응급실 {	
	public int Solution(int n, int m, int[] arr){
		int answer = 0;
		Queue<Person> Q = new LinkedList<>();
		for(int i=0; i<n; i++)
		{
			Q.offer(new Person(i, arr[i]));
		}
		while(!Q.isEmpty())
		{
			Person cur = Q.poll();	// 현재 환자 정보
			for(Person x : Q)
			{			
				if(x.priority > cur.priority)	// 현재 환자보다 우선순위의 환자가 있다면
				{
					Q.offer(cur);	// 현재환자를 맨뒤로 보내고
					cur = null;	//	null 처리
					break;	// 반복 탈출 후 새로운 현재 환자 정보 get
				}	
			}
			if(cur != null)	//	현재 환자의 우선 순위가 가장 높으면
			{
				answer ++;	// 치료 받고 answer ++
				if(cur.id == m)	// 현재 환자의 id가 구하려는 환자라면 return
					return answer;
			}
		}	
		return answer;
	}
	
	public static void main(String[] args){
		응급실 T = new 응급실();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(T.Solution(n, m, arr));
	}
}