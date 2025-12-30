package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setProductName("Cricket Bat");
		p1.setPrice(2000);
		
		p1.getProductName();
		p1.getPrice();
		
		Product p2= new Product();
		p2.setProductName("Samsung s20");
		p2.getProductName();
		p2.setPrice(-200000);
	}

}
