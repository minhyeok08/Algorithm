package Inflearn.배열;
import java.util.*;
public class 피보나치수열 {
	public int[] Solution(int n)
	{
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2; i<n; i++)
		{
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		피보나치수열 T = new 피보나치수열();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int x : T.Solution(n))
		{
			System.out.print(x+ " ");
		}
	
	}

}
