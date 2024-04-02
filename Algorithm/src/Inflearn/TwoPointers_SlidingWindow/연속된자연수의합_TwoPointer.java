package Inflearn.TwoPointers_SlidingWindow;
// 7+8=15
// 4+5+6=15
// 1+2+3+4+5=15

import java.util.*;
class 연속된자연수의합_TwoPointer {	
	public int Solution(int n){
		int answer = 0, sum = 0, lt = 1, len = n/2+1;
		int[] arr = new int[len+1];
		for(int i=1; i<=len; i++)
		{
			arr[i] = i;
		}
		for(int rt=1; rt<=len; rt++)
		{
			sum += arr[rt];
			if(sum == n)
				answer ++;
			while(sum >= n)
			{
				sum -= arr[lt++];
				if(sum == n)
					answer ++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args){
		연속된자연수의합_TwoPointer T = new 연속된자연수의합_TwoPointer();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(T.Solution(n));
	}
}
