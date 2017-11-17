public class Petelki {
	public static void main(String[] args){
		int x = 1;
		System.out.println("Przed wykoanniem petli");
		while (x < 10){
			//System.out.println("Wewnatrz petli");
			System.out.println("Wartosc x = " + x);
			
			//x = x + 1;
			//x += 1; // to jest ten sam zapis co powyzej
			x ++;// i to tez jest to samo
			//++x; // to rowniez 
		}
	    System.out.println("I juz po petli ....");
	}
	
}