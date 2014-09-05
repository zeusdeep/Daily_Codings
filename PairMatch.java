
public class PairMatch {
	
	public static String [][] PairFind(int a[],int b[])
	{
		String c[][]=new String[a.length+b.length][a.length+b.length];
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println("I :"+i);
			for(int j=i+1;j<b.length;j++)
			{
				//System.out.println("J :"+j);
				if(a[i]>b[j])
				{
					c[i][j]=""+i+","+j;
					//System.out.println(""+i+","+j);
				}
			}
		}
		return c;
	}	
		public static void main(String args[])
		{
			int a[]={3,4,5,6};
			int b[]={9,7,5,2,1,4,7,9};
			String c[][]=PairFind(a,b);
			
			for(int i=0;i<a.length+b.length;i++)
			{
				for(int j=0;j<a.length+b.length;j++)
				{
				if(c[i][j]!=(null))
				{
				System.out.println(c[i][j]+"");
				}
				}
			}
		}
		
		
		
		
		
	}
	
	
	


