package HashMap_HashSet_TreeSet;
import java.util.*;
public class 학급회장_Hash {
	public Character Solution(int n, String str)
	{	
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray())
		{
			map.put(x, map.getOrDefault(x, 0)+1);	// key 값이 존재하면 value + 1, 없다면 1로 세팅
		}
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet())	// 맵의 key값 추출
		{
			/*
			int cnt = map.get(key);
			if(cnt > max)
			{
				max = cnt;
				answer = key;
			}
			*/
			if(map.get(key) > max)
			{
				max = map.get(key);
				answer = key;
			}
		}

		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		학급회장_Hash T = new 학급회장_Hash();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.Solution(n, str));
		
	}

}
