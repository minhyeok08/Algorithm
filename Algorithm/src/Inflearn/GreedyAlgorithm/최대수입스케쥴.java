package Inflearn.GreedyAlgorithm;
/*
 * 6
50 2
20 1
40 2
60 3
30 3
30 1

60 3	=> 3day = 60+, 30+ => 60 poll
30 3	=> 2day = 50+, 40+ , 30 => 50 poll
50 2	=> 1day = 40, 30, 30+, 20+ => 40 poll
40 2
30 1
20 1

 */
import java.util.*;
class Lecture implements Comparable<Lecture>{
	public int pay, day;
	Lecture(int pay, int day)
	{
		this.pay = pay;
		this.day = day;
	}
	@Override
	public int compareTo(Lecture O)
	{
		return O.day - this.day; // 음수 내림차순
	}
}
class 최대수입스케쥴 {
	static int max = Integer.MIN_VALUE;
	static int n;
	public int Solution(ArrayList<Lecture> arr) {
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int answer = 0;
		int j=0;	// 이전에 처리한 강의를 제외하기 위해 for문 밖에 선언
		for(int i=max; i>=1; i--)	// 최대일수 역순
		{
			for(; j<n; j++)
			{
				if(arr.get(j).day < i)	// 일수가 max일보다 작을경우
				{
					break;
				}
				pQ.offer(arr.get(j).pay);	
			}
			if(!pQ.isEmpty())
				answer += pQ.poll();
			
		}
		return answer;
	}
	public static void main(String[] args){
		최대수입스케쥴 T = new 최대수입스케쥴();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.add(new Lecture(a, b));
			if(b > max)
			{
				max = b;
			}
		}
		System.out.println(T.Solution(arr));
	}
}
