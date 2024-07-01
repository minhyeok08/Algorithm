package Inflearn.GreedyAlgorithm;

import java.util.*;
class Lecture2 implements Comparable<Lecture2>{
    public int money;
	public int time;
    Lecture2(int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture2 ob){
        return ob.time - this.time;
    }
}

class 최대수입스케쥴2 {
	static int n, max = Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture2> arr){
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(arr);
		int j=0;
		for(int i=max; i>=1; i--){
			for(; j<n; j++){
				if(arr.get(j).time < i) 
					break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) 
				answer += pQ.poll();
		}
		return answer;
	}

	public static void main(String[] args){
		최대수입스케쥴2 T = new 최대수입스케쥴2();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Lecture2> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture2(m, d));
			if(d > max) 
				max = d;
		}
		System.out.println(T.solution(arr));
	}
}
