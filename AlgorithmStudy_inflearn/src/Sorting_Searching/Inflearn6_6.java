package Sorting_Searching;
import java.util.*;
public class Inflearn6_6 {
	public ArrayList<Integer> solution(int n, int[] arr)
	{
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone(); // tmp에 arr 복사
		Arrays.sort(tmp);	// tmp 정렬
		for(int i=0; i<n; i++)	
		{
			if(tmp[i] != arr[i])	// 요소값 다르면
			{
				answer.add(i+1);	// 순번 추가
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn6_6 T = new Inflearn6_6();
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int x : T.solution(n, arr))
		{
			System.out.print(x + " ");
		}
	}

}
