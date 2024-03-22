package Inflearn.문자열;

import java.util.Scanner;

public class 문장속단어2 {
	public String Solution(String str)
	{
		String answer = "";
		int m = Integer.MIN_VALUE;
		int pos;
		
		while((pos = str.indexOf(" "))!= -1)	// 공백이 있을 때 까지 while 반복
		{
			String tmp = str.substring(0, pos);	// 초기 단어 저장
			int len = tmp.length();
			if(len > m)
			{
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);	// 공백 이후 단어 str로 갱신
		}
		
		if(str.length() > m)	// 마지막 단어 검사
			answer = str;
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		문장속단어2 T = new 문장속단어2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.Solution(str));
	}

}
