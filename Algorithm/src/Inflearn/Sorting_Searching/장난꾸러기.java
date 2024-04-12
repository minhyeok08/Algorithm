package Inflearn.Sorting_Searching;
import java.util.*;
public class 장난꾸러기 {
	public ArrayList<Integer> Solution(int n, int[] arr)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for(int i=0; i<n; i++)
		{
			if(tmp[i]!=arr[i])
			{
				answer.add(i+1);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		장난꾸러기 T = new 장난꾸러기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int x : T.Solution(n, arr))
		{
			System.out.print(x + " ");
		}
	}

}
