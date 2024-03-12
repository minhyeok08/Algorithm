package Dynamic_Programming;
import java.util.*;
class Inflearn10_5{
	static int n, m;
	static int[] dy;
	public int solution(int[] coin){
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i=0; i<n; i++){
			for(int j=coin[i]; j<=m; j++){
				dy[j] = Math.min(dy[j], dy[j-coin[i]] + 1);
			}
		}
		return dy[m];
	}

	public static void main(String[] args){
		Inflearn10_5 T = new Inflearn10_5();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		m = sc.nextInt();
		dy = new int[m+1];
		System.out.print(T.solution(arr));
	}
}