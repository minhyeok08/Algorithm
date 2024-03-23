package Inflearn.문자열;

import java.util.*;

public class 단어뒤집기 {
	public ArrayList<String> Solution(int n, ArrayList<String> al)
	{
		ArrayList<String> answer = new ArrayList<>();
		for(String x : al)
		{
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		단어뒤집기 T = new 단어뒤집기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			al.add(sc.next());
		}
		for(String x : T.Solution(n, al))
		{
			System.out.println(x);
		}
	}

}
