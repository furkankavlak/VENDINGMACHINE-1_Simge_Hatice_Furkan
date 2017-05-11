
public class Product {
	private String Name; // Product Name
	private double Price; // Product Price
	private int Stock;
	
	// Product Constructor
	public Product(String name, double price, int stock){
		Name = name; // Set the Product Name
		Price = price; // Set the Product Price
		Stock = stock; // Set the Product Stock
	}
	
	// Get Product Price Method
	public double getPrice(){
		return Price; // Return the product's price
	}
	
	// Get Product Name Method
	public String getName(){
		return Name; // Return the product's name
	}
	
	// Get Product Stock Method
	public int getStock(){
		return Stock; // Return the product's stock
	}
	
	// Detract from Stock
	public void detractStock(){
		Stock -= 1; // Detract 1 from product's stock
	}
}
