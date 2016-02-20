package com.DS;

import java.util.Scanner;
import java.util.Stack;

public class LinkedListALLQuestions {
	
	static int CompareLists(Node headA, Node headB) {
int isequal=1;
		
	    if (headA.next ==null && headB.next==null){
	    	if(headA.data!=headB.data) isequal=0;
            return 0;
	    		    		
	    }else{
		while (headA.next !=null || headB.next!=null){
			
			if(headA.next ==null && headB.next!=null){
				isequal=0;
				break;
			}else if (headA.next !=null && headB.next==null){
				isequal=0;
				break;
			}else if (headA.next !=null && headB.next!=null){
				if(headA.data==headB.data){
					headA=headA.next;
					headB=headB.next;
				}else {
					isequal=0;
					break;
				}
			}
		}
	    }
		return isequal;
	}
	
	
	
	static Node ReversetheList(Node head) {
		//System.out.println("heree:");
		//display(head);
		Node prv=null;
		Node curr=head;
		Node nextN=head.next;
	while(curr.next!=null){
			curr.next=prv;
			prv=curr;
			curr=nextN;
			nextN=curr.next;
		}
		curr.next=prv;
				return curr;
	}
	
	
	static void ReversePrint(Node head) {
		Stack st = new Stack();
		 Node start=head;
         while(start!=null){
            st.push(start.data);
             start=start.next;
         }
       
         while(!st.isEmpty()){
        	 System.out.println(st.peek());
        	 st.pop();
         }
		/*System.out.println(st.toString());*/
	}
	
	static Node Delete(Node head, int position) {
		Node curr=head;
		if(head==null ){
			//
		}else if(position==0){
			head=head.next;
		}
		
		else {
			 int pos=0;
		         while(pos<position-1 && curr.next!=null){
		        	curr=curr.next;
		        	 pos++;
		        }
		         System.out.println(pos);
		         System.out.println(curr.data);
		         curr.next = curr.next.next;
		}
		
		
		return head;
		
	}
	
	
	static Node InsertNth(Node head, int data, int position) {
		Node newNode = new Node(data);
		 Node curr=head;
		 if(curr==null && position==0){
			 head=newNode;
		}
		 else {
		 int pos=2;
         while(pos<position && curr.next!=null){
        	curr=curr.next;
        	 pos++;
        }
		System.out.println("cur"+curr.data);
		
         Node temp = curr.next;
       //  System.out.println("temp: "+ temp.data);
        curr.next=newNode;
         newNode.next=temp;
		}
		return head;
	}
	
	
	public static  Node insert(Node head,int data){
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
	public static void display(Node head){
          Node start=head;
          while(start!=null){
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
        Node head1=null;
        int T1=sc.nextInt();
        while(T1-->0){
            int ele=sc.nextInt();
            head1=insert(head1,ele);
        }
        Node head2=null;
        int T2=sc.nextInt();
        while(T2-->0){
            int ele1=sc.nextInt();
            head2=insert(head2,ele1);
        }
        
        System.out.println(CompareLists(head1,head2));
        
      //  head1=ReversetheList(head1);
        //head1=Delete(head1,0);
        //ReversePrint(head1);
     //  display(head1);
}
}
