package Inflearn.GreedyAlgorithm;
import java.util.*;
// 시작시간, 끝시간을 하나의 t로 놓고, 그에 대응하여 시작시간일 경우('s'), 끝시간일 경우('e')를 매칭시킨다.
// Time2 객체를 순회하며, 's'일 경우 해당인원이 결혼식에 참석하는 것이므로 cnt++ 해주고 'e'일 경우 cnt--를 해준다.
// 또한, 다른사람의 시작시간과 끝시간이 겹치는 경우 => 끝시간 인원을 cnt-- 해준다 => 그러기 위해서는 'e'값을 's'값 보다 앞서게 정렬한다.
class Time2 implements Comparable<Time2>{
	public int t;
	public char c;
	Time2(int t, char c)
	{
		this.t = t;
		this.c = c;
	}
	
	@Override
	public int compareTo(Time2 O)
	{
		if(O.t == this.t)	// 시간이 겹치는 경우	// 끝시간('e')가 ('s')보다 먼저 오게 정렬 => 오름차순
		{
			return this.c - O.c;
		}
		else
		{
			return this.t - O.t;	// 시간 오름차순 정렬
		}
	}
}
public class 결혼식 {
	
	public int Solution(ArrayList<Time2> arr)
	{
		int answer = Integer.MIN_VALUE;
		int cnt = 0;
		Collections.sort(arr);
		
		for(Time2 ob : arr)
		{
			if(ob.c == 's')
			{
				cnt++;
			}
			else
			{
				cnt--;
			}
			answer = Math.max(answer, cnt);
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		결혼식 T = new 결혼식();
		Scanner sc = new Scanner(System.in);
		ArrayList<Time2> arr = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Time2(s, 's'));
			arr.add(new Time2(e, 'e'));
		}
		
		System.out.println(T.Solution(arr));
	}

}
