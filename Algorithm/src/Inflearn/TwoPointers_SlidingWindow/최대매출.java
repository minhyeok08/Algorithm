package Inflearn.TwoPointers_SlidingWindow;
// 10 3
// 12 15 11 20 25 10 20 19 13 15
import java.util.*;
public class 최대매출 {
	public int Solution(int n, int m, int[] arr)
	{
		int answer = 0;
		int sum = 0;
		for(int i=0; i<m; i++)
		{
			sum += arr[i];
		}
		answer = sum;
		for(int i=m; i<n; i++)
		{
			sum += ( arr[i] - arr[i-m] );
			answer = Integer.max(answer, sum);
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		최대매출 T = new 최대매출();
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
