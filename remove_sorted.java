/* 
 Q3. Given the head of a sorted linked list, delete all duplicates such that each element
appears only once. Return the linked list sorted as well.
 */

public class remove_sorted {

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

		
		public Node remove(Node head) 
		{
			if(head==null||head.next==null)
		       {
		        return head;
		       }
		
			Node h=head;
			
			while(h.next!=null) 
			{
				if(h.data==h.next.data) 
				{
					h.next=h.next.next;
				}
				h=h.next;
				
			
					
			}
			return head;
		}
		
		public static void main(String[]args) 
		{
			int arr[]= {0,0,1,2,2,3,4};
			remove_sorted r=new remove_sorted();
			Node head=r.a2ll(arr);
			head=r.remove(head);
			r.display(head);
		}
		
}
