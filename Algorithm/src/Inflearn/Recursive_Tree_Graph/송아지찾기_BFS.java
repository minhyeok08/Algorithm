package Inflearn.Recursive_Tree_Graph;
import java.util.*;

public class 송아지찾기_BFS {	
	int answer = 0;
	int[] ch = new int[10001];
	int[] dis = {1, -1, 5};
	public int BFS(int n, int m)
	{
		ch[n] = 1;
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(n);
		int L = 0;
		while(!Q.isEmpty())
		{
			int len = Q.size();
			for(int i=0; i<len; i++)
			{
				int x = Q.poll();
				for(int j=0; j<3; j++)
				{
					int nx = x + dis[j];
					if(nx==m)
					{
						return L+1;
					}
					if(nx>=1 && nx<=10000 && ch[nx]==0)
					{
						ch[nx] = 1;
						Q.offer(nx);
					}
					
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args){
		송아지찾기_BFS T = new 송아지찾기_BFS();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(T.BFS(n, m));
		
	}	
}