public class A
{
	A ()
	{
		this(10);
		System.out.println("default");
	}
	A (int a)
	{
		System.out.println(a);
	}
	A(int a,int b)
	{
		this();
		System.out.println("int a & b constructor");
	}
	public static void main(String args[])
	{
		A e=new A(13,16);
	}
}