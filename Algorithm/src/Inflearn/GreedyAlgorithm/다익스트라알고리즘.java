package Inflearn.GreedyAlgorithm;
import java.util.*;
// dis을 max값으로 초기화 한다.
// 연결된 노드를 순회할 때 현재값이 dis 배열의 최소값이라면 어디를 거쳐도 현재값보다 크기때문에 최소값이다.(각 배열은 양수이기 때문)
// 우선순위 Queue 를 사용하면 n * logN 의 시간 복잡도를 갖는다. (단순 dis 배열을 이용하면 O(n^2)
class Edge implements Comparable<Edge>
{
	public int vex, cost;
	Edge(int vex, int cost)
	{
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge O)
	{
		return this.cost - O.cost;	// 현재객체와 비교객체 순서를 유지한상태로 음수 => 오름차순
	}
}

public class 다익스트라알고리즘 {
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	public void Solution(int v)
	{
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v, 0));
		dis[v] = 0;
		while(!pQ.isEmpty())
		{
			Edge tmp = pQ.poll(); // pQ에 있는 최소 비용값 poll 
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost > dis[now])	// 현재비용이 지금까지의 최소비용보다 크다면 탐색 pass
				continue;
			for(Edge O : graph.get(now)) // 연결된 노드의 객체값 탐색 // ex) 1과 연결된 2,3 노드 탐색
			{
				if(dis[O.vex] > O.cost + nowCost) // 연결된 노드의 비용과 poll된 최소 비용값 비용의 기록된 합보다 더 작다면 
												  // ex) dis[2] 노드의 값보다 2의 비용 + 1의 비용이 작다면 // 그값으로 갱신 하고
												  // 노드 2를 pQ에 삽입
				{
					dis[O.vex] = O.cost + nowCost; // 기록된 합 최소비용 갱신
					pQ.offer(new Edge(O.vex, dis[O.vex])); // 연결된 노드와 최소 비용 객체 삽입
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		다익스트라알고리즘 T = new 다익스트라알고리즘();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++)
		{
			graph.add(new ArrayList<Edge>());
		}
		for(int i=0; i<m; i++)
		{
			int a = sc.nextInt();	// 현재 행렬
			int b = sc.nextInt();	// 연결 행렬
			int c = sc.nextInt();	// 가중치
			graph.get(a).add(new Edge(b, c));
		}
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		T.Solution(1);
		for(int i=2; i<=n; i++)
		{
			if(dis[i] != Integer.MAX_VALUE)
			{
				System.out.println(i + " : " + dis[i]);
			}
			else
			{
				System.out.println(i + " : impossible");
			}
		}
	}

}
