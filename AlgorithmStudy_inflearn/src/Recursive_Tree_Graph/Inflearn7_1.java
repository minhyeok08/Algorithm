package Recursive_Tree_Graph;
import java.util.*;
class Inflearn7_1 {
	public void DFS(int n){
		if(n==0) return;	// 함수 종료
		else{
			DFS(n-1);
			System.out.print(n+" ");
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		Inflearn7_1 T = new Inflearn7_1();
		T.solution(3);
		//System.out.println(T.solution(3));
	}	
}

/*
 *	재귀함수는 스택 프레임을 사용한다 
 */
