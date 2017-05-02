import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.awt.Font;

public class Frame1 {

	private JFrame frmVendingMachine;
    static Machine machine = new Machine();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmVendingMachine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	// Balance Label Declaration
	JLabel balanceLabel = new JLabel(machine.getBalance() + " ₺");
	
	/**
	 * Functions
	 */

	// Adding Balance Function
	public void addBalance(double coin){
		machine.addCoin(coin); // Add coin to the machine
		updateBalance(); // Call the Update Balance Function
	}
	
	// Update Balance From the Balance Label Function
	public void updateBalance(){
		balanceLabel.setText(String.format("%.2f", machine.getBalance()) + " ₺"); // Update the balance label
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Machine Products
		machine.addProduct("Coca-Cola", 2.5);
		machine.addProduct("Diet Coca-Cola", 2.5);
		machine.addProduct("Coca-Cola Zero", 2.5);
		machine.addProduct("Ice Tea", 2.5);
		machine.addProduct("Redbull", 2.5);
		machine.addProduct("Burn", 2.5);
		machine.addProduct("Orange Juice", 1.75);
		machine.addProduct("Apple Juice", 1.75);
		machine.addProduct("Cranberry Juice", 1.75);
		machine.addProduct("Grapefruit Juice", 1.75);
		machine.addProduct("Snickers", 2);
		machine.addProduct("Kit Kat", 1.5);
		machine.addProduct("Twix", 1);
		machine.addProduct("M&M Peanuts", 1.5);
		machine.addProduct("Cheetos", 3);
		
		// Take Products from Machine
		ArrayList<String> ProductList = new ArrayList<String>(); 
		for(Product product : machine.GetProducts()){
			ProductList.add(product.getName() + " - " + product.getPrice() + "₺");
		}
		
		// List the Products
		JList<String> productList = new JList(ProductList.toArray());
		productList.setBounds(15, 22, 400, 264);
		
		
		// Frame Settings
		frmVendingMachine = new JFrame();
		frmVendingMachine.setTitle("Vending Machine");
		frmVendingMachine.setBounds(100, 100, 544, 362);
		frmVendingMachine.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVendingMachine.setResizable(false);
		frmVendingMachine.getContentPane().setLayout(null);
		frmVendingMachine.getContentPane().add(productList);
		balanceLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		
		// Balance Text
		balanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		balanceLabel.setBounds(421, 22, 117, 29);
		frmVendingMachine.getContentPane().add(balanceLabel);
		
		// 0.05 ₺ Button
		JButton addCent5 = new JButton("0.05 ₺");
		addCent5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(0.05); // Add 0.05₺ to the Machine
			}
		});
		addCent5.setBounds(421, 57, 117, 29);
		frmVendingMachine.getContentPane().add(addCent5);

		// 0.10 ₺ Button
		JButton addCent10 = new JButton("0.10 ₺");
		addCent10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(0.10); // Add 0.10₺ to the Machine
			}
		});
		addCent10.setBounds(421, 82, 117, 29);
		frmVendingMachine.getContentPane().add(addCent10);

		// 0.25 ₺ Button
		JButton addCent25 = new JButton("0.25 ₺");
		addCent25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(0.25); // Add 0.25₺ to the Machine
			}
		});
		addCent25.setBounds(421, 107, 117, 29);
		frmVendingMachine.getContentPane().add(addCent25);

		// 0.50 ₺ Button
		JButton addCent50 = new JButton("0.50 ₺");
		addCent50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(0.50); // Add 0.50₺ to the Machine
			}
		});
		addCent50.setBounds(421, 132, 117, 29);
		frmVendingMachine.getContentPane().add(addCent50);

		// 1 ₺ Button
		JButton addCoin1 = new JButton("1 ₺");
		addCoin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(1); // Add 1₺ to the Machine
			}
		});
		addCoin1.setBounds(421, 157, 117, 29);
		frmVendingMachine.getContentPane().add(addCoin1);

		// 5 ₺ Button
		JButton addCoin5 = new JButton("5 ₺");
		addCoin5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(5); // Add 5₺ to the Machine
			}
		});
		addCoin5.setBounds(421, 182, 117, 29);
		frmVendingMachine.getContentPane().add(addCoin5);

		// 10 ₺ Button
		JButton addCoin10 = new JButton("10 ₺");
		addCoin10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(10); // Add 10₺ to the Machine
			}
		});
		addCoin10.setBounds(421, 207, 117, 29);
		frmVendingMachine.getContentPane().add(addCoin10);

		// 20 ₺ Button
		JButton addCoin20 = new JButton("20 ₺");
		addCoin20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(20); // Add 20₺ to the Machine
			}
		});
		addCoin20.setBounds(421, 232, 117, 29);
		frmVendingMachine.getContentPane().add(addCoin20);

		// 50 ₺ Button
		JButton addCoin50 = new JButton("50 ₺");
		addCoin50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(50); // Add 50₺ to the Machine
			}
		});
		addCoin50.setBounds(421, 257, 117, 29);
		frmVendingMachine.getContentPane().add(addCoin50);

		// 100 ₺ Button
		JButton addCoin100 = new JButton("100 ₺");
		addCoin100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(100); // Add 100₺ to the Machine
			}
		});
		addCoin100.setBounds(421, 282, 117, 29);
		frmVendingMachine.getContentPane().add(addCoin100);

		// 200 ₺ Button
		JButton addCoin200 = new JButton("200 ₺");
		addCoin200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBalance(200); // Add 200₺ to the Machine
			}
		});
		addCoin200.setBounds(421, 307, 117, 29);
		frmVendingMachine.getContentPane().add(addCoin200);
		
		
		// Get Product Button
		JButton btnGetProduct = new JButton("Get Product");
		btnGetProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// If no product selected give an error 
				if(productList.isSelectionEmpty()){
					JOptionPane.showMessageDialog(frmVendingMachine, "You didn't select a product.", "Select a Product", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				int selectedProduct = productList.getSelectedIndex(); // Selected Product
				String product = machine.giveProduct(selectedProduct); // Give Product Function
				updateBalance(); // Update the Balance Label
				
				if(product != "Insufficient Balance") // If balance is enough give the selected product
					JOptionPane.showMessageDialog(frmVendingMachine, "You bought a/an " + product, "Give the Product", JOptionPane.PLAIN_MESSAGE); // Give a message
				else // Else  give an error
					JOptionPane.showMessageDialog(frmVendingMachine, "You don't have enough money to take this product", "Insufficient Balance", JOptionPane.ERROR_MESSAGE); // Give an error
			}
		});
		btnGetProduct.setBounds(15, 296, 200, 40);
		frmVendingMachine.getContentPane().add(btnGetProduct);
		
		// Get Change Button
		JButton btnGetcheck = new JButton("Get Change");
		btnGetcheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double change = machine.giveChange(); // Calculate the Change and Take Out from the Balance 
				updateBalance(); // Update the Balance Label
				JOptionPane.showMessageDialog(frmVendingMachine, "Here is your " + change + "₺", "Give the Change", JOptionPane.PLAIN_MESSAGE); // Give a message
			}
		});
		btnGetcheck.setBounds(215, 296, 200, 40);
		frmVendingMachine.getContentPane().add(btnGetcheck);
	}
}
