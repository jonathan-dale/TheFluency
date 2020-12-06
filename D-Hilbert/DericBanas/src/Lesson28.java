import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Lesson28 extends JFrame {
	
	JButton button1, button2, button3, button4, button5;
	String oututString = "";
	
	public static void main(String[] args) {
		
		new Lesson28();
	}
	
	public Lesson28() {
		
		// Create the frame, position it and handel closing it
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("New Frame 6?");
		
		/* Flow layout */
		JPanel thePanel = new JPanel();
		// Define the flow layout 
		// FlowLayout.RIGHT or FlowLayout.Left ....
		thePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		// You can also define the pixels that separate the components
		// FLowLayout(alignment, horz gap, vertical gap);
		
		//button1 = new JButton("Button1");
		//thePanel.add(button1, BorderLayout.PAGE_END);
		
		/* end of FlowLayout section
		 * 
		 *  start BORDER LAYOUT section
		 */
		
		thePanel.setLayout(new BorderLayout());
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		button3 = new JButton("Button3");
		button4 = new JButton("Button4");
		button5 = new JButton("Button5");
		
		// If you put components in the same space the last one in 
		// is the only one that stays like this
		// thePanel.add(button1, BorderLayout.NORTH);
		// thePanel.add(button2, BorderLayout.NORTH);
		// Only button2 shows up
		thePanel.add(button1, BorderLayout.NORTH);
		thePanel.add(button2, BorderLayout.NORTH);
		thePanel.add(button3, BorderLayout.SOUTH);
		thePanel.add(button4, BorderLayout.CENTER);
		thePanel.add(button5, BorderLayout.NORTH);
		
		/* If you want more than one component to show up on the same
		 * part of a border layout put them in a panel and then add the 
		 * panel to the border layout panel
		 */
		
		JPanel thePanel2 = new JPanel();
		
		thePanel2.add(button2);
		thePanel2.add(button3);
		
		thePanel.add(thePanel2, BorderLayout.SOUTH);
		
		/* End of Border Layout
		 * 
		 *  Begin BOX LAYOUT section
		 */
		
		
		this.add(thePanel);
		this.setVisible(true);
		
		
	}

}
