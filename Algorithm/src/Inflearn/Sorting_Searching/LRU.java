package Inflearn.Sorting_Searching;

import java.util.*;
public class LRU {
	public int[] Solution(int n, int m, int[] arr)
	{
		int[] cache = new int[n];
		for(int x : arr)
		{
			int pos = -1;
			for(int i=0; i<n; i++)
			{
				if(x==cache[i])	// cache 안에 작업 존재할 경우
				{
					pos = i;	// 위치 index 저장				
				}
			}
			if(pos == -1)	// cache에 없을 때
			{
				for(int i=n-1; i>=1; i--)	// 캐시의 존재하는 작업 한칸 씩 뒤로 밀고 cache[0]에 x 삽입
				{
					cache[i] = cache[i-1];
				}
			}
			else	// cache에 있을 때
			{
				for(int i=pos; i>=1; i--)	// 해당 작업의 index이전의 값들을 뒤로 한칸씩 밀어서 cache[0]에 갱신할 공간 마련	
				{
					cache[i] = cache[i-1];
				}
			}
			cache[0] = x;
		}
		return cache;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU T = new LRU();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];
		for(int i=0; i<m; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int x : T.Solution(n, m, arr))
		{
			System.out.print(x+" ");
		}
	}

}
