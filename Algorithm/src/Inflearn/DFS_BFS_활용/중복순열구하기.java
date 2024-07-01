package Inflearn.DFS_BFS_활용;
import java.util.*;

public class 중복순열구하기 {
	static int n, m;
	static int[] pm;
	public void DFS(int L)
	{
		if(L==m)
		{
			for(int i=0; i<m; i++)
			{
				System.out.print(pm[i] + " ");
			}
			System.out.println();
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		중복순열구하기 T = new 중복순열구하기();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];
		T.DFS(0);
		
	}

}
