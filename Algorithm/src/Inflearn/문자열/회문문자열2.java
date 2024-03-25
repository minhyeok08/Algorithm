package Inflearn.문자열;

import java.util.Scanner;

public class 회문문자열2 {
	public String Solution(String str)
	{
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
			{
				return "NO";
			}
		}
		return answer;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		회문문자열2 T = new 회문문자열2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}

}
