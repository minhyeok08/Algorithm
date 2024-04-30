package Inflearn.Recursive_Tree_Graph;

public class 피보나치 {
	public int DFS(int n){
		if(n==1) 
			return 1;
		
		else if(n==2) 
			return 1;
		
		else 
			return DFS(n-2) + DFS(n-1);
	}
	public static void main(String[] args){
		피보나치 T = new 피보나치();
		int n = 10;
		for(int i=1; i<=n; i++) 
			System.out.print(T.DFS(i)+" ");
	}	
}

