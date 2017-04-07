package Controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Model.Game;

public class Keyboard implements KeyListener{
	private Game game;
	
	private static final int player1 = 0;
	
	public Keyboard(Game game){ //constructeur
		this.game = game;
	}

	@Override //Thread?
	public void keyPressed(KeyEvent event) {
		int key = event.getKeyCode(); //Returns the integer keyCode associated with the key in this event.
		
		switch (key){
			case KeyEvent.VK_RIGHT: 
				game.movePlayer(1, 0, player1);
				break;
			case KeyEvent.VK_LEFT:
				game.movePlayer(-1, 0, player1);
				break;
			case KeyEvent.VK_DOWN:
				game.movePlayer(0, 1, player1);
				break;
			case KeyEvent.VK_UP:
				game.movePlayer(0, -1, player1);
				break;	
			/*case KeyEvent.VK_SPACE:
				game.dropBomb("nuke", player1);
				break;
			case KeyEvent.VK_B:
				game.dropBomb("bomb", player1);
			*/
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
