package Stack_Queue;
import java.util.*;
public class Inflearn5_7 {
	public String Solution(String essen, String all)
	{
		String answer = "YES";
		Queue <Character> Q = new LinkedList<>();
		for(char x  : essen.toCharArray())
		{
			Q.offer(x);
		}
		for(char x : all.toCharArray())
		{
			if(Q.contains(x))
			{
				if(x != Q.poll()) answer = "NO";	// Queue를 poll 한값과 x 의 값이 같다면 poll 진행 , 다르다면 "NO"
			}
		}
		if(Q.size()>=1)	// Queue에 값이 남아 있는 지 확인
		{	
			return "NO";
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn5_7 T = new Inflearn5_7();
		Scanner sc = new Scanner(System.in);
		String essen = sc.next();
		String all = sc.next();
		System.out.println(T.Solution(essen, all));
	}
}

/* Queue 활용 문제 2
 * 
 * 필수과목을 Queue에 넣고
 * all 배열을 contains() 함수로 Queue에 존재하는지 검사 => true 일때 Queue 안의 x 값을 poll 했을 때 같은지 확인 =>
 * => 같지 않다면 "NO" return 같다면 Q.poll() 수행 => 반복
 * => all 배열을 모두 순회한 후 Queue에 값이 남았다면 필수 과목을 모두 수강하지 않았으므로 "NO" 출력
 * 
 */

