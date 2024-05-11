/*question Q2:. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
new node is inserted after the given node.*/

import java.util.*;
public class insertion_at_a_position {
	 Node head;
		class Node{
			int data;
			Node next;
			
			Node(int d)
			{
				data=d;
				next=null;
			}
		}
		//Convert the array to LL
		public Node a2ll(int arr[]) 

		{	
			Node head=new Node(arr[0]);
			Node temp=head;
			for(int i=1;i<arr.length;i++)
			{
				Node mover=new Node(arr[i]);
				temp.next=mover;
				temp=temp.next;
			}
			return head;
		}
		
		
		//Display of output
		public void display(Node head) 
		{
			Node temp=head;
			while(temp!=null) 
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
		
		public Node insert(Node head,int posi,int val) 
		{
			Node temp=head;
			int cnt=0;
			while(temp!=null) 
			{	
				cnt++;
				if(cnt==posi) 
				{
					break;
				}
				temp=temp.next;
				
			}
			Node front=temp.next;
			Node newNode=new Node(val);
			temp.next=newNode;
			newNode.next=front;
			return head;
		}
		
		public static void main(String[]args) 
		{
			int arr[]= {0,2,4,5};
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the position where element is to be insert:");
			int posi=scan.nextInt();
			System.out.println("Enter the element:");
			int val=scan.nextInt();
			
			
			insertion_at_a_position i=new insertion_at_a_position();
			Node head=i.a2ll(arr);
			head=i.insert(head, posi, val);
			i.display(head);
			
		}
}
