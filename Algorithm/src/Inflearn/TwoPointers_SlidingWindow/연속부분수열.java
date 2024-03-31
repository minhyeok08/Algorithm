package Inflearn.TwoPointers_SlidingWindow;
// 8 6
// 1 2 1 3 1 1 1 2

import java.util.*;
public class 연속부분수열 {
	public int Solution(int n, int m, int[] arr)
	{
		int answer =0, sum = 0, lt = 0;
		for(int rt=0; rt<n; rt++)
		{
			sum += arr[rt];
			if(sum == m)
				answer ++;
			while(sum >= m)
			{
				sum -= arr[lt];
				if(sum == m)
				{
					answer ++;
				}
				lt ++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		연속부분수열 T = new 연속부분수열();
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
