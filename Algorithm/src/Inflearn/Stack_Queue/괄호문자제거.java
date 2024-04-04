package Inflearn.Stack_Queue;

import java.util.*;
public class 괄호문자제거 {	
	public String Solution(String str){
		String answer="";
		Stack<Character> stack = new Stack<>();
		for(Character x : str.toCharArray())
		{
			if(x==')')
			{
				while(stack.pop()!='(');	// '('까지 제거한 뒤 stop			
			}
			else
				stack.push(x);
		}
		for(int i=0; i<stack.size(); i++)
		{
			answer += stack.get(i);
		}
		return answer;
	}

	public static void main(String[] args){
		괄호문자제거 T = new 괄호문자제거();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}