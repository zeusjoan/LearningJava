public class EchoTester2 {
  public static void main(String[] args) {
    Echo e1 = new Echo();
    Echo e2 = new Echo(); // poprawna odpowied 
    // -- lub --
   // Echo e2 = e1; // odpowied  na pytanie dodatkowe
    int x = 0;
    while ( x < 4 ) {
      e1.witaj();
      e1.ilosc = e1.ilosc + 1;
	  System.out.println(e1.ilosc);
      if ( x == 3 ) {
e2.ilosc = e2.ilosc + 1;
System.out.println(e2.ilosc);
      }
      if ( x > 0 ) {
e2.ilosc = e2.ilosc + e1.ilosc;
System.out.println(e2.ilosc);
      }
      x = x + 1;
    }
    System.out.println(e2.ilosc);
  }
}