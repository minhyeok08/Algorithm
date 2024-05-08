package Inflearn.Recursive_Tree_Graph;
class Node5{
	Node5 lt, rt;
	int data;
	public Node5(int val)
	{
		data = val;
		lt = rt = null;
	}
}
public class 말단노드까지의최단경로_DFS {	
	Node5 root;
	public int DFS(int L, Node5 root)
	{
		if(root.lt==null && root.rt==null)
		{
			return L;
		}
		else
		{
			return Math.min(DFS(L+1, root.lt),DFS(L+1,root.rt));
		}
	}
	public static void main(String[] args){
		말단노드까지의최단경로_DFS tree = new 말단노드까지의최단경로_DFS();
		tree.root = new Node5(1);
		tree.root.lt = new Node5(2);
		tree.root.rt = new Node5(3);
		tree.root.lt.lt = new Node5(4);
		tree.root.lt.rt = new Node5(5);
		System.out.println(tree.DFS(0, tree.root));
		
	}	
}