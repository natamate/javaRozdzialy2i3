class Funkcyjna{
	public int wielkosc(String s)
	{ 
		return s.length()*2;
	}	
}
public class Cw6Str91 {	
	public static void main(String[]args)
	{	
		Funkcyjna potrzebnyObiekt = new Funkcyjna();
		String testowyString1 = "slowo";
		String testowyString2 = "inne sloooooooooooooooooooooooooooooo";
		System.out.println(potrzebnyObiekt.wielkosc(testowyString1));
		System.out.println(potrzebnyObiekt.wielkosc(testowyString2));
	}
}
