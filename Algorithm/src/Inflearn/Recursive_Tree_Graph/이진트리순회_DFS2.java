package Inflearn.Recursive_Tree_Graph;
class Node2{
	Node2 lt, rt;
	int data;
	public Node2(int val)
	{
		lt = rt = null;
		this.data = val;
	}
}
public class 이진트리순회_DFS2 {	
	Node2 root;
	public void DFS(Node2 root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			DFS(root.lt);
			System.out.print(root.data+" ");
			DFS(root.rt);
		}
	}
	
	public static void main(String[] args){
		이진트리순회_DFS2 tree = new 이진트리순회_DFS2();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		tree.root.rt.lt = new Node2(6);
		tree.root.rt.rt = new Node2(7);
		tree.DFS(tree.root);
		
	}	
}