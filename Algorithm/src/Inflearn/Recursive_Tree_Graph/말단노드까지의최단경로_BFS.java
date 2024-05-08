package Inflearn.Recursive_Tree_Graph;
import java.util.*;
class Node6{
	Node6 lt, rt;
	int data;
	public Node6(int val){
		lt = rt = null;
		data = val;
	}
}
public class 말단노드까지의최단경로_BFS {	
	Node6 root;
	
	public int BFS(int L, Node6 tree)
	{
		Queue<Node6> Q = new LinkedList<>();
		Q.offer(root);
		while(!Q.isEmpty())
		{
			int len = Q.size();
			for(int i=0; i<len; i++)
			{
				Node6 cur = Q.poll();
				if(cur.lt==null && cur.rt==null)
				{
					return L;
				}
				if(cur.lt!=null)
				{
					Q.offer(cur.lt);
				}
				if(cur.rt!=null)
				{
					Q.offer(cur.rt);
				}
			}
			L++;
		}
		return 0;
	}
	public static void main(String[] args){
		말단노드까지의최단경로_BFS tree = new 말단노드까지의최단경로_BFS();
		tree.root = new Node6(1);
		tree.root.lt = new Node6(2);
		tree.root.rt = new Node6(3);
		tree.root.lt.lt = new Node6(4);
		tree.root.lt.rt = new Node6(5);
		System.out.println(tree.BFS(0, tree.root));
	}	
}