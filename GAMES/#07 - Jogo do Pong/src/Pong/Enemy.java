package Pong;

import java.awt.Color;
import java.awt.Graphics;


public class Enemy {

	public double x,y;
	public int width,height;
	
	public Enemy(int y, int x) {
		this.x = x;
		this.y = y;
		this.width = 30;
		this.height = 6;
	}
	
	public void tick() {
		x+= (Game.ball.x - x - 6) * 0.07;
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}else if(x < 0) {
			x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int) x,(int) y, width, height);
		g.setColor(Color.white);
		g.drawRect((int) x,(int) y, width, height);
	}
	
}
