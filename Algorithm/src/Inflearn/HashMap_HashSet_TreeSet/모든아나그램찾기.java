package Inflearn.HashMap_HashSet_TreeSet;
/*
 * bacaAacba
   abc
 */
import java.util.*;
public class 모든아나그램찾기 {
	public int Solution(String str, String str2)
	{	
		int answer = 0, len = str2.length();
		char[] arr = str.toCharArray();
		char[] arr2 = str2.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(int i=0; i<len; i++)
		{
			map2.put(arr2[i], map2.getOrDefault(arr2[i], 0)+1);
		}
		for(int i=0; i<len-1; i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		int lt = 0;
		
		for(int rt=len-1; rt<str.length(); rt++)
		{
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			if(map.equals(map2))	// map, map2 키와 밸류 값 개수와 값 일치하면 true
			{
				answer ++;
			}
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0)
			{
				map.remove(arr[lt]);
			}
			lt++;
			
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		모든아나그램찾기 T = new 모든아나그램찾기();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(T.Solution(str, str2));
		
	}

}
