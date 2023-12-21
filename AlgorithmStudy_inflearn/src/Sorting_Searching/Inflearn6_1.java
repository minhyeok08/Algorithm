package Sorting_Searching;
import java.util.*;
public class Inflearn6_1 {
	public int[] solution(int n, int[] arr)
	{
		for(int i=0; i<n-1; i++)	// 마지막은 굳이 돌 필요 없으므로 n-1
		{
			int index = i;	// 값을 변경해야하므로 index 값 초기화
			for(int j=i+1; j<n; j++)	// j는 i+1 부터 순회
			{
				if(arr[index] > arr[j])	
				{
					index = j;	
				}
			}
			int tmp = arr[i];	// 값 교환
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		
		return arr; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn6_1 T = new Inflearn6_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr))
		{
			System.out.print(x + " ");
		}
	}

}
/*	
 * 선택 정렬
 * 
 * 첫번째 요소 값과 나머지 요소 값 비교 // 2중 for 문을 통해 i=0 부터 j는 i+1 부터 순회 // i의 마지막 순회는 의미 없으므로 n-1 까지만 돌기
 * index 변수 따로두고, 최소값의 index값 저장
 * => index 값을 활용하여 값 교환
 */
