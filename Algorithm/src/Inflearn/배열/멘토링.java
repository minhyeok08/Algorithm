package Inflearn.배열;
import java.util.*;
// for문으로 이중행렬의 모든 것을 순회해야하는건지 아니면 이 문제처럼 어떤 조건에 맞춰 순회해야하는건지 생각해서 for문 구성할 것
/*4 3
3 4 1 2
4 3 2 1
3 1 4 2 */
public class 멘토링 {
	public int Solution(int n, int m, int[][] arr)
	{
		int answer = 0;
		for(int i=1; i<=n; i++)	
		{
			for(int j=1; j<=n; j++)	// i,j학생 비교
			{
				int cnt = 0;
				for(int k=0; k<m; k++)	// k번 시험 시행
				{
					int pi = 0;
					int pj = 0;
					
					for(int s=0; s<n; s++)	// k번째 시험에서 i,j학생의 순위(인덱스/ 즉, s값) 찾아 저장
					{
						if(arr[k][s]==i)
							pi = s;
						else if(arr[k][s]==j)
							pj = s;
					}
					if(pi < pj)	// i학생의 등수가 j보다 높다면 cnt 증가
						cnt ++;						
				}
				if(cnt == m)	// 만약 cnt가 모든 시험 횟수(m)과 같다면 // 즉, 모든 시험에서 i의 학생의 순위(인덱스)가 j보다 높다면 멘토가능
				{
					answer ++;
				}
					
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		멘토링 T = new 멘토링();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(T.Solution(n, m, arr));
		
	}

}
