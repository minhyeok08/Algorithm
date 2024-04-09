package Inflearn.Sorting_Searching;
import java.util.*;
public class 버블정렬 {
	public int[] Solution(int n, int[] arr)
	{
		for(int i=0; i<n-1; i++)	// 마지막요소는 항상 큰 수로 정렬되므로 n-1
		{
			for(int j=0; j<n-i-1; j++)	// 한 번 순회될 때 마다 배열 뒤부터 정렬 되므로 n-i-1
			{
				if(arr[j] > arr[j+1])
				{
					int tmp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		버블정렬 T = new 버블정렬();
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
