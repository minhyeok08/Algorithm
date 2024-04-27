package Inflearn.Recursive_Tree_Graph;

public class 이진수출력 {
	
	public void DFS(int n)
	{
		if(n == 0)
			return;
		else
		{
			DFS(n/2);
			System.out.print(n%2);
		}
		
	}
	public void Solution(int n)
	{
		DFS(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		이진수출력 T = new 이진수출력();
		T.Solution(10);
	}

}
