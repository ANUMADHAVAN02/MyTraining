class ExcersiceStaticMethod
{
	static int empid=1012;
	static long salary=10000;
	public static void multiplication()
	{
		int c=2,d=3,e=4;
		{
			System.out.println(c*d*e);
		}
		
	}
	public static void empdetails()
	{
		System.out.println("empid=1012");
		System.out.println("salary=1000");
	}
	
public static void div()
{
	int a=10;
	int b=5;
	{
		System.out.println(a/b);
	}
}
public static void main(String args[])
{
ExcersiceStaticMethod.div();	
ExcersiceStaticMethod.empdetails();
ExcersiceStaticMethod.multiplication();
}
}