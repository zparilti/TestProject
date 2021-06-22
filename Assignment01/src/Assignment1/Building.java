package Assignment1;
public class Building {
	
	private String symbol;
	private int width;
	private int length;	
	
	public Building(String initSymbol, int initWidth, int initLength) {	
		symbol = initSymbol;
		width = initWidth;
		length = initLength;
				
	}
	
	public int getWidth() {	
		return width;
	
	}
	
	public int getLength() {	
		return length;
	
	}
	
	public boolean isValidPlacement(Building[][] newArray,int x, int y) {
			
		return true;
	}
	
	
	
	
	public static void main(String[] args) {
			
		Building newBuild = new Building("d", 5, 3);
		System.out.println(newBuild.getWidth());
		System.out.println(newBuild.getLength());

	}
	
}
