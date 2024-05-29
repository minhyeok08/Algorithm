package Inflearn.DFS_BFS_활용;
import java.util.*;
public class 최대점수구하기_DFS {
	static int n, m, answer = 0;
	public void DFS(int L, int scoreSum, int timeSum, int[] score, int[] time)
	{		
		if(m < timeSum)
			return;
		
		if(L==n)
		{
			answer = Math.max(answer, scoreSum);
		}
		else
		{
			DFS(L+1, scoreSum+score[L], timeSum+time[L], score, time);
			DFS(L+1, scoreSum, timeSum, score, time);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		최대점수구하기_DFS T = new 최대점수구하기_DFS();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] score = new int[n];
		int[] time = new int[n];
		for(int i=0; i<n; i++)
		{
			score[i] = sc.nextInt();
			time[i] = sc.nextInt();
		}
		T.DFS(0, 0, 0, score, time);
		System.out.println(answer);
	}

}
