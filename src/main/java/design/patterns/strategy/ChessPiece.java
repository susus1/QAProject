package design.patterns.strategy;

import java.util.List;

public class ChessPiece {
	private MoveStrategy moveStrategy;
	private Square square;
	

	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}
	
	public List<Square> getMoves(){
		return moveStrategy.moves(square);
	}

	public void setSquare(Square square) {
		this.square = square;
	}
	

}
