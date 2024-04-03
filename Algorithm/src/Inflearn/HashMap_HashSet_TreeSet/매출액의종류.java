package Inflearn.HashMap_HashSet_TreeSet;
/*
 * 7 4
20 12 20 10 23 17 10
 */
import java.util.*;
public class 매출액의종류 {
	public ArrayList<Integer> Solution(int n, int m, int[] arr)
	{	
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int lt=0; lt<m-1; lt++)	//m-1개 까지 맵에 넣기
		{
			map.put(arr[lt], map.getOrDefault(arr[lt], 0)+1);			
		}
		int lt = 0;
		for(int rt=m-1; rt<n; rt++)	// rt // m-1개 부터 하나씩 끝까지 추가
		{
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);	// lt // lt = 0 부터 하나씩 감소
			if(map.get(arr[lt])==0)	// key가 존재하지 않으면 remove
			{
				map.remove(arr[lt]);
			}
			lt++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		매출액의종류 T = new 매출액의종류();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int x : T.Solution(n, m, arr))
		{
			System.out.print(x+" ");
		}
	}

}
