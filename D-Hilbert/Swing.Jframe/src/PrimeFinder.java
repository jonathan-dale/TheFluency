import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PrimeFinder extends JFrame implements Runnable, ActionListener {
	
	Thread go;
	JLabel howManyLabel;
	JTextField howMany;
	JButton display;
	JButton reset;
	JTextArea primes;
	
	public PrimeFinder() {
		super("Find Prime Numbers!");
		setLookAndFeel();
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout board = new BorderLayout();
		setLayout(board);
		
		howManyLabel = new JLabel("Quantity");
		howMany = new JTextField("400", 10);
		display = new JButton("Display primes");
		reset = new JButton("Reset");
		primes = new JTextArea(8, 40);
		
		display.addActionListener(this);
		JPanel topPanel = new JPanel();
		topPanel.add(howManyLabel);
		topPanel.add(howMany);
		topPanel.add(display);
		topPanel.add(reset);
		add(topPanel, BorderLayout.NORTH);
		
		primes.setLineWrap(true);
		JScrollPane textPane = new JScrollPane(primes);
		add(textPane, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	

	public void actionPerformed(ActionEvent e) {
		
		
		display.setEnabled(false);
		if (go == null) {
			go = new Thread(this);
			go.start();
		}
		
	}

	public void run() {
		int quantity = Integer.parseInt(howMany.getText());
		int numPrimes = 0;
		// candidate: the number that might be prime
		int candidate = 1;
		primes.append("first " + quantity + " primes = ");
		while (numPrimes < quantity) {
			if (isPrime(candidate)) {
				primes.append(candidate + ", ");
				numPrimes++;
			}
			candidate++;
		}
	}
		
		public static boolean isPrime(int checkNumber) {
			
			/*I dont know what is going wrong here but it prints out 9, 15, and others that are not prime
			 * this came from learn java in 24 hrs book at fairfax library
			 * 
			 * 
			 */
			
			double root = Math.sqrt(checkNumber);
			for (int i = 0; i <= root; i++) {
				if (checkNumber % 2 == 0) {
					return false;
				}
			}
			return true;
		}
		
		private void setLookAndFeel() {
			
			try { 
				UIManager.setLookAndFeel("com.java.swing.plat.nimbus.NimbusLookAndFeel");
				
			} catch (Exception e) {}
		}
	
		
		
		public static void main(String[] args) {
			new PrimeFinder();
		}
		
		
		
	}


