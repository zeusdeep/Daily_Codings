
public class RotatedMin {
public static int RotatedMin(int a[])
{
	int res=0;
	for(int i=a.length-1;i>0;i--)
	{
		//System.out.println(i);
		if((a[0]<a[i])&&(i==a.length-1))
				{
			System.out.println("Loop 1"+a[i]+" i :"+i);
			res=a[0];
			break;
				}
		if(a[0]>a[i]){
			System.out.println("Loop 2"+a[i]+" i :"+i);

		}
		else {
			System.out.println("Loop 3"+a[i]+" i :"+i);

			res=a[i+1];
			break;
			}
		}
	
	
	
	
	return res;
}

public static void main(String args[])
{
	int a[]={2,3,1};
	int result=RotatedMin(a);
	System.out.println(result);
}





}
