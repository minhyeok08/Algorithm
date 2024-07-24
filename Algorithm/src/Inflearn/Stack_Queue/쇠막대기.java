package Inflearn.Stack_Queue;

import java.util.*;
public class 쇠막대기 {	
	public int Solution(String str){
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++)	// stack에 '('만 넣을것이니까 for문으로 돌리고 str.charAt처리
		{
			if(str.charAt(i)=='(')
			{
				stack.push('(');
			}
			else
			{
				stack.pop();
				if(str.charAt(i-1)=='(')
				{
					answer += stack.size();
				}
				else
				{
					answer += 1;
				}
			}
		}		
		
		return answer;
	}
	
	public static void main(String[] args){
		쇠막대기 T = new 쇠막대기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}