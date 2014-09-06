import java.util.Arrays;


public class Coherency {

		static int starters(int[] collection, int maxJump)
		{
			int c=0;
			int counter=0;
			int temp=0;
			int cou=0;
			int tarr[]=Arrays.copyOf(collection, collection.length);
			int o=0;
			for(int i=o;i<tarr.length;i++)
			{
				
				i=o;
				System.out.println("I "+i);
				temp=tarr[i];
				System.out.println("Temp : " +temp);
			        for(int j=0;j<tarr.length;j++)
				{
					System.out.println("J : "+j);
					if(i==j)
					{
						System.out.println("Ignored "+j+" as i = j");
					
					}
					else if(j==-1)
					{
						System.out.println("Ignored "+j+" as j == -1");
					}
					//System.out.println("Difference is "+Math.abs(temp-collection[j]));
					else if(Math.abs(temp-tarr[j])<=maxJump)
						{
						System.out.println("In value "+tarr[j]);
						System.out.println("temp in : "+temp);
							cou++;
							temp=tarr[j];
							tarr[j]=-1;
							System.out.println("Count is "+cou);
							o=i;
							System.out.println("O is "+o);
							break;
						}
				}
			        System.out.println("O is "+o);
				int y=cou;
				cou=0;
				tarr=Arrays.copyOf(collection, collection.length);
				if(y==collection.length)
		        {
					System.out.println("````````````````````````````````````````````````");
		        counter++;
		        }
		 }
		 return counter;
	}
		public static void main(String args[])
				{
				int a[]={3,1,1};
				int x=starters(a,4);
				System.out.println(x);
				}
}
