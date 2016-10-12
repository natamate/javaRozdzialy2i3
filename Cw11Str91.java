class WszystkieKoloryTeczy{
	int liczbaCalkowitaKolorow;
	void zmienOdcienKoloru(int nowyOdcien){
		liczbaCalkowitaKolorow = nowyOdcien;
	}
}

public class Cw11Str91 {
	public static void main(String[] args){
		WszystkieKoloryTeczy nowaTecza = new WszystkieKoloryTeczy();
		System.out.println(nowaTecza.liczbaCalkowitaKolorow);
		nowaTecza.zmienOdcienKoloru(1);
		System.out.println(nowaTecza.liczbaCalkowitaKolorow);

	}
}
