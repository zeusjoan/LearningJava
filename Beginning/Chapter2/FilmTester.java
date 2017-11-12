class Film {
	String tytul;
	String rodzaj;
	int ocena;
	
	void odtworz() {
		System.out.println("Odtwarzam film.");
	}
}

public class FilmTester {
	public static void main(String[] args) {
		Film pierwszy = new Film();
		pierwszy.tytul = "Przeminelo z hossą";
		pierwszy.rodzaj = "Tragedia";
		pierwszy.ocena = 2;
		pierwszy.odtworz();
		Film drugi = new Film();
		drugi.tytul = "Ojciec chrzesny";
		drugi.rodzaj = "Sensacja";
		drugi.ocena = 6;
		drugi.odtworz();
		Film trzeci = new Film ();
		trzeci.tytul = "Incepcja";
		trzeci.rodzaj = "Fantastyka";
		trzeci.ocena = 9;
		trzeci.odtworz();
		
	}
}

