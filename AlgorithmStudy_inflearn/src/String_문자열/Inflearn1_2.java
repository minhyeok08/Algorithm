package String_문자열;
import java.util.*;
public class Inflearn1_2 {
	public String Solution(String src)
	{
		String answer = "";
		for(char x : src.toCharArray())
		{
			if(Character.isLowerCase(x))
			{
				answer += Character.toUpperCase(x);
			}
			else
			{
				answer += Character.toLowerCase(x);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn1_2 T = new Inflearn1_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.Solution(str));
	}

}
