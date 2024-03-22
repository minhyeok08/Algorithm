package Inflearn.문자열;

import java.util.Scanner;

public class 문장속단어 {
	public String Solution(String str)
	{
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		for(String x : s)
		{
			int len = x.length();
			if(len > m)
			{
				m = len;
				answer = x;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문장속단어 T = new 문장속단어();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.Solution(str));
	}

}
