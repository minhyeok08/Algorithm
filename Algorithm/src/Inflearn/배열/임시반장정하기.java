package Inflearn.배열;
import java.util.*;

public class 임시반장정하기 {
	public int Solution(int n, int[][] arr)
	{
		int answer = 0;
		int cnt = 0, max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++)
		{
			cnt = 0;
			for(int j=0; j<n; j++)
			{
				for(int k=0; k<5; k++)
				{
					if(arr[i][k]==arr[j][k])	
					{
						cnt ++;
						break;
					}
				}
			}
			if(max < cnt)
			{
				max = cnt;
				answer = i+1;
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		임시반장정하기 T = new 임시반장정하기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][5];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<5; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(T.Solution(n, arr));
		
	}

}
