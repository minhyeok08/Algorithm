package Inflearn.배열;
import java.util.*;
public class 보이는학생 {
	public int Solution(int n, int[] arr)
	{
		int answer = 1;
		int max = arr[0];
		
		for(int i=1; i<n; i++)
		{
			if(max < arr[i])
			{
				answer ++;
				max = arr[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		보이는학생 T = new 보이는학생();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(T.Solution(n, arr));
	}

}
