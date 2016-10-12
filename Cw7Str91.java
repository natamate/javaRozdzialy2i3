class StaticTest
{
	static int i = 47;
}
class StaticFun
{
	int i;
	static void incr()
	{
		StaticTest.i++;
	}
}
public class Cw7Str91 
{
	public static void main(String [] args)
	{	
		StaticFun.incr();
		System.out.println(StaticTest.i);
	}
}
