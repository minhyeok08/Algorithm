package Inflearn.Recursive_Tree_Graph;

public class 부분집합구하기_DFS {
	static int n;
	static int ch[];
	public void DFS(int L)
	{
		if(L == n+1)
		{
			String tmp = "";
			for(int i=1; i<=n; i++)
			{
				if(ch[i]==1)
				tmp += (i+" ");
			}
			if(tmp.length()>0)
			{
				System.out.println(tmp);
			}
		}
		else
		{
			ch[L] = 1;	// 해당 L값 사용 부분 집합시 ch배열 1로 변환
			DFS(L+1);
			ch[L] = 0;	// 해당 L값 미사용 부분 집합시 ch배열 0로 변환
			DFS(L+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		부분집합구하기_DFS T = new 부분집합구하기_DFS();
		n = 3;
		ch = new int[n+1];
		T.DFS(1);
	}

}
