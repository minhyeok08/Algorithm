package Sorting_Searching;
import java.util.*;
class Point implements Comparable<Point>
{
	public int x, y;
	Point(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point O)
	{
		if(this.x==O.x)	// x값이 같을 때 y값 정렬
			return this.y-O.y;
		else		// y값이 같을 때 x값 정렬
			return this.x-O.x;
	}
}
public class Inflearn6_7 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn6_7 T = new Inflearn6_7();
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Point(x, y));	// point 객체 생성하여 리스트에 추가
		}
		Collections.sort(arr);	// 리스트 내의 객체 순서 정렬
		for(Point O : arr)
		{
			System.out.println(O.x+" "+O.y);
		}
	}
}
