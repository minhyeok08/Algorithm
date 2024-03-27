package Inflearn.배열;
import java.util.*;
public class 가위바위보 {
	public String Solution(int n, int[] a, int[] b)
	{
		String answer = "";
		// 가위 : 1, 바위 : 2,  보 : 3
		for(int i=0; i<n; i++)
		{
			if(a[i]==b[i])
				answer += "D";
			else if(a[i]==1 && b[i]==2)
				answer += "B";
			else if(a[i]==2 && b[i]==3)
				answer += "B";
			else if(a[i]==3 && b[i]==1)
				answer += "B";
			else
				answer += "A";
		}	
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		가위바위보 T = new 가위바위보();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			b[i] = sc.nextInt();
		}
		for(char x : T.Solution(n, a, b).toCharArray())
		{
			System.out.println(x);
		}
	}

}
