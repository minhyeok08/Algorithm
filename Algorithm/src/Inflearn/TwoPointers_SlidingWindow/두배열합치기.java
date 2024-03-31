package Inflearn.TwoPointers_SlidingWindow;
/*
3
1 3 5
5
2 3 6 7 9

1 2 3 3 5 6 7 9
 */
import java.util.*;
public class 두배열합치기 {
	public ArrayList<Integer> Solution(int n, int m, int[] arr, int[] arr2)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m)
		{
			if(arr[p1] < arr2[p2])
			{
				answer.add(arr[p1]);
				p1++;
			}
			else
			{
				answer.add(arr2[p2]);
				p2++;
			}	
		}
		
		while(p2 < m)
		{
			answer.add(arr2[p2]);
			p2++;
		}
		
		while(p1 < n)
		{
			answer.add(arr[p1]);
			p1++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		두배열합치기 T = new 두배열합치기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}		
		int m = sc.nextInt();
		int[] arr2 = new int[m];		
		for(int i=0; i<m; i++)
		{
			arr2[i] = sc.nextInt();
		}
		for(int x : T.Solution(n, m, arr, arr2))
		{
			System.out.print(x + " ");
		}
	}

}
