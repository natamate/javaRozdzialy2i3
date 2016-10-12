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
public class Cw8Str91 
{
	public static void main(String [] args)
	{
		StaticTest pierwsza = new StaticTest();	
		StaticFun.incr();
		System.out.println(pierwsza.i);
		StaticTest druga = new StaticTest();	
		StaticFun.incr();
		System.out.println(druga.i);
		System.out.println(pierwsza.i);
	}
}