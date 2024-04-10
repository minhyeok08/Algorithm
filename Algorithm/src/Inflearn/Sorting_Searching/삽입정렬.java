package Inflearn.Sorting_Searching;
/*
 * 6
11 7 5 6 10 9
--------------- tmp = 7
7 11 5 6 10 9
--------------- tmp = 5
7 11 11
7 7 11
5 7 11
j-1  j	 j+1
  	 	 i
 */
import java.util.*;
public class 삽입정렬 {
	public int[] Solution(int n, int[] arr)
	{
		for(int i=1; i<n; i++)
		{
			int tmp = arr[i], j;
			for(j=i-1; j>=0; j--)
			{
				if(arr[j] > tmp)
				{
					arr[j+1] = arr[j];
				}
				else
					break;
			}
			arr[j+1] = tmp;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		삽입정렬 T = new 삽입정렬();
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
