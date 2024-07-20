package Inflearn.Stack_Queue;

import java.util.*;
public class 교육과정설계 {	
	public String Solution(String str, String str2){
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : str.toCharArray())
		{
			Q.offer(x);
		}
		for(char x : str2.toCharArray())
		{
			if(Q.contains(x))
			{
				if(x != Q.poll())	// 필수 과목 순서 확인
					return "NO";
			}
		}
		if(!Q.isEmpty())
			// 큐에 잔여 필수 과목이 남아 있으면
			return "NO";
				
		return answer;
	}
	
	public static void main(String[] args){
		교육과정설계 T = new 교육과정설계();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(T.Solution(str, str2));
	}
}