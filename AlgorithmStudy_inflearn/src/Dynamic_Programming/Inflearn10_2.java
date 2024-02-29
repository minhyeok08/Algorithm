package Dynamic_Programming;
import java.util.*;
class Inflearn10_2{
	static int[] dy;
	public int solution(int n){
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n+1; i++) 
			dy[i] = dy[i-2] + dy[i-1];
		return dy[n+1];
	}

	public static void main(String[] args){
		Inflearn10_2 T = new Inflearn10_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+2];
		System.out.print(T.solution(n));
	}
}