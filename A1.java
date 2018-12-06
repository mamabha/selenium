class A1
{
	String a;
	int b;
	float c;
	char d;
	double e;
	A1(String a,int b,float c)
	{
		this();
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	A1(String a)
	{
		this();
		System.out.println(a);
	}
		A1()
		{
			
		}
	public static void main(String args[])
	{
		A1 a=new A1("Ram",10,9.9f);
		A1 b=new A1("10");
	}
}