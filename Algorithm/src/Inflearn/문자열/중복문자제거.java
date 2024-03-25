package Inflearn.문자열;

import java.util.Scanner;

public class 중복문자제거 {
	public String Solution(String str)
	{
		String answer = "";
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.indexOf(str.charAt(i))==i)	// 문자가 처음으로 등장한 경우 // indexOf는 문자열에서 처음으로 등장한 문자의 인덱스 값 반환
			{
				answer += str.charAt(i);
			}
				
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		중복문자제거 T = new 중복문자제거();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}

}
