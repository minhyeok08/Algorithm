package Inflearn.문자열;

import java.util.Scanner;

public class 회문문자열 {
	public String Solution(String str)
	{
		String answer = "YES";
		str = str.toUpperCase();
		char[] c = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt < rt)
		{
			if(c[lt]!=c[rt])
			{
				return "NO";
			}			
			
			lt++;
			rt--;				
		}
		return answer;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		회문문자열 T = new 회문문자열();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}

}
