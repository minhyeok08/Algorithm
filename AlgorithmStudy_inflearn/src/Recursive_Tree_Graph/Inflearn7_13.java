package Recursive_Tree_Graph;
import java.util.*;
class Inflearn7_13 {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public void DFS(int v){
		if(v==n) answer++;
		else{
			for(int nv : graph.get(v)){
				if(ch[nv]==0){
					ch[nv]=1;
					DFS(nv);
					ch[nv]=0;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Inflearn7_13 T = new Inflearn7_13();
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		for(int i=0; i<m; i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1;
		T.DFS(1);
		System.out.println(answer);
	}	
}