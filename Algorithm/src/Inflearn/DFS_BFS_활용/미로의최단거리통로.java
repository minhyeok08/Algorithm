package Inflearn.DFS_BFS_활용;
import java.util.*;
class Point {
	public int x, y;
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class 미로의최단거리통로 {
	static int[][] board, dis;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int min = Integer.MAX_VALUE;
	Queue<Point> Q = new LinkedList<>();
	public void BFS(int x, int y)
	{
		Q.offer(new Point(x, y)); // 초기값 입력
		while(!Q.isEmpty())
		{
			Point tmp = Q.poll();
			for(int i=0; i<4; i++)
			{
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0)
				{
					board[nx][ny] = 1;	// 지난 경로 벽처리
					Q.offer(new Point(nx, ny));	
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;  // 현재거리 + 1
				}
			}
			
		}
		if(dis[7][7] == 0)	// 도착지점까지 경로가 없다면
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(dis[7][7]);	// 최단거리 출력
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		미로의최단거리통로 T = new 미로의최단거리통로();
		Scanner sc = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8]; // 거리 계산 배열
		for(int i=1; i<8; i++)
		{
			for(int j=1; j<8; j++)
			{
				board[i][j] = sc.nextInt();
			}
		}
		board[1][1] = 1;
		T.BFS(1, 1);
	}

}
