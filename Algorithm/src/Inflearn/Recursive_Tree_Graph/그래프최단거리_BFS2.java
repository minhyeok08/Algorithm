package Inflearn.Recursive_Tree_Graph;
/*
 * 
6 9

1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5
 */
import java.util.*;
public class 그래프최단거리_BFS2 {
	static int n, m;
	static int[] ch, dis;
	static ArrayList<ArrayList<Integer>> graph;
	public void BFS(int x)
	{
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(x);
		ch[x] = 1;
		while(!queue.isEmpty())
		{
			int cx = queue.poll();
			for(int nx : graph.get(cx))
			{
				if(ch[nx]==0)
				{
					ch[nx] = 1;
					queue.offer(nx);
					dis[nx]	= dis[cx] + 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		그래프최단거리_BFS2 T = new 그래프최단거리_BFS2();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++)
		{
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i=0; i<m; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i=2; i<=n; i++)
		{
			System.out.println(i + " : " + dis[i]);
		}
		
	}

}
