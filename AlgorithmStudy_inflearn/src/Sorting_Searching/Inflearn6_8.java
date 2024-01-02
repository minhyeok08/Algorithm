package Sorting_Searching;
import java.util.*;
class Inflearn6_8 {
	public int solution(int n, int m, int[] arr){
		int answer=0;
		Arrays.sort(arr);
		int lt=0, rt=n-1;
		while(lt<=rt){	// lt 가 rt보다 작거나 같을 때까지 반복
			int mid=(lt+rt)/2;	//중간 값 설정
			if(arr[mid]==m){	// 배열 중간의 값과 m값이 일치하면 중지
				answer=mid+1;
				break;
			}
			if(arr[mid]>m) rt=mid-1;	// 배열 중간값이 m보다 크면	중간값 -1
			else lt=mid+1;	// 작다면 lt에 mid+1 하여 검색범위 축소
		}
		return answer;
	}
	public static void main(String[] args){
		Inflearn6_8 T = new Inflearn6_8();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		System.out.println(T.solution(n, m, arr));
	}
}