package Inflearn.배열;
import java.util.*;

public class 봉우리 {
	public int Solution(int n, int[][] arr)
	{
		int answer = 0;
		int dx[] = {-1,0,1,0};
		int dy[] = {0,1,0,-1};
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				boolean flag = true;
				for(int k=0; k<4; k++)
				{					
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j])	// 배열의 외곽지역으로 벗어나지 않게
					{
						flag = false;
						break;
					}
					
				}
				if(flag)
					answer ++;
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		봉우리 T = new 봉우리();
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
