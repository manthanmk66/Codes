package Tree;

//import com.demo.beans.BinarySearchTree.Node;

public class Mytree {
	node root;
public class node
{
	node left,right;
	int data;
	public node(int d)
	{
		left=right=null;
		data=d;
	}
}
	public Mytree()
	{
		root=null;
	}
	public void insert(int d)
	{
		root=insertrec(root,d);
	}
	private node insertrec(node root, int d) {
	if(root==null)
	{
		root=new node(d);
		return root;
	}
	if(d<root.data)
	{
		root.left=insertrec(root.left, d);
	}
	else {
		root.right=insertrec(root.right, d);
	}
		
	return root;
		
	}
	
	public void inorder()
	{
		inordertrav(root);
	}
	private void inordertrav(node root) {
	if(root!=null)
	{
		inordertrav(root.left);
		System.out.println(root.data+",");
		inordertrav(root.right);
	}
		
	}
	public boolean search(int num)
	{
		if(root==null)
		{
			return false;
		}
		while(root!=null)
		{
			if(root.data==num)
			{
				return true;
			}
			if(root.data<=num)
			{
				root=root.right;
			}
			else {
				root=root.left;
			}
		}
		return false;
	}
	
}

