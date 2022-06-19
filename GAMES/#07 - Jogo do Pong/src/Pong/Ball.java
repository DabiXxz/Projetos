package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {

	public double x,y;
	public int width,height;
	public double spd = 2.0;
	public double dx,dy;
	
	public Ball(int y, int x) {
		this.x = x;
		this.y = y;
		this.width = 3;
		this.height = 3;
		
		int angle = new Random().nextInt(120 - 45) + 45 + 1;
		dx = Math.cos(Math.toRadians(angle));
		dy = Math.sin(Math.toRadians(angle));
	}
	
	public void tick() {
		
		if(x+(dx*spd)+ width >= Game.WIDTH) {
			dx*=-1;
			
		}else if(x+(dx*spd) < 0) {
			dx*=-1;
		}
		
		if(y >= Game.HEIGHT) {
			//PONTO DO INIMIGO//
			System.out.println("PONTO DO INIMIGO");
			new Game();
			return;
		}else if(y < 0) {
			//PONTO DO JOGADOR//
		System.out.println("PONTO DO JOGADOR");
			new Game();
			return;
				
		}
		
		Rectangle bounds = new Rectangle((int)(x+(dx*spd)),(int)(y+(dy*spd)),width,height);
		Rectangle boundsPlayer = new Rectangle(Game.player.x,Game.player.y,Game.player.width,Game.player.height);
		Rectangle boundsEnemy = new Rectangle((int)Game.enemy.x,(int)Game.enemy.y,Game.enemy.width,Game.player.height);
		
		if(bounds.intersects(boundsPlayer)) {
			int angle = new Random().nextInt(120 - 45) + 45 + 1;
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if(dy > 0)
				dy*=-1;
		}else if(bounds.intersects(boundsEnemy)) {
			int angle = new Random().nextInt(120 - 45) + 45 + 1;
			dx = Math.cos(Math.toRadians(angle));
			dy = Math.sin(Math.toRadians(angle));
			if(dy < 0)
				dy*=-1;
		}
		
		x+=dx*spd;
		y+=dy*spd;
		
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int) x,(int) y, width, height);
	}
}
