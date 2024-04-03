package Inflearn.HashMap_HashSet_TreeSet;
//10 3
//13 15 34 23 45 65 33 11 26 42
//treeset => 중복제거 / 레드블랙트리 / null 허용 x
import java.util.*;
public class K번째큰수 {
	public int Solution(int n, int m, int[] arr)
	{	
		int answer = -1;
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());	// 내림차순	 // 디폴트는 오름차순 
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				for(int k=j+1; k<n; k++)
				{
					tset.add(arr[i] + arr[j] + arr[k]);
				}
			}
		}
		//tset.remove(13); // 해당값 삭제
		//tset.size(); // 원소 개수
		//tset.first(); // tset의 첫번째값 // 오름차순 내림차순에 따라 달라짐
		//tset.last(); // tset의 마지막값
		
		int cnt = 0;
		for(int x : tset)
		{
			cnt ++;
			if(cnt == m)
			{
				return x;
			}
				
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K번째큰수 T = new K번째큰수();
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
