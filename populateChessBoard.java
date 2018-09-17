import pieces.*;

public class populateChessBoard{
	public static void main(String[] args){
		final int COUNT = 16;
		
		chessPiece[] whitePieces  = new chessPiece [COUNT];
		chessPiece[] blackPieces  = new chessPiece [COUNT];
		
		int count=0;
		String type;
		
		while (count<COUNT){
			for(int i=1;i<3;i++){
				for(int j=1;j<17;j++){
					if(i=2){
						type = "pawn"; 
					}
					if(i=1 && (j=1||j=8)){
						type = "rook";
					}
					if(i=1 && (j=2||j=7)){
						type = "knight";
					}
					if(i=1 && (j=3||j=6)){
						type = "bishop";
					}
					if(i=1 && j=4){
						type = "queen";
					}
					if(i=1 && j=5){
						type = "king";
					}
					
					whitePieces = new chessPiece();
					whitePieces.createPiece("White", type);
					count++;
				}
			}
		}
		//Test piece A
		chessPiece pieceA = new chessPiece();
		System.out.println("This is the first test piece ");
		
		pieceA.setColor("white");
		pieceA.setPosition(1,1);
		pieceA.setPieceType("LeftSideRook");
		
		String pieceAstatus = pieceA.printInfo();
		System.out.println(pieceAstatus);
		
		//Test piece B
		chessPiece pieceB = new chessPiece();
		System.out.println("This is the second test piece ");
		
		pieceB.setColor("black");
		pieceB.setPosition(8,2);
		pieceB.setPieceType("RightSideBishop");
		
		String pieceBstatus = pieceB.printInfo();
		System.out.println(pieceBstatus);
		
		
	}	
}