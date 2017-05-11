import static org.junit.Assert.*;

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

}
