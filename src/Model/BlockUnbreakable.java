package Model;

public class BlockUnbreakable extends Block{

	public BlockUnbreakable(int X, int Y) {
		super(X, Y, 0); //0 représente couleur noire
	}

	@Override
	public boolean isObstacle() {
		return true;
	}
}
