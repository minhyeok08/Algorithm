package Inflearn.Sorting_Searching;
import java.util.*;
public class 중복확인2 {
	public String Solution(int n, int[] arr)
	{
		String answer = "U";
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int x: arr)
		{
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(int x : map.values())
		{
			if(x > 1)
				return "D";
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		중복확인2 T = new 중복확인2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(T.Solution(n, arr));
	}

}
