
public class linkedList {
	public int data;
	public linkedList next;
	 static linkedList first=null;
	 static linkedList last=null;
	 static linkedList r=null;
	
	public linkedList(int data)
	{
		this.data=data;
	}
	 public linkedList() {
		// TODO Auto-generated constructor stub
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
	 
	
	public static linkedList RecReverse(linkedList list)
	{
		{
		    if (list == null) return null; 
		    if (list.next == null) return list; 
		    linkedList secondElem = list.next;
		    list.next = null;
		    linkedList reverseRest = RecReverse(secondElem);
		    secondElem.next = list;
            return reverseRest;
		}
		
		
	}
	
	public static linkedList iteReverse(linkedList x)
	{
		x=x.first;
		linkedList rev = null;
		linkedList w=null;
		while(x!=null)
		{
		w=x; //giving current node to temporary
		x=x.next; //moving current node forward
		w.next=null; //removing the chained elements of temporary
		w.next=rev; //connecting temporary to null (initially)
		rev=w; //moving the connecting element to first so that we can establish the linked chain.
		}
		return rev;
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
		linkedList l=new linkedList();
		l.insert(new linkedList (10));
		l.insert(new linkedList (11));
		l.insert(new linkedList (9));
		l.insert(new linkedList (4));
		l.print();
		System.out.println();
		// Recursive
		
		/*linkedList y=RecReverse(l.first);
		y.print();
		while(y!=null)
		{
			System.out.print(y.data+" -->> ");
			y=y.next;
		}*/


		
		// Iterative
		linkedList z=iteReverse(l);
		while(z!=null)
		{
			System.out.print(z.data+" --> ");
			z=z.next;
		}
	}
}
