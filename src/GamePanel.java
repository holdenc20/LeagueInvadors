import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	public void updateMenu() {

	}

	public void drawMenu(Graphics g) {
		g.fillRect(0, 0, 600, 800);
	}

	public void updateGame() {

	}

	public void drawGame(Graphics g) {

	}

	public void updateEnd() {

	}

	public void drawEnd(Graphics g) {

	}

	Timer t;
	// GameObject ob;
	Graphics g;

	public GamePanel() {
		System.out.println("con");
		t = new Timer(1000 / 60, this);
		// ob = new GameObject(10, 10);
		this.startGame();

	}

	public void startGame() {

		t.start();
	}

	// public void paintComponent(Graphics g) {
	// System.out.println("paint");
	// ob.draw(g);
	// }
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (currentState == MENU_STATE) {
			drawMenu(g);
		} else if (currentState == GAME_STATE) {
			drawGame(g);
		} else if (currentState == END_STATE) {
			drawEnd(g);
		}
		// ob.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		this.repaint();
		if (currentState == MENU_STATE) {
			updateMenu();
		} else if (currentState == GAME_STATE) {
			updateGame();
		} else if (currentState == END_STATE) {
			updateEnd();
		}

		// ob.update();
	}
}
