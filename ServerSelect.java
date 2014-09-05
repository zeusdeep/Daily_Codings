import java.util.Arrays;


public class ServerSelect {
	public static boolean ReturnSeverCanDo(int task[],int capacity[])
		{
		Arrays.sort(task);
		Arrays.sort(capacity);
		String s=Arrays.toString(task);
		int sum_task=0;
		int sum_capacity=0;
		for(int i=0;i<task.length;i++)
		{
			sum_task+=task[i];
		}
		for(int i=0;i<capacity.length;i++)
		{
			sum_capacity+=capacity[i];
		}
	if((task[task.length-1]<capacity[capacity.length-1])&&(sum_task<=sum_capacity))
	{
		return true;
	}
	
	return false;
}
	
	
	
	public static void main(String args[])
	{
		int task[]={4};
		int capacity[]={1,3};
		boolean out=ReturnSeverCanDo(task,capacity);
		System.out.println(out);
	}
}
