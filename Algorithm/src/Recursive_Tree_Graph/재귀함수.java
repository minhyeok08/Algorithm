package Recursive_Tree_Graph;
public class 재귀함수 {
	public void Recursive(int n)
	{
		if(n == 0)
			return;
		else
		{
			// System.out.print(n+" "); 3 2 1 이 출력됨
			Recursive(n-1);
			System.out.print(n+" ");
		}
	}
	public void Solution(int n)
	{
		Recursive(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		재귀함수 T = new 재귀함수();
		T.Solution(3);
	}

}
