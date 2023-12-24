package Sorting_Searching;
import java.util.*;
public class Inflearn6_2 {
	public int[] solution(int n, int[] arr)
	{
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)	// 회차마다 제일 우측 고정 값 증가
			{
				if(arr[j] > arr[j+1])	// 첫번째 두번째 값 비교
				{
					int tmp = arr[j];	// 교환
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn6_2 T = new Inflearn6_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr))
		{
			System.out.print(x + " ");
		}
	}

}

