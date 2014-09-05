
public class BomberSweeper {
	static double winPercentage(String[] board)
	{
		
		int wins=0;
		int losses=0;
		
		for(int i=0;i<board.length;i++)
		{
			for (int j=0;j<board[0].length();j++)
			{
				if(board[i].charAt(j)=='B')
				{
					losses++;
				}
				
				else if(i==0)
				{
					if(j==0){
					if((board[i+1].charAt(j)=='.')&&(board[i+1].charAt(j+1)=='.')&&(board[i].charAt(j+1)=='.'))
					{
						wins++;
					}
					}
					else if(j==board[0].length()-1)
					{
						if((board[i].charAt(j-1)=='.')&&(board[i+1].charAt(j-1)=='.')&&(board[i+1].charAt(j)=='.'))
						{
							wins++;
						}
					}
					else 
					{
						if((board[i].charAt(j-1)=='.')&&(board[i+1].charAt(j-1)=='.')&&(board[i+1].charAt(j)=='.')&&
							(board[i].charAt(j+1)=='.')&&(board[i+1].charAt(j+1)=='.'))
						{
							wins++;
						}
					}
				}
				
				
				else if(i==board.length-1)
				{
					if(j==0){
					if((board[i-1].charAt(j)=='.')&&(board[i-1].charAt(j+1)=='.')&&(board[i].charAt(j+1)=='.'))
					{
						wins++;
					}
					}
					else if(j==board[0].length()-1)
					{
						if((board[i].charAt(j-1)=='.')&&(board[i-1].charAt(j-1)=='.')&&(board[i-1].charAt(j)=='.'))
						{
							wins++;
						}
					}
					else 
					{
						if((board[i].charAt(j-1)=='.')&&(board[i-1].charAt(j-1)=='.')&&(board[i-1].charAt(j+1)=='.')&&
							(board[i].charAt(j+1)=='.')&&(board[i-1].charAt(j)=='.'))
						{
							wins++;
						}
					}
				}
				
				
				else if((j==0)&&(i!=0)&&(i!=board.length))
				{
					if((board[i+1].charAt(j+1)=='.')&&(board[i-1].charAt(j)=='.')&&(board[i-1].charAt(j+1)=='.')&&
							(board[i].charAt(j+1)=='.')&&(board[i+1].charAt(j)=='.'))
					{
						wins++;
					}
				}
				if((j==board[0].length())&&(i!=0)&&(i!=board.length))
				{
					if((board[i-1].charAt(j)=='.')&&(board[i+1].charAt(j)=='.')&&(board[i-1].charAt(j-1)=='.')&&
							(board[i].charAt(j-1)=='.')&&(board[i+1].charAt(j+1)=='.'))
					{
						wins++;
					}
				}
				
				//if((board[i].charAt(j+1)=='.')&&(board[i+1].charAt(j+1)=='.')&&(board[i-1].charAt(j+1)=='.')&&)
				
			
			else if((i!=0)&&(j!=0)&&(i!=board.length-1)&&(j!=board[0].length()))
			{
				if((board[i-1].charAt(j-1)=='.')&&(board[i-1].charAt(j)=='.')&&(board[i-1].charAt(j+1)=='.')&&
						(board[i].charAt(j-1)=='.')&&(board[i].charAt(j+1)=='.')&&
						(board[i+1].charAt(j-1)=='.')&&(board[i+1].charAt(j)=='.')&&(board[i+1].charAt(j+1)=='.'))
				{
					wins++;
				}
			}
		}
		
		}
		
		System.out.println("Wins "+wins);
		System.out.println("Losses "+losses);
		double den=wins+losses;
		double p=wins/den;
		double pro=p*100;
		return pro;
		
	}
	
	public static void main(String args[])
	{
		String temp[]={"BBBBB",
				 "B...B",
				 "B...B",
				 "B...B",
				 "BBBBB"};
		double z=winPercentage(temp);
		System.out.println(z);
	}
	
	
	
}
