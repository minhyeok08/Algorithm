package Greedy_Algorithm;
import java.util.*;
class Time2 implements Comparable<Time2>{
    public int time2;
	public char state;
    Time2(int time2, char state) {
        this.time2 = time2;
        this.state = state;
    }
    @Override
    public int compareTo(Time2 ob){
        if(this.time2==ob.time2) 
        	return this.state-ob.state;
		else 
			return this.time2-ob.time2;
    }
}

class Inflearn9_3 {
	public int solution(ArrayList<Time2> arr){
		int answer=Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt=0;
		for(Time2 ob : arr){
			if(ob.state=='s') 
				cnt++;
			else 
				cnt--;
			answer = Math.max(answer, cnt);
		}
		return answer;
	}

	public static void main(String[] args){
		Inflearn9_3 T = new Inflearn9_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time2> arr = new ArrayList<>();
		for(int i=0; i<n; i++){
			int sT = sc.nextInt();
			int eT = sc.nextInt();
			arr.add(new Time2(sT, 's'));
			arr.add(new Time2(eT, 'e'));
		}
		System.out.println(T.solution(arr));
	}
}
