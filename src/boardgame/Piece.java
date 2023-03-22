package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // não é necessario colocar aqui position, por que não colocando ja entra como nulo.
	}

	protected Board getBoard() {
		return board;
	}

	

}
