package Inflearn.TwoPointers_SlidingWindow;
import java.util.*;
class 연속된자연수의합_TwoPointer {	
	public int Solution(int n){
		int answer=0, sum=0;
		int m=n/2+1;
		int[] arr=new int[m];
		for(int i=0; i<m; i++) arr[i]=i+1;
		int lt=0;
		for(int rt=0; rt<m; rt++){
			sum+=arr[rt];
			if(sum==n) answer++;
			while(sum>=n){
				sum-=arr[lt++];
				if(sum==n) answer++; 
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
