package Sorting_Searching;
import java.util.*;
class Inflearn6_5 {	
	public String solution(int n, int[] arr){
		String answer = "U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++)
		{
			if(arr[i]==arr[i+1])
				return "D";
		}
		return answer;
	}
	public static void main(String[] args){
		Inflearn6_5 T = new Inflearn6_5();
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}