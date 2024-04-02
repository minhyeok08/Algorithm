package Inflearn.TwoPointers_SlidingWindow;
/*
 * 14 2

1 1 0 0 1 1 0 1 1 0 1 1 0 1
 */
import java.util.*;
class 최대길이연속부분수열 {	
	public int Solution(int n, int k, int[] arr){
		int answer = 0, lt = 0, cnt = 0;
		for(int rt=0; rt<n; rt++)
		{
			if(arr[rt] == 0)
				cnt ++;
			while(cnt > k)
			{					
				if(arr[lt] == 0)			
				{
					cnt --;
				}
				lt ++;
			}
			answer = Integer.max(answer, rt-lt+1);
		}

		
		return answer;
	}

	public static void main(String[] args){
		최대길이연속부분수열 T = new 최대길이연속부분수열();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print(T.Solution(n, k, arr));
	}
}
