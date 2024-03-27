package Inflearn.문자열;

import java.util.*;

public class 암호 {
	public String Solution(int n, String str)
	{
		String answer = "";
		for(int i=0; i<n; i++)
		{
			String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');	// 인덱스 0부터 6까지 추출 후 문자 변환
			int num = Integer.parseInt(tmp, 2);	// 2진수 tmp를 10진수 정수로 변환
			//System.out.println(num);
			char x = (char)num;	// 문자로 변환
			//System.out.print(x);
			answer += x;
			
			str = str.substring(7);	// 인덱스 7부터 끝까지 자르기
		}
		
		return answer;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		암호 T = new 암호();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.print(T.Solution(n,str));
	}

}
