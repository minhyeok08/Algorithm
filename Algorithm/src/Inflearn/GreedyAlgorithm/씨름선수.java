package Inflearn.GreedyAlgorithm;
import java.util.*;
class Body implements Comparable<Body>{
	public int h, w;	// h : 키, w : 몸무게
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o)
	{
		return o.h - this.h;	// 양수 => 내림차순
	}
}
public class 씨름선수 {
	static int cnt = 0;
	public int Solution(ArrayList<Body> arr , int n)
	{
		int max = Integer.MIN_VALUE;
		Collections.sort(arr);	// 키 순 정렬
		for(Body x : arr)	
		{
			if(x.w > max)	// 몸무게가 앞선 사람들 보다 크다면 // 즉 키, 몸무게 둘 중 하나가 우수하다면 (키는 이미 정렬된 상태이므로)
			{
				max = x.w;
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		씨름선수 T = new 씨름선수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int h = sc.nextInt();
			int w = sc.nextInt();
			arr.add(new Body(h, w));
		}
		System.out.println(T.Solution(arr, n));
	}

}
