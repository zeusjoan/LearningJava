class PiosenkaOPiwie{
	public static void main(String[] args){

		int iloscButelek = 10;
		String slowo = "bottles";//liczba mnoga

		while (iloscButelek > 0){

			if (iloscButelek == 1){

				slowo = "bottle";//liczba pojedyncza
			}
				System.out.println(iloscButelek + " " + slowo + " of beer on the wall");			
				System.out.println(iloscButelek + " " + slowo + " of beer");
				System.out.println("Take one dawn.");
				System.out.println("Pass it arround.");

				iloscButelek = iloscButelek -1;

			if (iloscButelek > 0){
		
			  System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
			}
			else {
           			   System.out.println("No more bottles of beer on the wall");			
		
			}// koniec else
		}// koniec while
	}// koniec metody main
} //koniec klasy
