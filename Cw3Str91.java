class NazwaTypu{
		int przykladowyParametr;
		NazwaTypu(int wypelnienie){
			przykladowyParametr = wypelnienie;
		}
}

public class Cw3Str91 {
	public static void main(String[] args)
	{
		NazwaTypu przykladowyObiekt = new NazwaTypu(6); //6 bo to liczba doskonala jest ;P
		System.out.println(przykladowyObiekt.przykladowyParametr);
	}
}
