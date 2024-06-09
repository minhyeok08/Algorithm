package Inflearn.DFS_BFS_활용;
import java.util.*;
class Point2 {
	int x, y;
	Point2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class 토마토_BFS활용 {
	static int[][] board, dis;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n,m;
	static Queue<Point2> Q = new LinkedList<>();
	public void BFS()
	{		
		while(!Q.isEmpty())
		{
			Point2 tmp = Q.poll();
			for(int i=0; i<4; i++)
			{
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0)
				{
					board[nx][ny] = 1;
					Q.offer(new Point2(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;	// 현재까지 걸린 일수 + 1
				}
			}			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		토마토_BFS활용 T = new 토마토_BFS활용();
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		board = new int[n][m];
		dis = new int[n][m];
		int answer = Integer.MIN_VALUE;
		boolean flag = true;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				board[i][j] = sc.nextInt();
				if(board[i][j] == 1)
				{
					Q.offer(new Point2(i, j)); // 초기값 입력
				}
			}
		}
		T.BFS();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(board[i][j] == 0)	// 안익은 토마토가 존재할 때
				{
					flag = false;	
				}
			}
		}
		
		if(flag)
		{
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++)
				{
					answer = Math.max(answer, dis[i][j]);	// 토마토가 모두 익었을 때 최대 일수
				}
			}
			System.out.println(answer);
		}
		else
		{
			System.out.println(-1);	// 안익은 토마토 존재할 때 -1 출력
		}
	}

}
