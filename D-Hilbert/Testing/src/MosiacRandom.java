



public class MosiacRandom {
	
	static final int ROWS = 30;
	static final int COLUMNS = 30;
	static final int SQUARE_SIZE = 15;
	
	static int currentRow;
	static int currentColumn;
	
	public static void main(String[] args) {
		
		Mosaic.open(ROWS, COLUMNS, SQUARE_SIZE, SQUARE_SIZE);
		colorRandomly();
		currentRow = ROWS / 2;
		currentColumn = COLUMNS / 2;
		while(Mosaic.isOpen()) {
			changeColorRandomly(currentRow, currentColumn);
			moveRandomly();
		}
		
	} // end of main
	
	
	static void colorRandomly() {
		for (int row=0; row < ROWS; row++) {
			for (int column =0; column < COLUMNS; column++) {
				changeColorRandomly(row, column);
			}
		}
		
	} // end of colorRandom
	
	static void changeColorRandomly( int rowNum, int colNum) {
		int red = (int)(256*Math.random());
		int blue = (int)(256*Math.random());
		int green = (int)(256*Math.random());
		mosaic.setColor(rowNum, colNum, red, blue, green);
		
		
	} // end of changeColorRandomly
	
	static void moveRandomly() {
		int directionNum;
		directionNum = (int)(4*Math.random());
		switch (directionNum) { 
		case 0:
			
		}
		
	} // end of moveRandomely
	
	

}
