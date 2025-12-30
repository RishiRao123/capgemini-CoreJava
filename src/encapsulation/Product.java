package encapsulation;

public class Product {
	// data(Variables) with private acess modifier
	private String productName;
	private int price;
	
	// Setter methods to set data(write)
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setPrice(int price) {
		// Data validation
		if(price > 0) {
			this.price = price;
		} else {
			System.out.println("Price should be greater than zero");
		}
	}
	
	// Getter methods to get data(read)
	public void  getProductName() {
		System.out.println("Product : " + this.productName);
	}
	
	public void  getPrice() {
		System.out.println("Price : " + this.price);
	}
}
