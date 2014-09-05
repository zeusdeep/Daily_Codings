
public class stack {
	static int st[]=new int[10];
	static int top=0;
public static void push(int a)
{
	if(top==st.length-1)
	{
		System.out.println("Stack overflow");
		return;
	}
	else
	{
		top ++;
		st[top]=a;
		
	}
}
public static int pop()
{
	System.out.println("Top in pop is "+top);
	if(top==0)
	{
		System.out.println("Stack underflow");
		return -1;
	}
	else
	{
		int ret= st[top];
		System.out.println(ret);
		return ret;
	}
}
public static void pri()
{
	for(int i=0;i<st.length;i++)
	{
		System.out.print(st[i]+"");
	}
	System.out.println("Top is "+top);
}
public static void main(String args[])
{
	push(10);
	push(10);
	push(10);
	push(10);
	push(11);
	push(12);
	push(13);
	push(14);
	push(10);
	push(10);
	pri();
    int a=pop();
	System.out.println(a);
}


}
