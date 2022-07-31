package com.questiontwo.bsttoskewed.util;

public class BinaryTreeToSkewedTreeSetup {
	public Node root;
	static Node prevNode = null;
    public static Node headNode = null;
    
	public static class Node{
		int data;
		public Node left;
		public Node right;
		
		
	    public static Node node;
		public Node(int key)
	    {
			data = key;
	        left = right = null;
	    }
	}
	
	public static void getRightSkewed(Node root) {
		if(root == null) {
			return;
		}
		
		getRightSkewed(root.left);
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(headNode == null) {
			headNode = root;
//			root.right = root.left;
//			root.left = null;
			prevNode = root;
		}else {
//			root.right = root.left;
			prevNode.right = root;
//			System.out.println("iter: "+prevNode.right.data);
//			root.left=null;
			prevNode = root;
		}
		
//		System.out.println(" root is: "+root.data);	
		getRightSkewed(root.right);
//		System.out.print (" "+prevNode.data );
		
	}
	
	
	public static void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        
        System.out.print(root.data + " ");
        traverseRightSkewed(root.right); 
        
    }
   
	public static void inOrder(Node root) {
	    if (root == null)
	      return;
	    else {
	      inOrder(root.left);
	      System.out.print(root.data + " ");
	      inOrder(root.right);
	    }
	    
	  }
}
