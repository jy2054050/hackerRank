package com.Tree;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LevelOrderTraversal {
	public static void main(String[] args) {
		Node one = new Node();Node two = new Node();Node three = new Node();
		Node four = new Node();Node five = new Node();Node six = new Node();
		Node seven = new Node();
		
		one.data =3; two.data =5; three.data=2; four.data=1; five.data= 4;six.data=6;seven.data=7;
		
		one.left=two; one.right=three; two.left=four;two.right =five; 
		one.right=three; three.left=six;four.left=seven;
		
		levelOrderTraversal(one);
	}
	 public static void levelOrderTraversal(Node startNode) {  
		  Queue<Node> queue=new LinkedList<Node>();  
		  queue.add(startNode);  
		         while(!queue.isEmpty())  
		  {  
		     Node tempNode=queue.poll();  
		   System.out.printf("%d ",tempNode.data);  
		   if(tempNode.left!=null)  
		    queue.add(tempNode.left);  
		   if(tempNode.right!=null)  
		    queue.add(tempNode.right);  
		  }  
		 }  
}