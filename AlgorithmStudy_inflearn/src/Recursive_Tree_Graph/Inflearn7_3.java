package Recursive_Tree_Graph;
import java.util.*;
class Inflearn7_3 {
	public int DFS(int n){
		if(n==1) 
			return 1;	// 종료
		else 
			return n*DFS(n-1);	// 5*4*3*2*1
	}
	public static void main(String[] args){
		Inflearn7_3 T = new Inflearn7_3();
		System.out.println(T.DFS(5));
	}	
}
