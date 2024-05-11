/*
 Q1. Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
 */


import java.util.*;
public class searching {
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

        //
		public boolean search(Node head,int x) 
		{
			Node temp=head;
			while(temp!=null) 
			{
				if(temp.data==x)
				{
					return true;
				}
				temp=temp.next;
			}
			return false;
		}
        
        public static void main(String []args)
        {
            Scanner scan=new Scanner(System.in);
            int arr[]={14,21,11,30,10};
            System.out.println("Enter the element u wanna search:");
            int x=scan.nextInt();
            searching s=new searching();
            Node head=s.a2ll(arr);
            boolean res=s.search(head, x);
            System.out.println(res);
            
        }
        }