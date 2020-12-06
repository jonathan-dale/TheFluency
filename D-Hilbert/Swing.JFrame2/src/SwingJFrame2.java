	import javax.swing.JFrame;
	import javax.swing.SwingUtilities;
	
	
public class SwingJFrame2 {
	public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		public void run() {
				JFrame frame1 = new JFrame("Hello Java");
				frame1.setSize(500, 600);
				frame1.setVisible(true);
				frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame1.setLocation(25, 45);
				//frame1.setJMenuBar(JAVAJFrame.swingAPP);
		}
	});
	}

}

