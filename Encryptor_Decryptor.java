import java.util.Arrays;
import java.util.Scanner;


public class Encryptor_Decryptor {
	
	  static String[] decode(String dec) {
	/*	 int temp=Integer.parseInt(dec);
		 System.out.println("Temporary is : "+temp);
		 int k=0;
		 while((temp>0)||((b.length)<=dec.length())){
			 System.out.println("Temporary position 1 is : "+temp);
			 temp=temp%10;
			 System.out.println("Temporary position 2 is : "+temp);
			 b[k]=temp;
			 System.out.println("b[] is : "+b[k]);
			 k++;
		 }
	*/	
		 String a[]=new String[dec.length()];
	     int b[]=new int[dec.length()];
	     int c[]=new int[dec.length()];
	     int d[]=new int[dec.length()];
		 for(int i=0;i<dec.length();i++){
			a[i]=dec.charAt(i)+"";
		}
		 
		for(int j=0;j<dec.length();j++)
		{
			b[j]=Integer.parseInt(a[j]);
			//System.out.println(b[j]+"");
		}
		 
		c[0]=0;
		c[1]=b[0]-c[0];
		boolean deep1 = false;
		for(int l=2;l<dec.length()-1;l++)
		{
			c[l]=b[l-1]-c[l-2]-c[l-1];
			if((c[l]>2)||(c[l]<0))
			{
				deep1=true;
			}
		}
		c[dec.length()-1]=b[dec.length()-1]-c[dec.length()-2];
		if((c[dec.length()-1]>2)||(c[dec.length()-1]<0))
		{
			deep1=true;
		}
		 
		
		d[0]=0;
		d[1]=b[0]-d[0];
		boolean deep2 = false;
		for(int h=2;h<dec.length()-1;h++)
		{
			d[h]=b[h-1]-d[h-2]-d[h-1];
			if((d[h]>2)||(d[h]<0))
			{
				deep2=true;
			}
		}
		d[dec.length()-1]=b[dec.length()-1]-d[dec.length()-2];
		if((d[dec.length()-1]>2)||(d[dec.length()-1]<0))
		{
			deep2=true;
		}
		String enc1 = null;
		String e12=null;
		String e13=null;
		String e14="";
		if(deep1==false){
			enc1=Arrays.toString(c);
			e12=enc1.replace('[','\"');
			 e13=e12.replace(']','\"');
			// String e15 = e13.replace(',',"");
			 for(int q=0;q<e13.length();q++)
			 {
				if(e13.charAt(q)!=',')
				{
				e14=e14+e13.charAt(q);
				}
			 }
			// e1 = enc1.substring(1,enc1.length()-1);
			//System.out.println(enc1);
		}
		else e14="None";
		
		String enc2 = null;
		String e2=null;
		String e3=null;
		String e4="";
		if(deep2==false){
		 enc2=Arrays.toString(d);
		 e2=enc2.replace('[','\"');
		 e3=e2.replace(']','\"');
		 for(int q=0;q<e3.length();q++)
		 {
			 if(e3.charAt(q)!=',')
				{
			 e4=e4+e3.charAt(q);
				}
		 }
		 //e4=e3.
		 //e2 = enc2.substring(1,enc2.length()-1);
		// System.out.println(enc2);
		}
		else e4="None";
		
	String output[]={e14,e4};
	return output;
	}
	public static void main (String args[])
		{
			Scanner cin=new Scanner(System.in);
			System.out.println("Enter the decoded string");
			String dec=cin.nextLine();
			String enc[]=decode(dec);
			System.out.print("{ "+enc[0]+", "+enc[1]+" }");
			
			
			
		}

	
}

