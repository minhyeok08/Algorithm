package Inflearn.배열;
import java.util.*;
public class 소수_에라토스테네스체 {
	public int Solution(int n)
	{
		int answer = 0;
		int[] ck = new int[n+1];
		for(int i=2; i<n+1; i++)
		{
			if(ck[i]==0)
				answer ++;
			for(int j=i; j<n+1; j=j+i)
			{
				ck[j] = 1;
			}
				
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		소수_에라토스테네스체 T = new 소수_에라토스테네스체();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
			System.out.print(T.Solution(n));
	}

}
