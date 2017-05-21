import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;

	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {
		x++;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 100, 100);
	}
}
