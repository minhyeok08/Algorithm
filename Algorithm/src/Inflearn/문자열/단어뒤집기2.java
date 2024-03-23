package Inflearn.문자열;

import java.util.*;

public class 단어뒤집기2 {
	public ArrayList<String> Solution(int n, ArrayList<String> al)
	{
		ArrayList<String> answer = new ArrayList<>();
		for(String x : al)
		{
			int lt=0, rt=x.length()-1;
			char[] c = x.toCharArray();
			
			while(lt < rt)
			{
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(c); // char배열에서 toString은 주소값 반환
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		단어뒤집기2 T = new 단어뒤집기2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> al = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			al.add(sc.next());
		}
		for(String s : T.Solution(n, al))
		{
			System.out.println(s);
		}
	}

}
