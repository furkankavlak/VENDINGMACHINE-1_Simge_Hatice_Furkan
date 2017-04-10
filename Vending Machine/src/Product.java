
public class Product {
	private String Name;
	private double Price;
	
	public Product(String name, double price){
		Name = name;
		Price = price;
	}
	
	public double getPrice(){
		return Price;
	}
	public String getName(){
		return Name;
	}
}
