package Inflearn.문자열;
import java.util.*;
public class 대소문자변환 {

	public String Solution(String str)
	{
		String answer = "";
		for(char c : str.toCharArray())
		{
			if(Character.isLowerCase(c))
			{
				answer += Character.toUpperCase(c);
			}
			else
				answer += Character.toLowerCase(c);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		대소문자변환 T = new 대소문자변환();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.Solution(str));
	}
}
