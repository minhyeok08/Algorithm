package Inflearn.DFS_BFS_활용;
import java.util.*;
public class 피자배달거리2 {
	static int n, m, answer = 0;
	static int[][] board;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static ArrayList<Integer> arr = new ArrayList<>();
	public void DFS(int L, int i, int j)
	{
		
		for(int a=0; a<4; a++)
		{			
			int nx = i + dx[a];
			int ny = j + dy[a];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny] == 2)
			{
				arr.add(L+1);
				return;
			}
			else
			{
				DFS(L+1, nx, ny);
			}
		}
	}
	public void searchHome()
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(board[i][j] == 1)
				{
					board[i][j] = 0;
					DFS(0, i, j);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		피자배달거리2 T = new 피자배달거리2();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		board = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				board[i][j] = sc.nextInt();
			}
		}
		
		T.searchHome();
		Collections.sort(arr);
		
		for(int i=0; i<m; i++)
		{
			answer += arr.get(i);
		}
	}

}
