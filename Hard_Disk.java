
public class Hard_Disk {

	static int minDrives(int[] used, int[] total)
	{
		
		int max=total[0];
		int temp=0;
		boolean swapped = true;
        int j = 0;

		      int tmp;

		      while (swapped) {

		            swapped = false;

		            j++;

		            for (int i = 0; i < total.length - j; i++) {                                       

		                  if (total[i] <total[i + 1]) {                          

		                        tmp = total[i];

		                        total[i] = total[i + 1];

		                        total[i + 1] = tmp;

		                        swapped = true;

		                  }

		            }                

		      }
		     /* System.out.println("Total");
		     for(int m=0;m<total.length;m++){
		    	 System.out.print(total[m]);
		     }
		     
		    
		     System.out.println("USED");
		     for(int n=0;n<used.length;n++){
		    	 System.out.print(used[n]);
		     }
		     */
		     int l=0;
		     int pointer=0;
		     int k;
		      
		     for(k=0;k<total.length;k++)
		      {
		    	// System.out.println("Pointer is "+pointer);
		    	 // System.out.println("K1 : "+k);
		    	 for(l=pointer;l<used.length;l++)
		    	 {
		    		 
		    		// System.out.println("Exec "+l);
		    		 if((total[k]-used[l]>0))
		    		 {
		    			// System.out.println("If Loop entered");
		    			 total[k]-=used[l];
		    			 //System.out.println("Value of total at loop if exit "+total[k]);
		    	     }
		    		 
		    		 else if (total[k]<used[l])
		    		 {
		    			 //System.out.println("Else IF  Loop entered");
		    			 k++;
		    			 total[k]=total[k]-(used[l]-total[k-1]);
		    			// System.out.println("Value of total at loop else if for the value of k = "+k+" exit "+total[k]);
		    		 }
		    		 
		    		 
		    		 else
		    		 {
		    			 pointer=l;
		    			 break;
		    		 }
		    	 }
		    		 if(l==used.length)
		    		 {
		    			 //System.out.println("K if "+(k+1));
		    			 return (k+1);
		    			// System.exit(0);
		    		 }
		    		 else
		    		 {
		    			 //System.out.println("K else"+k); 
		    			 break;
		    		 }
		    		 }
		    		 
		     // System.out.println("K return"+k);
		    return (k+1);
	}
	public static void main(String args[])
	{
		int used[]={1,200,200,199,200,200};
		int total[]={1000,200,200,200,200,200};
		int count=minDrives(used,total);
		System.out.println(count);
	}
	
	
	
}
