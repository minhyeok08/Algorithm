package Inflearn.DFS_BFS_활용;
import java.util.*;
public class 조합수_메모이제이션 {
	int[][] mem = new int[35][35];
	public int DFS(int n, int m)
	{
		if(mem[n][m] > 0)
		{
			return mem[n][m];
		}
		if(m==0 || n==m)
		{
			return 1;
		}
		else
		{
			return mem[n][m] = (DFS(n-1 , m-1) + DFS(n-1 , m));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		조합수_메모이제이션 T = new 조합수_메모이제이션();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(T.DFS(n, m));
		
	}

}
