class testy {
	public static void main(String[] args) {
		int x;
		x = 0;
		int y = 1;
		String z = "Piesek";
		int tablicaLiczb[] = {10,20,30,40,50,60};
		String tablicaString[] = {"jeden","dwa","trzy","cztery"};
		
		int[] liczby;  // to jest deklaracja i musi byc bo tym deklarujemy typ danych
		liczby = new int[10]; // powiazane z tym co na gorze
		//int[] liczby = new int[10]; // to  samo co powyzej ale w jednej lini 
		                            // deklaracja i przypisanie
		
		
		liczby[0] = 1;
		liczby[1] = 10;
		liczby[2] = 100;
		String[] stringi;// nie chodzi o majty :)
		stringi = new String[10];
		stringi[0] = "pierwszy";
		stringi[1] = "drugi";
		stringi[2] = "pierwszy";
		stringi[3] = "trzeci";
		stringi[4] = "czwarty";
		stringi[5] = "piaty";
		//liczby = {1,2,3};
		
		System.out.println( "Teskt " + stringi[0] + " :" );
		System.out.println( "Teskt " + stringi[1] + " zmienna x  :" + x );
		System.out.println( "Teskt trzeci : " + y );
		System.out.println( "Teskt czwarty : " + z );
		System.out.println( "Teskt piaty : " + tablicaLiczb[1] + " " + tablicaLiczb[2] );
		System.out.println( "Teskt szosty : " + tablicaString[1] + " " + tablicaString[3] );
		System.out.println( "Teskt siodmy : " + tablicaString.length + " " + tablicaLiczb.length );
		System.out.println( "Teskt szosty : " + tablicaLiczb[0] + " " + tablicaString[3] );
		System.out.println( "Teskt szosty : " + liczby[1] + " " + liczby.length );
		
		System.out.println( "Ala \n ma \u0000 kota.");
		int a , b , c;
		
		a = 1;
		b = 5;
		//b++;
		//c = b = b + 1 ;
		c = b++;
		
		//c = b + 1;
		
		System.out.println( "a ma wartosc : " + a );
		System.out.println( "b ma wartosc : " + b );
		System.out.println( "c ma wartosc : " + c );
	}
}