package Sorting_Searching;
import java.util.*;
class Inflearn6_4 {	
	public int[] solution(int size, int n, int[] arr){
		int[] cache = new int[size];
		for(int x : arr)
		{
			int pos=-1;
			
			for(int i=0; i<size; i++)
			{
				if(x==cache[i])	// 캐시에 x값이 있으면
				{
					pos=i;	// x 인덱스 값 저장
				}				
			}
			
			if(pos==-1)	// 캐시에 x값이 없다면
			{	
				for(int i=size-1; i>=1; i--)
				{
					cache[i]=cache[i-1];	// cash에 있는 값들 모두 뒤로 한칸씩 밀기
				}
			}
			else	// 캐시에 x값이 있다면
			{
				for(int i=pos; i>=1; i--)	// 이미 존재하는 x의 인덱스 값 부터 한칸씩 밀기
				{
					cache[i]=cache[i-1];	
				}
			}
			cache[0]=x;	// x값을 가장 처음에 넣기
		}
		return cache;
	}
	public static void main(String[] args){
		Inflearn6_4 T = new Inflearn6_4();
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int x : T.solution(size, n, arr)) 
		{
			System.out.print(x + " ");	
		}
	}
}