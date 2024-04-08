package Inflearn.Stack_Queue;

import java.util.*;
public class 공주구하기 {	
	public int Solution(int n, int m){
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		for(int i=1; i<=n; i++)
		{
			Q.offer(i);
		}
		while(Q.size()!=1)
		{
			for(int i=1; i<m; i++)
			{
				Q.offer(Q.poll());
			}
			Q.poll();
		}
		answer = Q.poll();
				
		return answer;
	}
	
	public static void main(String[] args){
		공주구하기 T = new 공주구하기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(T.Solution(n, m));
	}
}