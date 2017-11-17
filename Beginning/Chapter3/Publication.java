public class Publication {
	private String title;
	private String publisher;
	private int year;
	private String ident;
	private double prince;
	private int quantity;

	public Publication(String t, String pb, int y,
			   String i, double pr, int q)

	{
		title = t;
		publisher = pb;
		year = y;
		ident = i;
		prince = pr;
		quantity = q;

	}
	
	// tak zwane get-tery
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getYear() {
		return year;
	}
	public String getIdent() {
		return ident;
	}
	public double getPrice() {
		return prince;
	}
	public int getQuantity() {
		return quantity;
	}
	// tak zwane set-tesry
	public  void setPrice(double p) {
		price = p;
	}
	// a to juz co innego nie wiem jak na razie nazwac
	public void buy(int n) {
		quantity = quantity + n; //tak albo tak jak nizej mozna to zapisac
		//quantity += n; 
	}
	public void sell(int n) {
		quantity = quantity - n; //tak albo tak jak nizej mozna to zapisac
		//quantity -= n; 
	}
	
	





}
