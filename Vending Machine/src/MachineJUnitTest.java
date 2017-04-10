import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // Run the methods in alphabetical order
public class MachineJUnitTest {
    static Machine machine = new Machine();

	@Test
	public void test1AddCoin() {
        machine.addCoin(1); // Adding coin to the machine
        machine.addCoin(1); // Adding coin to the machine
        machine.addCoin(1); // Adding coin to the machine
        
        // The balance should be 3
        assertEquals(3 , machine.getBalance(), 0.01);
 
    }
	
	@Test
	public void test2GiveProduct() {
        String product = machine.giveProduct(0);
        
        // Return product should be Cola
        assertEquals("Cola" , product);
    }
	
	@Test
	public void test3GiveChange() {
        double change = machine.giveChange();
        
        // Return change should be 0.5
        assertEquals(0.5 , change, 0.01);
    }
	
	@Test
	public void test4CheckBalance(){
		// The balance should be 0 after taking change
		assertEquals(0, machine.getBalance(), 0.01);
	}

}
