package Inflearn.Stack_Queue;
// 후위식 연산 => 스택 표현
// 숫자 => push 연산자 => 계산
// 먼저 pop한 것 rt 그 다음 pop한 것 lt로 두어서 lt - rt가 될 수 있게끔 (순서 중요)
// 연산 후 다시 push
import java.util.*;
public class 후위식연산 {	
	public int Solution(String str){
		int answer = 0;
		int n, lt, rt, tmp;
		Stack<Integer> stack = new Stack<>();
		for(Character x : str.toCharArray())
		{			
			if(x.isDigit(x))
			{
				n = x-48;
				stack.push(n);
			}
			else
			{
				rt = stack.pop();				
				lt = stack.pop();
				if(x=='+')
				{
					tmp = lt + rt;
				}
				else if(x=='-')
				{
					tmp = lt - rt;
				}
				else if(x=='*')
				{
					tmp = lt * rt;
				}
				else
				{
					tmp = lt / rt;
				}
				stack.push(tmp);
			}
		}
		answer = stack.pop();
		return answer;
	}

	public static void main(String[] args){
		후위식연산 T = new 후위식연산();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}
}