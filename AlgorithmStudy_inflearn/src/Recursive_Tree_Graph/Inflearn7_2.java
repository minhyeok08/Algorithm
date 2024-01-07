package Recursive_Tree_Graph;
import java.util.*;
class Inflearn7_2 {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n/2);
			System.out.print(n%2+" ");	// 7라인 보다 뒤에 두어 스택프레임 적용하여 역순으로 나머지 값 출력
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		Inflearn7_2 T = new Inflearn7_2();
		T.solution(11);
		//System.out.println(T.solution(3));
	}	
}
