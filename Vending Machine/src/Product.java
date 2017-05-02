
public class Product {
	private String Name; // Product Name
	private double Price; // Product Price
	
	// Product Constructor
	public Product(String name, double price){
		Name = name; // Set the Product Name
		Price = price; // Set the Product Price
	}
	
	// Get Product Price Method
	public double getPrice(){
		return Price; // Return the product's price
	}
	
	// Get Product Name Method
	public String getName(){
		return Name; // Return the product's name
	}
}
