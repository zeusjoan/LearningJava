class Pies {
	String imie;
	public static void main (String[] args){
	// tworzymy obiekt Pies i uzywamy go
	Pies pies1 = new Pies();
	pies1.szczekaj();
	pies1.imie = "Azorek";
	
	System.out.println(pies1.imie + " " + pies1.szczekaj );
	}
	
	public void szczekaj() {
		System.out.println("Hal Hal Hal ....!!");
	}
}