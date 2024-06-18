package Inflearn.GreedyAlgorithm;
import java.util.*;

class Time implements Comparable<Time>{
	public int s, e;
	Time(int s, int e)
	{
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time O)	// 정렬부분이 Point!!
	{
		if(this.e == O.e)	// 종료시간이 같다면 => 시작시간을 오름차순 정렬 => 종료시간이 같다면 더 이른 시작시간을 가진 회의가 들어가야하므로
		{
			return this.s - O.s;  // 음수 => 시작시간 오름차순	
		}
		else
		{
			return this.e - O.e; // 음수 => 종료시간 오름차순			
		}
	}
}
public class 회의실배정 {
	static int cnt = 0;
	public void Solution(ArrayList<Time> arr)
	{
		int end = 0;
		Collections.sort(arr);
		for(Time ob : arr)
		{
			if(ob.s >= end)	// 시작시간이 종료시간과 같거나 뒤늦은 시간이라면
			{
				cnt++;
				end = ob.e;	// 회의실 종료시간을 끝나는 시간을 초기화
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		회의실배정 T = new 회의실배정();
		Scanner sc = new Scanner(System.in);
		ArrayList<Time> arr = new ArrayList<>();
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Time(s, e));
		}
		T.Solution(arr);
		System.out.println(cnt);
	}

}
