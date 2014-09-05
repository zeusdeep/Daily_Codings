import java.math.BigInteger;

public class Lottery {
	
	@SuppressWarnings("null")
	static void sortByOdds(String[] rules)	
		{
			String name[]=new String[40];
			String choice[]=new String[40];
			String blank[]=new String[40];
			String sort[]=new String[40];
			String unique[]=new String[40];
			String temp="";
			System.out.println("Start");
			for(int i=0;i<rules.length;i++)
			{
				System.out.println("1");
				for(int j=0;j<rules[i].length();j++)
					{
					while(rules[i].charAt(j)!=':')
					{
						temp+=rules[i].charAt(j);
						name[i]=temp;
					}
				    System.out.println(name[i]);
					temp="";
					System.out.println("2");
				    for(int l=j;l<rules[i].length();l++)
				    {
				    	while(!(Character.isWhitespace(rules[i].charAt(l))))
						{
							temp+=rules[i].charAt(l);
							choice[i]=temp;
						}
				        System.out.println(name[i]);
						temp="";
						System.out.println("3");
						for(int m=j;m<rules[i].length();l++)
					    {
					    	while(!(Character.isWhitespace(rules[i].charAt(m))))
							{
								temp+=rules[i].charAt(m);
								blank[i]=temp;
							}
					        System.out.println(blank[i]);
							temp="";
							for(int n=j;n<rules[i].length();n++)
						    {
						    	while(!(Character.isWhitespace(rules[i].charAt(n))))
								{
									temp+=rules[i].charAt(n);
									sort[i]=temp;
								}
						        System.out.println(sort[i]);
								temp="";
								for(int o=j;o<rules[i].length();o++)
							    {
							    	while(!(Character.isWhitespace(rules[i].charAt(o))))
									{
										temp+=rules[i].charAt(0);
										unique[i]=temp;
									}
							        System.out.println(unique[i]);
									//temp="";
								}
							}
						}
					}
				
					}
				}
			System.out.println("End");
			for(int k=0;k<name[k].length();k++)
			{
				System.out.println(name[k]+" ");
			}
	}
	
public static void main (String args[])
{
	String in[]={"KICK ANY TWO: 10 2 F F","PICK TWO IN ORDER: 10 2 T F" };
	//String out[]=sortByOdds(in);
	sortByOdds(in);
}
}
