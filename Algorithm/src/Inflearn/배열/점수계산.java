package Inflearn.배열;
import java.util.*;
// 10
//1 0 1 1 1 0 0 1 1 0 // 1 0 1 2 3 0 0 1 2 0 // => 10
public class 점수계산 {
	public int Solution(int n, int[] arr)
	{
		int answer = 0;
		int cnt = 0;
		for(int i=0; i<n; i++)
		{
			if(arr[i]==1)
			{
				cnt ++;
				answer += cnt;
			}
			else
				cnt = 0;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		점수계산 T = new 점수계산();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		for(int i=1; i<n+1; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(T.Solution(n, arr));
	}

}
