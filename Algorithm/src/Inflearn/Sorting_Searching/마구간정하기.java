package Inflearn.Sorting_Searching;
import java.util.*;
/*
 * 5 3
1 2 8 4 9
1 2 4 8 9 => 3
 */
public class 마구간정하기 {
	public int Check(int[] arr, int dist)
	{
		int cnt = 1, ep = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] - ep >= dist)
			{
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	public int Solution(int n, int m, int[] arr)
	{
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1, rt = Arrays.stream(arr).max().getAsInt();
		while(lt <= rt)
		{
			int mid = (lt+rt)/2;
			if(Check(arr, mid) >= m)
			{
				answer = mid;
				lt = mid + 1;
			}
			else
			{
				rt = mid - 1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		마구간정하기 T = new 마구간정하기();
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
