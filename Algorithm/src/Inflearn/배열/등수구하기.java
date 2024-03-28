package Inflearn.배열;
import java.util.*;

public class 등수구하기 {
	public int[] Solution(int n, int[] arr)
	{
		int[] answer = new int[n];
		int cnt = 0;
		for(int i=0; i<n; i++)
		{
			cnt = 1;
			for(int j=0; j<n; j++)
			{
				if(arr[i] < arr[j])
				{
					cnt ++;
				}
			}
			answer[i] = cnt;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		등수구하기 T = new 등수구하기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int x : T.Solution(n, arr))
		{
			System.out.print(x + " ");
		}
	}

}
