
public class TimeSeconds {

	static String whatTime(int seconds)
	{
		int hours=seconds/3600;
		int min=((seconds)-(hours*3600));
		int minutes=min/60;
		int s=min-(minutes*60);
		String out=Integer.toString(hours)+":"+Integer.toString(minutes)+":"+Integer.toString(s);
		return '\"'+out+'\"';
	}
	
	static void Max(int[] arr) 
	{

	      boolean swapped = true;

	      int j = 0;

	      int tmp;

	      while (swapped) {

	            swapped = false;

	            j++;

	            for (int i = 0; i < arr.length - j; i++) {                                       

	                  if (arr[i] <arr[i + 1]) {                          

	                        tmp = arr[i];

	                        arr[i] = arr[i + 1];

	                        arr[i + 1] = tmp;

	                        swapped = true;

	                  }

	            }                

	      }
	      
	      for(int i=0;i<arr.length;i++)
	      {
	    	  System.out.print(arr[i]+"");
	      }

	}
	
	public static void main(String args[])
	{
		String in=whatTime(0);
		System.out.println(in);
		int a[]={0,4,6,3,9};
		Max(a);
	}
	
}
