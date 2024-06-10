package Inflearn.DFS_BFS_활용;
import java.util.*;
class Point4{
	int x, y;
	Point4(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
public class 피자배달거리 {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[][] board;
	static ArrayList<Point4> home, pizza;
	static int[] combi;
	public void DFS(int L, int s)
	{
		if(L==m)
		{
			int sum = 0;	
			for(Point4 h : home)
			{
				int dis = Integer.MAX_VALUE;
				for(int i : combi)	// 피자집 조합 인덱스
				{
					dis = Math.min(dis, Math.abs(h.x - pizza.get(i).x) + Math.abs(h.y - pizza.get(i).y));
					//	선택된 집과 선택된 피자집 조합 중 최소거리 저장
				}
				sum += dis;	// 모든 집에서 피자집 조합 간 최소거리 합계 저장
			}
			answer = Math.min(answer, sum);	// 최종 최소 피자배달거리 계산
		}
		else
		{
			for(int i=s; i<len; i++)	// 피자집 조합 생성
			{
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		피자배달거리 T = new 피자배달거리();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		board = new int[n][n];
		home = new ArrayList<Point4>();
		pizza = new ArrayList<Point4>();
		combi = new int[m];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				board[i][j] = sc.nextInt();
				if(board[i][j] == 1)
				{
					home.add(new Point4(i,j));
				}
				if(board[i][j] == 2)
				{
					pizza.add(new Point4(i,j));
				}
			}
		}
		len = pizza.size();	// 전체 피자집 개수
		T.DFS(0, 0);
		System.out.println(answer);
	}

}
