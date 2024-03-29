package DFS_BFS_활용;
import java.util.*;
class Inflearn8_9{
	static int[] combi;
	static int n, m;
	public void DFS(int L, int s)
	{
		if(L==m)
		{
			for(int x : combi) 
				System.out.print(x+" ");
			System.out.println();
		}
		else
		{
			for(int i=s; i<=n; i++)
			{
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	public static void main(String[] args){
		Inflearn8_9 T = new Inflearn8_9();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];
		T.DFS(0, 1);
	}
}