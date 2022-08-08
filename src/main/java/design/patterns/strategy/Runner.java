package design.patterns.strategy;

import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessPiece chessPiece = new ChessPiece();
		Square square = new Square(2,4);
		chessPiece.setSquare(square);
		MoveStrategy strategy = new  KnightMoveStrategy();
		chessPiece.setMoveStrategy(strategy);
	 	List<Square> squares = chessPiece.getMoves();

	}

}
