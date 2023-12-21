package String_문자열;
import java.util.*;
public class Inflearn1_1 {
	public int Solution(String str, char x)
	{
		int answer = 0;
		str = str.toUpperCase();
		x = Character.toUpperCase(x);
		for(char c : str.toCharArray())
		{
			if(x == c)
			{
				answer ++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn1_1 T = new Inflearn1_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char x = sc.next().charAt(0);
		System.out.println(T.Solution(str, x));
	}

}
