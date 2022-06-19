package com.EtherEngine.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.EtherEngine.main.Game;

public class Player extends Entity{

	public boolean up,down,left,right;
	public int up_dir = 0,down_dir = 1,left_dir = 2,right_dir = 3;
	public int dir = 0;
	public double spd = 1.5;

	private int frames = 0, maxFrames = 5, index = 0, maxIndex = 3;
	private boolean moved = false;
	private BufferedImage[] UpPlayer;
	private BufferedImage[] DownPlayer;
	private BufferedImage[] LeftPlayer;
	private BufferedImage[] RightPlayer;
	
	public Player(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		UpPlayer = new BufferedImage[4];
		DownPlayer = new BufferedImage[4];
		LeftPlayer = new BufferedImage[4];
		RightPlayer = new BufferedImage[4];
		for(int i = 0;  i < 4;i++) {
			UpPlayer[i] = Game.spritesheet.getSprite(0+ (i*16), 16, 16,16);
		}
		for(int i = 0;  i < 4;i++) {
			DownPlayer[i] = Game.spritesheet.getSprite(0+ (i*16), 0, 16,16);
		}
		for(int i = 0;  i < 4;i++) {
			LeftPlayer[i] = Game.spritesheet.getSprite(0+ (i*16), 48, 16,16);
		}
		for(int i = 0;  i < 4;i++) {
			RightPlayer[i] = Game.spritesheet.getSprite(0+ (i*16), 32, 16,16);
		}
	}

	public void tick() {
		moved = false;
		if(up) {
			y-=spd;
			dir=up_dir;
			moved = true;
		}else if(down) {
			y+=spd;
			dir=down_dir;
			moved = true;
		}
		if(left) {
			x-=spd;
			dir=left_dir;
			moved = true;
		}else if(right) {
			x+=spd;
			dir=right_dir;
			moved = true;
		}
		
		if(moved) {
			frames++;
			if(frames == maxFrames) {
				frames = 0;
				index++;
				if(index > maxIndex) {
					index = 0;
				}
			}
		}
		
	}
	
	public void render(Graphics g) {
		if(dir == up_dir) {
		g.drawImage(UpPlayer[index],this.getX(),this.getY(),null);
		
		}else if(dir == down_dir) {
			g.drawImage(DownPlayer[index],this.getX(),this.getY(),null);

		}
		
		if(dir == left_dir) {
			g.drawImage(LeftPlayer[index],this.getX(),this.getY(),null);
				
		}else if(dir == right_dir) {
			g.drawImage(RightPlayer[index],this.getX(),this.getY(),null);
		
		}
			
	}	
		
}

