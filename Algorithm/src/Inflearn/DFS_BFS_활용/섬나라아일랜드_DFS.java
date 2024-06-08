package Inflearn.DFS_BFS_활용;
import java.util.*;
public class 섬나라아일랜드_DFS {
	static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[] dy = {0, 1, 1, 0, -1, -1, -1, 1};
	static int n;
	static int answer = 0;
	static int[][] board;
	public void DFS(int i, int j)	// 연결된 섬 찾기
	{
		for(int a=0; a<8; a++)
		{
			int nx = i + dx[a];
			int ny = j + dy[a];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1)
			{
				board[nx][ny] = 0;	// 지난 경로 0으로 초기화
				DFS(nx, ny);
			}
		}
	}
	public void Search()	// 섬의 시작점 찾기
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(board[i][j] == 1)
				{
					answer++;	// 섬 시작점 찾으면 + 1
					board[i][j] = 0;	// 지난 경로 0으로 초기화
					DFS(i, j);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		섬나라아일랜드_DFS T = new 섬나라아일랜드_DFS();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				board[i][j] = sc.nextInt();
				
			}
		}
		
		T.Search();
		System.out.println(answer);
		
	}

}
