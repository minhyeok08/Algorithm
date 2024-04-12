package Inflearn.Sorting_Searching;
import java.util.*;
public class 이분검색 {
	public int Solution(int n, int m, int[] arr)
	{
		int lt=0, rt=n;
		Arrays.sort(arr);

		while(lt <= rt)
		{
			int mid = (lt+rt)/2;
			if(arr[mid] == m)
				
				return mid+1;
			
			else if(arr[mid] < m)
			{
				lt = mid + 1; 
			}
			else
			{
				rt = mid - 1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		이분검색 T = new 이분검색();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(T.Solution(n, m, arr));
	}

}
