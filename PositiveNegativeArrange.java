
public class PositiveNegativeArrange {
	public static int[] ArrangeArrays(int a[],int b[])
		{
			int c[];
			boolean largeA;
			if(a.length>b.length)
			{
				c=new int[a.length];
				largeA=true;
			}
			else
				c=new int[b.length];
			for(int i=0;i<c.length;i++)
			{
				if(i%2==0)
				{
					c[i]=a[i];
				}
				else if(i%2!=0)
				{
					c[i]=b[i];
				}
				if((i==b.length)&&(c.length+1>=i))
				{
					for(int j=i;j<c.length;j++)
					{
						c[j]=a[j];
					}
					break;
				}
				else if((i==a.length)&&(c.length+1>=i))
				{
					for(int j=i;j<c.length;j++)
					{
						c[j]=b[j];
					}
					break;
				}
				
			}
		
		return c;
		}
	
	public static void main(String args[])
			{
				int a[]={1,2,3,4,5,6};
				int b[]={-1,-2,-3,-4};
				int c[]=ArrangeArrays(a,b);
				for(int i=0;i<c.length;i++)
				{
					System.out.print(c[i]+",");
				}
			}
}
