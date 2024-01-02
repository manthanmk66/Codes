package Tree;

import java.util.Scanner;

import Tree.Mytree.node;

public class TestMytree {

	public static void main(String[] args) {
		Mytree m=new Mytree();
		m.insert(10);
		m.insert(20);
		m.insert(70);
		m.insert(60);
		m.insert(110);
		m.insert(780);
		m.inorder();
		System.out.println("enter a num");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean s=m.search(n);
		if(s)
			System.out.println("found");
		else {
			System.out.println("not found");
		}
	}

}
