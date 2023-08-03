package boardgame;

public class Position {
	private int row;
	private int coluwn;
	public Position(int row, int coluwn) {
		this.row = row;
		this.coluwn = coluwn;
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColuwn() {
		return coluwn;
	}
	public void setColuwn(int coluwn) {
		this.coluwn = coluwn;
	}
	
	@Override
	public String toString() {
		return row + ", " + coluwn;
	}
	
}
