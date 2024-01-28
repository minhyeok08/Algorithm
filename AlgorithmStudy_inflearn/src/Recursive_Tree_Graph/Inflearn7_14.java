package Recursive_Tree_Graph;
import java.util.*;
class Inflearn7_14 {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v){
		ch[v]=1;
		dis[v]=0;
		Queue<Integer> queue=new LinkedList<>();
		queue.offer(v);
		while(!queue.isEmpty())
		{
			int cv=queue.poll();
			for(int nv : graph.get(cv))
			{
				if(ch[nv]==0)
				{
					ch[nv]=1;
					queue.offer(nv);
					dis[nv]=dis[cv]+1;
				}
			}
		}
		
	}
	
	public static void main(String[] args){
		Inflearn7_14 T = new Inflearn7_14();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		dis=new int[n+1];
		for(int i=0; i<m; i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i=2; i<=n; i++)
		{
			System.out.println(i+" : "+dis[i]);
		}
		
	}	
}