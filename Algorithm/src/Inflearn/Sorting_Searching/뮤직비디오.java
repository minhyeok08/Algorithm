package Inflearn.Sorting_Searching;
import java.util.*;
import java.util.stream.Stream;
public class 뮤직비디오 {
	public int Check(int[] arr, int capacity)
	{
		int cnt = 1, sum = 0;
		for(int x : arr)
		{
			if(sum + x > capacity)
			{
				cnt++;
				sum = x;
			}
			else
			{
				sum += x;
			}
			
		}
		return cnt;
	}
	public int Solution(int n, int m, int[] arr)
	{
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		while(lt <= rt)
		{
			int mid = (lt+rt)/2;
			if(Check(arr, mid) <= m)
			{
				answer = mid;
				rt = mid-1;
			}
			else
			{
				lt = mid+1;
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		뮤직비디오 T = new 뮤직비디오();
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
