package Inflearn.DFS_BFS_활용;

import java.util.*;
class 합이같은부분집합2{
	static String answer = "NO";
	static int n, total = 0;
	boolean flag = false;
	public void DFS(int L, int sum, int[] arr)
	{
		if(flag)
			
			return;
		
		if(total/2 < sum)
			
			return;
		
		if(L==n)
		{
			if(total/2 == sum)
			{
				answer = "YES";
				flag = true;
			}
		}
		else
		{
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	public static void main(String[] args){
		합이같은부분집합2 T = new 합이같은부분집합2();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}