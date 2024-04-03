package Inflearn.HashMap_HashSet_TreeSet;
import java.util.*;
public class 아나그램 {
	public String Solution(String str, String str2)
	{	
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character x : str.toCharArray())
		{
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(Character x : str2.toCharArray())
		{
			if(!map.containsKey(x) || map.get(x)==0)	// 맵에 해당 key 값이 없거나 key 값이 차감되어 개수가 맞지 않는 경우 NO
			{
				return "NO";
			}
			map.put(x, map.get(x)-1);	// 해당 key 값이 존재하면 value 값 차감
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		아나그램 T = new 아나그램();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = sc.next();
		System.out.println(T.Solution(str, str2));
		
	}

}
