package Inflearn.배열;
import java.util.*;

public class 격자판최대합2 {
	public int Solution(int n, int[][] arr)
	{
		int answer = Integer.MIN_VALUE;
		int sum,sum2 = 0;
		
		for(int i=0; i<n; i++)
		{
			sum = sum2 = 0;
			for(int j=0; j<n; j++)
			{
				sum += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Integer.max(answer, sum);
			answer = Integer.max(answer, sum2);
		}
		sum = sum2 = 0;
		for(int i=0; i<n; i++)
		{
			sum += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		answer = Integer.max(answer, sum);
		answer = Integer.max(answer, sum2);
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		격자판최대합2 T = new 격자판최대합2();
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
