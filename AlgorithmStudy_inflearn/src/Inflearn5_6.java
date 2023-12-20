import java.util.*;
class Inflearn5_6 {	
	public int solution(int n, int m){
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1; i<n+1; i++)
		{
			Q.offer(i);
		}
		while(!Q.isEmpty())
		{
			for(int i=1; i<m; i++)
			{
				Q.offer(Q.poll());
			}
				Q.poll();
			if(Q.size()==1)
			{
				answer = Q.poll();
			}
			
		}
		return answer;
	}
	
	public static void main(String[] args){
		Inflearn5_6 T = new Inflearn5_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(T.solution(n, m));
	}
}

/*************
Queue => 선입선출
Q.poll() => 내보내기
Q.offer() => 넣기
Q.size() => Queue의 사이즈
Q.cotains(?) => 포함 여부
Q.peek() => 내보내질 거 보여주기 / 나가진 않음



큐에서 m의 값만큼 poll 하고 그걸 다시 offer => Q.offer(Q.poll)
그리고 m의 값에 해당하는 값 poll !
반복 한 후 Q.size() = 1일때
answer에 Q.poll() 하여 값 삽입 */