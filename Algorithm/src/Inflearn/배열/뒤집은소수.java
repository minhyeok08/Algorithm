package Inflearn.배열;
import java.util.*;
public class 뒤집은소수 {
	public boolean isPrime(int x)	// 소수 판별
	{
		if(x==1)
			
			return false;
		
		for(int i=2; i<x; i++)	// num이 특정 정수로 나눠지면 소수 x
		{
			if(x%i==0)
			
			return false;
			
		}
		return true;
	}
	public ArrayList<Integer> Solution(int n, int[] arr)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			int tmp = arr[i];
			int res = 0;
			while(tmp > 0)
			{
				int t = tmp % 10;	// ex) 234에서 4를 추출
				res =  res * 10 + t;	//	4를 res에 저장
				tmp = tmp / 10;		//	23을 tmp에 저장 후 while 반복
			}
			if(isPrime(res))
				answer.add(res);	// 소수라면 answer에 추가
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		뒤집은소수 T = new 뒤집은소수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int x : T.Solution(n, arr))
		{
			System.out.print(x+" ");
		}
	}

}
