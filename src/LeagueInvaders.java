import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders implements KeyListener {
	JFrame f;
	public final int width = 500;
	public final int height = 800;
	GamePanel gp;

	public LeagueInvaders() {
		f = new JFrame();
		gp = new GamePanel();
		f.add(gp);
		f.addKeyListener(this);
		this.setup();
	}

	public static void main(String[] args) {
		LeagueInvaders l = new LeagueInvaders();

	}

	public void setup() {
		f.setSize(width, height);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("released");
	}
}
