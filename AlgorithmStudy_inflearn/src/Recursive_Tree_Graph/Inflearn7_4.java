package Recursive_Tree_Graph;
import java.util.*;
/*	for문 활용 피보나치 vs 기존 값 활용 피보나치(메모이제이션) => 기존 저장 값 활용하기 때문에 후자가 성능면에서 월등
class Inflearn7_4 {
	public int DFS(int n){
		if(n==1) 
			return 1;
		else if(n==2)
			return 1;
		else 
			return DFS(n-2)+DFS(n-1);	
	}
	public static void main(String[] args){
		Inflearn7_4 T = new Inflearn7_4();
		int n=5;
		for(int i=1; i<=n; i++)
		{
			System.out.print(T.DFS(i)+" ");
		}
	}	
}
*/
class Inflearn7_4 {
	static int[] fibo;
	public int DFS(int n){		
		if(fibo[n]>0)
			return fibo[n];
		if(n==1) 
			return fibo[n]=1;
		else if(n==2)
			return fibo[n]=1;
		else 
			return fibo[n]=DFS(n-2)+DFS(n-1);	
	}
	public static void main(String[] args){
		Inflearn7_4 T = new Inflearn7_4();
		int n=45;
		fibo = new int[n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++)
		{
			System.out.print(fibo[i]+" ");
		}
	}	
}
