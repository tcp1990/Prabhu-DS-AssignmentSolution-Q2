package com.gl.services;

import com.gl.model.Node;

public class BinarySearchTreeToSkewedTreeConvertor {

	private Node prevNode = null;
	private Node headNode = null;
	
	public void processBinarySearchTree(Node root)
	{
		generateSkewedTree(root);
		displaySkewedTree(headNode);
	}
	 
	private void generateSkewedTree(Node root) {
		
		if (root == null) {
			return;
		}

		generateSkewedTree(root.left);
		
		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		generateSkewedTree(rightNode);
	}
	
	public void displaySkewedTree(Node root)
	 {
	     if(root == null)
	     {
	         return;
	     }
	     System.out.print(root.data + " ");
	     displaySkewedTree(root.right);
	 }
}
