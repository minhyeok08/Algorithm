package Inflearn.문자열;

import java.util.*;

public class 가장짧은문자거리 {
	public ArrayList<Integer> Solution(String str, char c)
	{
		ArrayList<Integer> answer = new ArrayList<>();		
		
		int p = 1000;
		for(int i=0; i<str.length(); i++)	// 좌측배열부터 타겟문자까지의 거리
		{
			if(str.charAt(i)!=c)
			{
				answer.add(++p);
			}
			else
			{
				p = 0;
				answer.add(p);
			}
		}
		p = 1000;
		for(int i=str.length()-1; i>=0; i--)	// 우측배열부터 타겟문자까지의 거리
		{
			if(str.charAt(i)!=c)
			{
				if(str.charAt(i)!=c)
					
				answer.set(i , Math.min(answer.get(i), ++p));
			}
			else
			{
				p = 0;
				answer.set(i,p);
			}
		}
		return answer;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		가장짧은문자거리 T = new 가장짧은문자거리();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for(Integer x : T.Solution(str, c))
		{
			System.out.print(x+" ");
		}
	}

}
