package com.LinkedListInsert;

import java.util.Scanner;

public class Solution {

	public static  Node insert(Node head,int data)
	{
		
		if (head==null){
			head=new Node(data);
		return head;
		}else {
			
			 Node currentNode = head;
		        while(currentNode.next != null){
		        currentNode = currentNode.next;
               }
             currentNode.next = new Node(data);
		        return head;
		}
		
  	//Complete this method
	}
	
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }
}
