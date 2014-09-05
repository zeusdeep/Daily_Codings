public class GroceryBag {
	static int minimumBags(int strength, String[] itemType)
	{
		int count=1;
		int bags=0;
		for(int i=0;i<itemType.length-1;i++)
		{
			
			
			if((itemType[i].equals("Counted")!=true)){
			for(int j=i+1;j<itemType.length;j++)
			{
				
				if(((itemType[j].equals("Counted")!=true))&&(itemType[i].equals(itemType[j])))
						{
							count ++;
							System.out.println("COUNT of "+itemType[i]+" is "+count);
							System.out.println("Value of j before "+itemType[j]);
							itemType[j]="Counted";
							System.out.println("Value of j after "+itemType[j]+" at j ="+j);
						
						}
				
			}
			System.out.println("Count outside loop1 is "+count+" for the value of i : "+i);
			bags+=(count/strength)+(count%strength);
			System.out.println("BAGS : "+bags);
			count=1;
		}
		}
		return bags;
		
	}
	public static void main(String args[])
	{
		String a[]={"DAIRY",
				 "DAIRY",
				 "DAIRY",
				 "LAPTOP",
				"MEAT",
				 "MEAT"};
		int in=minimumBags(2,a);
		System.out.println(in);
	}
	
	
	
}
