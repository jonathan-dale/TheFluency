package tetris;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tetris1 extends JFrame {
	
	JLabel statusbar;
	
	public Tetris1() {
		
		statusbar = new JLabel(" 0");
		add(statusbar, BorderLayout.SOUTH);
		Board board = new Board(this);
		add(board);
		board.start();
		
		setSize(200, 400);
		setTitle("Tetris");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public JLabel getStatusBar() {
		return statusbar;
	}
	
	public static void main(String[] args) {
		
		Tetris1 game = new Tetris1();
		game.setLocationRelativeTo(null);;
		game.setVisible(true);
		
	}

}
