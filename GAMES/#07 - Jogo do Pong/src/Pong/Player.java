package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	public boolean right,left;
	public static double spd = 2.5;
	public int x,y;
	public int width,height;
	
	public Player(int x,int y) {
		this.x = x;
		this.y = y;
		this.width = 30;
		this.height = 6;
	}
	
	public void tick() {
		if(right) {
			x+=spd;
		}else if(left) {
			x-=spd;
		}
		
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}else if(x < 0) {
			x = 0;
		}
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
		g.setColor(Color.white);
		g.drawRect(x, y, width, height);
	}
}
