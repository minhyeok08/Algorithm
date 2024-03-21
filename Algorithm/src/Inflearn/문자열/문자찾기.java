package Inflearn.문자열;

import java.util.Scanner;

public class 문자찾기 {
	public int Solution(String str, char c)
	{
		int answer = 0;
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==c)
			{
				answer ++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문자찾기 T = new 문자찾기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		System.out.println(T.Solution(str, c));
	}

}
