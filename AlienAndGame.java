
public class AlienAndGame {
	public static int getNumber(String[] board)
	{
		
		if(board.length==1)
		{
			return 1;
		}
		if (board.length==2)
		{
			//if(((board[0].charAt(0)==board[1].charAt(1))||(board[0].charAt(1)==board[1].charAt(0)))&&
			//		((board[0].charAt(0)!=board[0].charAt(1))||(board[1].charAt(0)!=board[1].charAt(1))))
			//{
			//	System.out.println("1");
				//return 1;
			//}
			
			 if(board[0].charAt(0)==board[0].charAt(1))
			{
				if((board[0].charAt(0)=='W')||(board[1].charAt(1)=='W'))
				{
					
					return 4;
				}
				if(board[0].charAt(0)=='B')
				{
					if((board[1].charAt(0)=='B')||(board[1].charAt(1)=='B'))
					{
						
					    return 1;
					}
				}
			}
			
			else if(board[1].charAt(0)==board[1].charAt(1))
			{
				if((board[0].charAt(0)=='W')||(board[1].charAt(1)=='W'))
				{
					
					return 4;
				}
				if(board[1].charAt(0)=='B')
				{
					if((board[0].charAt(0)=='B')||(board[0].charAt(1)=='B'))
					{
						System.out.println("5");
					    return 1;
					}
				}
			}
			
			return 4;
			}
		/*
		int rows=board.length;
		int col=board[0].length();
		char a[][] = new char[rows][col];
		for (int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[0].length();j++)
			{
				a[i][j]=board[i].charAt(j);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		int max=0;
		int c=0;
		int counter=0;
		int counter1=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				for (int k=0;k<col;k++)
			{
				a[i][k]='W';
				
			}
			if(i==0)
			{
				System.out.println("Goint into loop i==0 for i : "+i);
				for(int l=i+1;l<rows;l++)
				{
					for(int m=j;m<col;m++)
					{
						if(a[l][m]=='W')
						{
							counter++;
						}
						else break;
					}
					if(counter==1)
					{
						c =1;
					}
					if(counter==2)
					{
						c =4;
						System.out.println("Counter/c :"+c);
					}
					else 
					{
						int loops=counter;
						    System.out.println("Loops : "+loops);
							for(int p=loops;p>2;p--)
							{
								for (int q=0;q<col;q++)
								{
									if(a[p][q]=='W')
									{
										counter1++;
									}
									else break;
								}
								if(counter1<counter)
									break;
							}
							c=counter+counter1;
							System.out.println(c);
						}
				}
				
				
			if(c>max)
			{
				max=c;
		
			}
			
		}
			
			if(i==rows-1)
			{
				for(int l=i-1;l>0;l--)
				{
					for(int m=j;m<col;m++)
					{
						if(a[l][m]=='W')
						{
							counter++;
						}
						else break;
					}
					if(counter==1)
					{
						c =1;
					}
					if(counter==2)
					{
						c =4;
					}
					else 
					{
						int loops=counter;
						System.out.println(loops);
							for(int p=loops;p>2;p--)
							{
								for (int q=0;q<col;q++)
								{
									if(a[p][q]=='W')
									{
										counter1++;
									}
									else break;
								}
								if(counter1<counter)
									break;
							}
							c=counter+counter1;
						}
				}
				
				
			if(c>max)
			{
				max=c;
		
			}
			
		}
			
}
	}
return max;
*/
boolean[][] table = new boolean[board.length][board[0].length()];
for (int i = 0; i < table.length; i++) {
	for (int j = 0; j < table[0].length; j++) {
		table[i][j] = board[i].charAt(j) == 'W';
	}
}
for (int r = 50; r >= 0; r--) {
	
	for (int i = 0; i <= table.length - r; i++) {
		//System.out.println("OUTSIDE R "+r);
		for (int j = 0; j <= table[0].length - r; j++) {
			
			boolean ret = checkRow(table, i, j, r);
			if (ret) {
				return r * r;
			}
		}
	}
}
return -1;
}
private static boolean checkRow(boolean[][] table, int i, int j, int r) {
for (int i2 = i; i2 < i + r; i2++) {
	int count = 0;
	for (int j2 = j; j2 < j + r; j2++) {
		if (table[i2][j2] == table[i2][j]) {
			count++;
		} else {
			break;
		}
	}
	if (count != r) {
		return false;
	}
}
return true;
}

	
	public static void main(String args[])
	{
		String ip[]={"WBBB", "WBBB"};
		int x=getNumber(ip);
		System.out.println(x);
	}
	
	
}

