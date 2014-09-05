
public class CapgeminiMedalThreshold {
	
	 public static String lastdigit(int input1,int input2)
	    {
		//System.out.println(input1);
		//System.out.println(input2);
		 double out[]=new double[(input2)];
		 for(int i=0;i<input2;i++)
		 {
			 out[i]= Math.pow(input1,(i+1));
			System.out.println("Power value at "+i+" is "+out[i]);
		 }
		 double temp=0;
		String res=new String();
		int re[]={0,0,0,0,0,0,0,0,0,0};
				for(int i=0;i<out.length;i++)
				{
				//	System.out.println("Entering for loop for value "+i);
					if(out[i]<10)
					{
						temp=out[i];
					}
					while(out[i]>10)
					{
						out[i]=out[i]%10;
						temp=out[i];
						
					}
					//System.out.println("Temp at "+i+" is "+temp);
					re[(int) temp]++;
				}
				
		String y="";
		
				for(int i=0;i<10;i++)
				{
					
					y+=""+i+":"+re[i]+",";
				}
		return y.substring(0,y.length()-1);
	       
	    }
	
	
	public static void main (String args[])
			{
		String x=lastdigit(15,15);
		System.out.println(x);
			}
			}
