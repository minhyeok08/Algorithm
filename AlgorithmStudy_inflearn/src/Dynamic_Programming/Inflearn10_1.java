package Dynamic_Programming;
import java.util.*;
class Inflearn10_1{
	static int[] dy;
	public int solution(int n){
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n; i++) 
			dy[i] = dy[i-2] + dy[i-1];
		return dy[n];
	}

	public static void main(String[] args){
		Inflearn10_1 T = new Inflearn10_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+1];
		System.out.print(T.solution(n));
	}
}
