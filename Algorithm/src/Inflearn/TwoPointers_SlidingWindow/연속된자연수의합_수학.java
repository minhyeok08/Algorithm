package Inflearn.TwoPointers_SlidingWindow;
// 7+8=15
// 4+5+6=15
// 1+2+3+4+5=15

// 1,2 연속된 자연수 2개 => 15-3 연속된 자연수 1,2의 합을 n에서 뺌 => 12 / 2 % 0? 그 결과 값이 2로 나눠지면=> 6, 6 을 1, 2 에 각각 더하면 7,8로 가능

import java.util.*;
class 연속된자연수의합_수학 {	
	public int Solution(int n){
		int answer = 0, cnt = 1; // cnt 연속된 자연수의 개수
		n--; // => 첫번째 숫자 1 제외
		while(n > 0)
		{
			cnt ++;
			n -= cnt;	// 연속된 자연수 개수만큼 n에서 빼기
			if(n%cnt == 0)
			{
				answer ++;
			}		
		}
		return answer;
	}

	public static void main(String[] args){
		연속된자연수의합_수학 T = new 연속된자연수의합_수학();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(T.Solution(n));
	}
}
