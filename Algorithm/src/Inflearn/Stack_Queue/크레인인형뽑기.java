package Inflearn.Stack_Queue;
/*
 * 5
0 0 0 0 0
0 0 1 0 3
0 2 5 0 1
4 2 4 4 2
3 5 1 3 1
8
1 5 3 5 1 2 1 4
 */
import java.util.*;
public class 크레인인형뽑기 {	
	
	public int Solution(int[][] arr, int[] moves){
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		for(int pos : moves)
		{
			for(int i=0; i<arr.length; i++)
			{
				int tmp = arr[i][pos-1];
				arr[i][pos-1] = 0;
				if(!stack.isEmpty() && stack.peek()==tmp)	// 추출한 인형이 스택의 인형과 같을 때 // 경우의수 확실한것부터 처리 나머지 else처리
				{
					answer += 2;
					stack.pop();
				}
				else
				{
					stack.push(tmp);					
				}
				break;
			}
		}
		return answer;
	}


	public static void main(String[] args){
		크레인인형뽑기 T = new 크레인인형뽑기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++)
		{
			moves[i] = sc.nextInt();
		}
		System.out.println(T.Solution(arr, moves));
	}
}