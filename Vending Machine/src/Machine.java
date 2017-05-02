import java.util.ArrayList;

public class Machine {
	private double Balance; // Balance of the Machine
	private ArrayList<Product> Products = new ArrayList<Product>();  // Products of the Machine
	
	// Machine Constructor
	public Machine(){
		Balance = 0;
	}
	
	// Get Balance Method
	public double getBalance() {
		return Balance; // Return the balance
	}
	
	// Give Change Method
	public double giveChange() {
		double tempBalance = Balance; // Hold the balance temporarily
		Balance = 0; // Set the balance 0₺
		return tempBalance; // Return the holded balance
	}

	// Add Coin Method
	public void addCoin(double coin) {
		Balance += coin; // Add the coin to the balance
	}
	
	// Give Product Method
	public String giveProduct(int id){
		Product product = Products.get(id); // Find the product with index key
		if(Balance >= product.getPrice()){ // If balance is enough
			Balance -= product.getPrice(); // Take out the product's price from the balance
			return product.getName(); // Return the product's name
		} else { // If balance is not enough
			return "Insufficient Balance"; // Return an error message
		}
	}
	
	// Add Product to Machine Method
	public void addProduct(String name, double price){
		Products.add(new Product(name, price)); // Add the product to Products list with name and price meta 
	}
	
	// Get Products Method
	public ArrayList<Product> GetProducts(){
		return Products; // Return products of the machine
	}
	
}
