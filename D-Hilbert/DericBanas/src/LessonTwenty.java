import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class LessonTwenty extends JFrame {
	public static void main(String[] args){
		
		new LessonTwenty();
		
	}
	
	public LessonTwenty(){
		
		this.setSize(400, 400);
		//this.setLocationRelativeTo(null);
		Toolkit tk = Toolkit.getDefaultToolkit();//
		Dimension dim = tk.getScreenSize();
		int xpos = (dim.width)/2 - (this.getWidth()/2);
		int ypos = (dim.height)/2 - (this.getHeight()/2);
		this.setLocation(xpos, ypos);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My first frame");
		JPanel thePanel = new JPanel();
		JLabel label1 = new JLabel();
		label1.setText("New Text");
		label1.setToolTipText("Dosent do anything");
		thePanel.add(label1);
		
		JButton button1 = new JButton("Send");
		button1.setBackground(Color.CYAN);
		button1.setBorderPainted(true);
		button1.setContentAreaFilled(false);
		button1.setText("New button");
		button1.setToolTipText("I dont do anythyng");
		thePanel.add(button1);
		
		JButton button2 = new JButton();
		button2.setBackground(Color.blue);
		button2.setBorderPainted(true);
		button2.setContentAreaFilled(true);
		button2.setText("Button 2");
		button2.setToolTipText("This alse dose nothing");
		button2.setForeground(Color.LIGHT_GRAY);
		button2.setContentAreaFilled(false);
		thePanel.add(button2);
		
		JTextField textField1 = new JTextField("Type something here", 20);
		textField1.setCaretColor(Color.GREEN);
		textField1.setBackground(Color.pink);
		textField1.setToolTipText("I dont do anything either");
		textField1.setBounds(10, 10, 10, 10);
		thePanel.add(textField1);
		
		JTextArea textArea1 = new JTextArea(15, 20);
		textArea1.setText("Just a bunch of text\n");
		textArea1.setBackground(Color.ORANGE);
		textArea1.setForeground(Color.black);
		textArea1.setColumns(20);
		textArea1.setBorder(null);
		textArea1.setToolTipText("I dont do a thing");
		textArea1.setCursor(getCursor());
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		int numOfLines = textArea1.getLineCount();
		textArea1.append("number of lines:" + numOfLines);
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		thePanel.add(scrollbar1);
		
		this.add(thePanel);
		this.setVisible(true);
		textField1.requestFocus();
		
	}

}
