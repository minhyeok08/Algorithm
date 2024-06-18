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
	public int compareTo(Time O)
	{
		return this.e - O.e; // 음수 오름차순
	}
}
public class 회의실배정 {
	public int Solution()
	{
		return 1;
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
	}

}
