import java.util.Random;


public class MinimuPriceCombo {
	
	public static void main(String args[])
	{
		
		int x[]={1,3,4,5,6,7};
		Random rand=new Random();
		int p=rand.nextInt(100);
		int q=rand.nextInt(100);
		System.out.println(p);
		System.out.println(q);
		int ran1=p%(x.length-1);
		int ran2=q%(x.length-1);
		System.out.println(ran1);
		System.out.println(ran2);
		int num1=x[ran1];
	    int num2=x[ran2];
		System.out.println(num1);
		System.out.println(num2);
	}
	
	
	
}
