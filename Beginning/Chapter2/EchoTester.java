public class EchoTester {
	public static void main (String[] args) {
		Echo e1 = new Echo();
		Echo e2 = new Echo();
		//Echo e2 = e1; //niby tak tez mozna 
		int x = 0;
		//int e3 = e1.ilosc + 1 + x ;
		//System.out.println("Dupa " + e2.ilosc + " " + e1.ilosc + e3);
		while ( x < 4 ) {
			e1.witaj();
				e1.ilosc = e1.ilosc + 1;
				//System.out.println(e1.ilosc);
			if ( x > 0 ) {
				e2.ilosc = e2.ilosc + 1;
				//System.out.println(e2.ilosc);
			}
			if (  x > 1 ) {
				e2.ilosc = e2.ilosc + e1.ilosc;
				//System.out.println(e2.ilosc);
				
			}
			x = x +1;
		}
	
		System.out.println(e2.ilosc);
	}
}