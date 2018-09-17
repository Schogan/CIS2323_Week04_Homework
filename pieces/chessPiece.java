package pieces;

public class chessPiece{
	// Object attributes
	
	private String typeName;
	private String newColor;
	private int posX;
	private int posY;
	
	// Object Methods
	
	public String getPosition(){
		return "Piece position: " + posX + "," + posY;
		
	}
	public void setPosition(int x, int y){
		posX = x;
		posY = y;
	}
	public String getColor(){
		return newColor;
	}
	public void setColor(String color){
		newColor = color;
	}
	public String getPieceType(){
		return typeName;
	}
	public void setPieceType(String name){
		typeName = name;
	}
	public String printInfo(){
		return "This piece is a " + getPieceType() + "\n"
			+ " is color " + getColor() + "\n"
			+ " and is in \n" + getPosition();
	}
	
}