package DFS_BFS_활용;
import java.util.*;
class Inflearn8_2{
	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr){
		if(sum > c) 
			return;
		if(L == n)
		{
			answer = Math.max(answer, sum);
		}
		else
		{
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}	
	}

	public static void main(String[] args){
		Inflearn8_2 T = new Inflearn8_2();
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
	
}