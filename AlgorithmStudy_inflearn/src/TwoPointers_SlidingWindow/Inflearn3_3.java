package TwoPointers_SlidingWindow;
import java.util.*;
class Inflearn3_3 {	
	public int solution(int n, int k, int[] arr){
		int answer, sum=0;
		for(int i=0; i<k; i++) 
			sum+=arr[i];
			answer=sum;
		for(int i=k; i<n; i++){
			sum += (arr[i] - arr[i-k]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args){
		Inflearn3_3 T = new Inflearn3_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}