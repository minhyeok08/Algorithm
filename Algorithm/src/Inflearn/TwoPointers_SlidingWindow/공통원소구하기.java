package Inflearn.TwoPointers_SlidingWindow;
/*
5
1 3 9 5 2
5
3 2 5 7 8
/////////

1 2 3 5 9
2 3 5 7 8
* 

2 3 5
 */
import java.util.*;
public class 공통원소구하기 {
	public ArrayList<Integer> Solution(int n, int m, int[] arr, int[] arr2)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int p1 = 0, p2 = 0;
		while(p1 < n && p2 < m)
		{
			if(arr[p1] < arr2[p2])
			{
				p1++;
			}
			else if(arr2[p2] < arr[p1])
			{
				p2++;
			}
			else
			{
				answer.add(arr[p1]);
				p1++;
				p2++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		공통원소구하기 T = new 공통원소구하기();
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
