package Inflearn.DFS_BFS_활용;
import java.util.*;
class Point3{
	int x, y;
	Point3(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class 섬나라아일랜드_BFS {
	static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[] dy = {0, 1, 1, 0, -1, -1, -1, 1};
	static int n;
	static int answer = 0;
	static int[][] board;
	Queue<Point3> Q = new LinkedList<>();
	public void BFS(int i, int j)
	{
		Q.offer(new Point3(i,j));
		while(!Q.isEmpty())
		{
			Point3 tmp = Q.poll();
			for(int a=0; a<8; a++)
			{
				int nx = tmp.x + dx[a];
				int ny = tmp.y + dy[a];
				if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1)
				{
					board[nx][ny] = 0;
					Q.offer(new Point3(nx, ny));					
				}
			}
		}
	}
	
	public void Search()
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(board[i][j] == 1)
				{
					answer++;
					board[i][j] = 0;
					BFS(i, j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		섬나라아일랜드_BFS T = new 섬나라아일랜드_BFS();
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
