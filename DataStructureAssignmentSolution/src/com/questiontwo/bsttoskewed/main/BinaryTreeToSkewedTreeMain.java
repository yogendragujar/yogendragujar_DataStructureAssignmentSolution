package com.questiontwo.bsttoskewed.main;

import com.questiontwo.bsttoskewed.util.BinaryTreeToSkewedTreeSetup;
import com.questiontwo.bsttoskewed.util.BinaryTreeToSkewedTreeSetup.Node;

public class BinaryTreeToSkewedTreeMain {
	
	public static void main(String[] args) {
		BinaryTreeToSkewedTreeSetup tree = new BinaryTreeToSkewedTreeSetup();
		tree.root = new Node(50);
		tree.root.left = new Node(30);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(10);
		tree.root.right.left= new Node(55);
		
		tree.getRightSkewed(tree.root);
		
//		System.out.println("The InOrder Traversal: ");
		tree.traverseRightSkewed(tree.headNode);

		
	}
}
