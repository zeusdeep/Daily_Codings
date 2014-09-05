
public class Alien2 {
	public static int getNumber(String[] board) {
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
				//System.out.println("J :"+j);
				//System.out.println("Tab length is "+(table[0].length - r));
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
	System.out.println("I :"+i);
	System.out.println("J :"+j);
	System.out.println("R :"+r);
	System.out.println("tab :"+table.length);
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
	String ip[]={"WBBB", "WBBB", "WWWW"};
	int x=getNumber(ip);
	System.out.println(x);
}
	
	

}
