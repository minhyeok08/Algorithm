package Inflearn.문자열;

import java.util.*;

public class 문자열압축 {
	public String Solution(String str)
	{
		String answer = "";
		str = str + " ";
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				cnt ++;
			}
			else
			{
				answer += str.charAt(i);
				if(cnt>1)
					answer += cnt;
				
				cnt = 1;
			}
		}
		return answer;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문자열압축 T = new 문자열압축();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}

}
