package Inflearn.문자열;

import java.util.Scanner;

public class 유효한팰린드롬 {
	public String Solution(String str)
	{
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp))
		{
			answer = "YES";
		}
		return answer;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		유효한팰린드롬 T = new 유효한팰린드롬();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.Solution(str));
	}

}
