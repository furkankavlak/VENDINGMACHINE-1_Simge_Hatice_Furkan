import java.util.ArrayList;

public class Machine {
	private double Balance;
	private ArrayList<Product> Products = new ArrayList<Product>(); 
	
	public Machine(){
		Balance = 0;
		Products.add(new Product("Cola", 2.5));
	}

	public double getBalance() {
		return Balance;
	}
	
	public double giveChange() {
		double tempBalance = Balance;
		Balance = 0;
		return tempBalance;
	}

	public void addCoin(double coin) {
		Balance += coin;
	}
	
	public String giveProduct(int id){
		Product product = Products.get(id);
		if(Balance >= product.getPrice()){
			Balance -= product.getPrice();
			return product.getName();
		} else {
			return "Insufficient Balance";
		}
	}
	
}
