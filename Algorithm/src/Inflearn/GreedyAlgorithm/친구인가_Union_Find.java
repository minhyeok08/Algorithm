package Inflearn.GreedyAlgorithm;
import java.util.*;
// unf 배열을 둔다 , 인덱스 값이 학생 번호라고 생각하고 해당 인덱스의 배열 값이 같으면 친구라고 본다
public class 친구인가_Union_Find {
	static int[] unf;
	public static int Find(int v) {
		if(v==unf[v])
			return v;
		else
			return unf[v] = Find(unf[v]);	// unf[v]에 저장하여 리턴하면 경로 압축 => 시간 복잡도를 상당히 줄여줌
	}
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb)	// 배열 값이 다르면
			unf[fa] = fb; // 배열 값을 동일하게 하여 친구 처리
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		친구인가_Union_Find T = new 친구인가_Union_Find();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		unf = new int[n+1];
		for(int i=1; i<=n; i++)
			unf[i] = i;
		for(int i=1; i<=m; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			Union(a,b);
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa==fb)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}

}
