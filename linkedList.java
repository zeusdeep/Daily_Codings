
public class linkedList {
	public int data;
	public linkedList next;
	 static linkedList first=null;
	 static linkedList last=null;
	
	public linkedList(int data)
	{
		this.data=data;
	}
	 public static void insert(linkedList n)
	 {
		 if( first==null)
		 {
			 first=n;
			 last=n;
			 last.next=null;
		 }
		 else
		 {
			 last.next=n;
			 last=n;
			 last.next=null;
		 }
	 }
	 
	 public static void print()
	 {
		 if( first==null)
		 {
			 System.out.println("Empty link list");
		 }
		 else
		 {
			 linkedList temp=first;
			 while(temp!=null)
			 {
				 System.out.print(temp.data+" ");
				 temp=temp.next;
			 }
		 }
	 }
	 

	 public static void remove()
	 {
		 if( first==null)
		 {
			 System.out.println("Empty link list");
		 }
		 else
		 {
			System.out.println("Deleting node "+first.data);
			if(first.next==null)
			{
				first=null;
				last=null;
				return;
			}
			else
			{
			
				first=first.next;
				if(first.next==null);
				{last=first;}
			}
		 }
	 }
 
	 public static void main(String args[])
	 {
		;
		
	}
 }