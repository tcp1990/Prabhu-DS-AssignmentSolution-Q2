package com.gl.apps;

import com.gl.model.Node;
import com.gl.services.BinarySearchTreeToSkewedTreeConvertor;

public class Main {

	public static void main(String[] args) {

		Node root = new Node(40);
		root.left = new Node(20);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right = new Node(60);
		root.right.right = new Node(70);
		root.right.left = new Node(50);
		
		////Example2
		//Node root = new Node(50);
		//root.left = new Node(30);
		//root.left.left = new Node(10);
		//root.right = new Node(60);
		//root.right.left = new Node(55);

		BinarySearchTreeToSkewedTreeConvertor sumOfPair = new BinarySearchTreeToSkewedTreeConvertor();
		sumOfPair.processBinarySearchTree(root);
	}

}
