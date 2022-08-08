package design.patterns.strategy;

import java.util.List;

public interface MoveStrategy {
	List<Square> moves(Square current);
}
