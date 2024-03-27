package Inflearn.배열;
import java.util.*;
public class 큰수출력하기 {
	public ArrayList<Integer> Solution(int n, int[] arr)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i<n; i++)
		{
			if(arr[i] > arr[i-1])
			{
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		큰수출력하기 T = new 큰수출력하기();
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
