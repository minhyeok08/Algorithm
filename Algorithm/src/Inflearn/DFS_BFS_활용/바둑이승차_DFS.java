package Inflearn.DFS_BFS_활용;
import java.util.*;
public class 바둑이승차_DFS {
	static int n, m, max = 0;
	public void DFS(int L, int sum, int[] arr)
	{
		/*if(L==m)
		{
			if(max < sum && n >= sum)
			{
				max = sum;
			}
		}*/
		if(sum > n)
			return;
		if(L==m)
		{
			max = Math.max(sum, max);
		}
		else
		{
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		바둑이승차_DFS T = new 바둑이승차_DFS();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] arr = new int[m];
		for(int i=0; i<m; i++)
		{
			arr[i] = sc.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(max);
	}

}
