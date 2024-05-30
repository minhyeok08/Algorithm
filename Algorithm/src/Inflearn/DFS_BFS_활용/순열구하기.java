package Inflearn.DFS_BFS_활용;
import java.util.*;

public class 순열구하기 {
	static int n, m;
	static int[] pm, ch;
	public void DFS(int L, int[] arr)
	{
		if(L==m)
		{
			for(int i=0; i<m; i++)
			{
				System.out.print(pm[i]+" ");
			}
			System.out.println();
		}
		else
		{
			for(int i=0; i<n; i++)
			{
				if(ch[i] == 0)
				{
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1, arr);
					ch[i] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		순열구하기 T = new 순열구하기();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();	
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		ch = new int[n];	
		pm = new int[m];
		T.DFS(0, arr);
		
	}

}
