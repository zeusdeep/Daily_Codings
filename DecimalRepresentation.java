
public class DecimalRepresentation {
	
	public static String DecRep(double num,double den)
	{
		
		double rem=num/den;
		System.out.println(rem);
		String res=String.valueOf(rem);
		System.out.println(res.length());
		int m=0;
		String one="";
		String two="";
		for(int i=0;i<res.length();i++)
		{
			if(res.charAt(i)=='.')
			{
				m=i;
		         int len1=res.length()-res.substring(0,m).length();
		         int l=len1/2;
				 one=res.substring(0,l);
				 two=res.substring(l+1,res.length()-1);
				break;
			}
		}
		String add="";
		if(one==two)
		{
			add=one;
			
				for (int o=0;o<add.length()-1;o++)
				{
					if(o==add.length()-1)
					{
						return res.substring(0,m)+".("+add.charAt(0)+")";
					}
				if(add.charAt(o)==add.charAt(o+1))
					{
					
				}
				else 
				break;
			}
		}
		else add=one+two;
		System.out.println();
		System.out.println();
		return res.substring(0,m)+".("+add+")";
		
	}
	
	
	public static void main(String args[])
	{
		String in=DecRep(22,7);
		System.out.println(in);
	}
	
	

}
