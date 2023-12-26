package Sorting_Searching;
import java.util.*;
public class Inflearn6_3 {
	public int[] solution(int n, int[] arr)
	{
		for(int i=1; i<n; i++)	// 현재값 인덱스 배열 1부터 시작
		{
			int tmp = arr[i];	// 현재값 tmp에 저장
			int j;	// j for문 밖에 선언하여 for문 끝난 후에도 사용할 수 있게함
			
			for(j=i-1; j>=0; j--)	// 비교대상값은 현재값보다 하나 전부터 // j값이 인덱스 0값이 될때까지 // j--
			{
				if(arr[j] > tmp)	// 현재 값이 비교 대상값 보다 작다면
				{
					arr[j+1] = arr[j];	// arr[j] 값을 한 칸 뒤로 저장 반복
				}
				else	// 현재 값이 비교 대상 값보다 크다면 멈추고
					break;		
			}
			arr[j+1] = tmp;	// 현재 값을 arr[j+1]에 삽입
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn6_3 T = new Inflearn6_3();
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

