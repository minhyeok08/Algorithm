package Inflearn.Recursive_Tree_Graph;
import java.util.*;
public class 경로탐색_ArrayList {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;	
	static int[] ch;
	public void DFS(int x)
	{
		if(x==n)
			answer++;
		else
		{
			for(int nx : graph.get(x))
				if(ch[nx]==0)
					{
						ch[nx] = 1;
						DFS(nx);
						ch[nx] = 0;
					}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		경로탐색_ArrayList T = new 경로탐색_ArrayList();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++)
		{
			graph.add(new ArrayList<Integer>());
		}	
		for(int i=0; i<m; i++)
		{						
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch = new int[n+1];
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}

}
