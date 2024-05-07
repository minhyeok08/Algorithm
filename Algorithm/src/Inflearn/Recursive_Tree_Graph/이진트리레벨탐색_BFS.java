package Inflearn.Recursive_Tree_Graph;
import java.util.*;
class Node3{
	Node3 lt, rt;
	int data;
	public Node3(int val)
	{
		data = val;
		lt = rt = null;
	}
}
public class 이진트리레벨탐색_BFS {	
	Node3 root;
	public void BFS(Node3 root)
	{
		Queue<Node3> Q = new LinkedList<>();
		Q.add(root);
		int L = 0;
		while(!Q.isEmpty())
		{
			int len = Q.size();
			System.out.print(L + "Lev : ");
			for(int i=0; i<len; i++)
			{
				Node3 cur = Q.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null)
				{
					Q.add(cur.lt);
				}
				if(cur.rt!=null)
				{
					Q.add(cur.rt);
				}
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args){
		이진트리레벨탐색_BFS tree = new 이진트리레벨탐색_BFS();
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		tree.root.rt.lt = new Node3(6);
		tree.root.rt.rt = new Node3(7);
		tree.BFS(tree.root);
		
	}	
}