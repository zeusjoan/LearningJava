class Pies {
    String imie;


    public static void main (String[] args) {
        
	// tworzymy obiek pies i uzywamy go
        Pies pies1 = new Pies();
	pies1.szczekaj();
	pies1.imie = "Azorek";

        // teraz tworzymy tablice obiektow Pies
	Pies[] mojePsy = new Pies[3];
	// i zapisujemy w niej obiekty
	mojePsy[0] = new Pies();
	mojePsy[1] = new Pies();
	mojePsy[2] = pies1;  //to to jest tosamo co wyzej tylko inzczej zapisane bo juz wczesniej taki obiekt zostal stwozony do przetestowania
	//mojePsy[2] = new Pies();
	
	// teraz uzyskujemy dostep do obiektow,
	// odwolujac sie do nich przez tablice
	mojePsy[0] = "Szarik";
	mojePsy[1] = "Cywil";

	// Hm ... jak ma na imie pies
	// z komorki mojePsy[2] ?
	System.out.print("Ostatni pies ma na imie " + mojePsy[2].imie);


	// A teraz w petli kazemy
	// wszykim psa sczekac
	int x = 0;
	while ( x < mojePsy.lenght ) {
		mojePsy[x].sczekaj();
		x = x + 1;
              }
    }

    public void szczekaj() {
        System.out.println(imie + " szcekaj : Hau, hau!!");
    }
}
		
