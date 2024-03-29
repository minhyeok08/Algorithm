package Inflearn.배열;
import java.util.*;

public class 격자판최대합 {
	public int Solution(int n, int[][] arr)
	{
		int answer = 0;
		int sum,sum2,tmp,cross = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{			
			tmp = 0;
			sum = sum2 = 0;
			for(int j=0; j<n; j++)
			{
				sum += arr[i][j];
				sum2 += arr[j][i];							
			}
			tmp = Integer.max(sum, sum2);
			if(tmp > max)
				max = tmp;
		}
		sum = sum2 = 0;
		for(int i=0; i<n; i++)
		{
			sum += arr[i][i];
			sum2 += arr[i][n-i-1];
			
		}
		cross = Integer.max(sum, sum2);
		
		answer = Integer.max(max, cross);
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		격자판최대합 T = new 격자판최대합();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(T.Solution(n, arr));
		
	}

}
