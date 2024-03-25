package Inflearn.문자열;

import java.util.Scanner;

public class 숫자만추출 {
	/*public int Solution(String str)
	{
		String answer = "";		
		// str = str.toUpperCase().replaceAll("[A-Z]", "");
		char[] c = str.toCharArray();
		for(char x : c)
		{
			if(Character.isDigit(x))
				answer += x;
		}
		
		return Integer.parseInt(answer);	
	}*/
	public int Solution(String str)
	{
		int answer = 0;
		for(char x : str.toCharArray())
		{
			/*if(x >= 48 && x<= 57)
			{
				answer = answer * 10 + (x-48);
			}*/
			if(Character.isDigit(x))
			{
				answer = answer * 10 + Character.getNumericValue(x);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		숫자만추출 T = new 숫자만추출();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}

}
