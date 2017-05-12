import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Run the methods in alphabetical order
public class MachineJUnitTest {

	@Test
	public void AddCoin() {
	    Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(1); // Adding coin to the machine
        machine.addCoin(5); // Adding coin to the machine
        machine.addCoin(10); // Adding coin to the machine
        
        // The balance should be 3
        assertEquals(16 , machine.getBalance(), 0.01);
    }

	@Test
	public void AddCoinBalanceNotEqual() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(1); // Adding coin to the machine
        machine.addCoin(5); // Adding coin to the machine
        machine.addCoin(10); // Adding coin to the machine
        
        // The balance should be 3
        assertNotEquals(20 , machine.getBalance(), 0.01);
    }
	
	@Test
	public void GiveProduct() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(20); // Adding coin to the machine
	    
        String product = machine.giveProduct(0); // Buy a Cola
        
        // Return product should be Cola
        assertEquals("Cola" , product);
    }
	
	@Test
	public void GiveProductNotEqual() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(20); // Adding coin to the machine
        
        String product = machine.giveProduct(0); // Buy a Cola
        
        // Return product should not be Chocolate
        assertNotEquals("Chocolate" , product);
    }
	
	@Test
	public void InsufficientBalance() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(1); // Adding coin to the machine
	    
        String product = machine.giveProduct(0); // Buy a Cola
        
        // Return product should be Cola
        assertEquals("Insufficient Balance" , product);
    }
	
	@Test
	public void EnoughBalance() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(20); // Adding coin to the machine
        
        String product = machine.giveProduct(0); // Buy a Cola
        
        // Return product should not be Chocolate
        assertNotEquals("Insufficient Balance" , product);
    }
	
	@Test
	public void GiveChange() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(5); // Adding coin to the machine
        
        machine.giveProduct(0); // Buy a Cola
        
        double change = machine.giveChange(); // Take the change
        
        // Return change should be 0.5
        assertEquals(2.5 , change, 0.01);
    }
	
	@Test
	public void GiveChangeNotEqual() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(5); // Adding coin to the machine
        
        machine.giveProduct(0); // Buy a Cola
        
        double change = machine.giveChange(); // Take the change
        
        // Return change should be 0.5
        assertNotEquals(100 , change, 0.01);
    }
	
	@Test
	public void CheckBalance(){
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(10); // Adding coin to the machine
        
        machine.giveProduct(0); // Buy a Cola
        
		// The balance should be 0 after taking change
		assertEquals(7.5, machine.getBalance(), 0.01);
	}
	
	@Test
	public void CheckBalanceNotEqual() {
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(5); // Adding coin to the machine
        
        machine.giveProduct(0); // Buy a Cola
        
        // The balance should not be 3.5
        assertNotEquals(10 , machine.getBalance(), 0.01);
    }

	
	@Test
	public void CheckInStock(){
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 1); // Add a product to the machine
	    
        machine.addCoin(20); // Adding coin to the machine
	    
        String product = machine.giveProduct(0); // Buy a Cola
        
        // Return should not be "Out of Stock"
        assertNotEquals("Out of Stock" , product);
	}

	
	@Test
	public void CheckOutOfStock(){
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 0); // Add a product to the machine without stock
	    
        machine.addCoin(20); // Adding coin to the machine
	    
        String product = machine.giveProduct(0); // Buy a Cola
        
        // Return should be "Out of Stock"
        assertEquals("Out of Stock" , product);
	}
	
	@Test
	public void AddCent(){
		Machine machine = new Machine(); // Create a machine
        machine.addCoin(0.50); // Adding 50 cent to the machine
        machine.addCoin(0.25); // Adding 25 cent to the machine
        
        // The balance should be 75 Cent
        assertEquals(0.75 , machine.getBalance(), 0.01);
	}
	
	@Test
	public void AddCentNotEqual(){
		Machine machine = new Machine(); // Create a machine
        machine.addCoin(0.50); // Adding 50 cent to the machine
        machine.addCoin(0.25); // Adding 25 cent to the machine
        
        // The balance should be 75 Cent
        assertNotEquals(0.50 , machine.getBalance(), 0.01);
	}
	
	@Test
	public void AddProduct(){
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Redbull", 2.5, 1); // Add a product to the machine
	    
		ArrayList<Product> Products = machine.GetProducts(); // Get all products from the machine
		Product product = Products.get(0); // Get the first product of machine
		
		// The product should be Redbull
		assertEquals("Redbull", product.getName());
	}
	
	@Test
	public void AddProductNotEqual(){
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Redbull", 2.5, 1); // Add a product to the machine
	    
		ArrayList<Product> Products = machine.GetProducts(); // Get all products from the machine
		Product product = Products.get(0); // Get the first product of machine
		
		// The product should not be Fanta
		assertNotEquals("Fanta", product.getName());
	}
	
	@Test
	public void GiveChangeBalanceZero(){
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(5); // Adding coin to the machine
        
        machine.giveProduct(0); // Buy a Cola
        
        machine.giveChange(); // Take the change
        
        // Balance after taking change should be 0
        assertEquals(0 , machine.getBalance(), 0.01);
	}
	
	@Test
	public void GiveChangeBalanceNotZero(){
		Machine machine = new Machine(); // Create a machine
		machine.addProduct("Cola", 2.5, 5); // Add a product to the machine
	    
        machine.addCoin(5); // Adding coin to the machine
        
        machine.giveProduct(0); // Buy a Cola
        
        machine.giveChange(); // Take the change
        
        // Balance after taking change should not be 2.5
        assertNotEquals(2.5 , machine.getBalance(), 0.01);
	}
	
	@Test
	public void DefaultBalanceZero(){
		Machine machine = new Machine(); // Create a machine
		
		// Default balance should be 0
		assertEquals(0 , machine.getBalance(), 0.01);
	}
	
	@Test
	public void DefaultBalanceNotZero(){
		Machine machine = new Machine(); // Create a machine
		
		// Default balance should not be 5
		assertNotEquals(5 , machine.getBalance(), 0.01);
	}

}
