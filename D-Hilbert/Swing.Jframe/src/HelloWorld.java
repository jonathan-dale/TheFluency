import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorld {

	public static void main(String[] args) {
		
		// Remove comments to have more jframe boxes or to put in loops.
		
		/*JFrame window = new JFrame("Hello World");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 600);
		window.setVisible(true);
		
		JFrame frame = new JFrame("Hello Seccond Frame");
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
		
		// Put the code in this invoke Later runnable with a void method
		// This will prevent crashed from happening later.
		
		SwingUtilities.invokeLater(new Runnable(){

			public void run() {
				JFrame frame2 = new JFrame("Hello Third Frame");
				frame2.setVisible(true);
				frame2.setSize(400, 300);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				
			}
		});
		

	}

}
