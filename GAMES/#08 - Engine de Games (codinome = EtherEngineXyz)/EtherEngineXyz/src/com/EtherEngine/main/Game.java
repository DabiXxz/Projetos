package com.EtherEngine.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.EtherEngine.entities.Entity;
import com.EtherEngine.entities.Player;
import com.EtherEngine.graphics.Spritesheet;
import com.EtherEngine.world.World;

	public class Game extends Canvas implements Runnable,KeyListener{
	private static final long serialVersionUID = 1L;
	public static JFrame frames;
	private Thread thread;
	private boolean isRunning = true;
	private final int WIDTH = 240,HEIGHT = 160,SCALE = 3;
	private BufferedImage image;
	
	public List<Entity> entities;
	public static Spritesheet spritesheet;
	private Player player;
	public static World world;
	
	public Game() {
		addKeyListener(this);
		setPreferredSize(new Dimension(WIDTH*SCALE,HEIGHT*SCALE));
		initFrame();
		//INICIALIZANDO OBJETOS
		image = new BufferedImage(WIDTH,HEIGHT,BufferedImage.TYPE_INT_RGB);
		entities = new ArrayList<Entity>();
		spritesheet = new Spritesheet("/Spritesheet.png");
		world = new World("/map.png");
		player = new Player(0,0,16,16,spritesheet.getSprite(0, 0,16, 16));
		entities.add(player);
	}
	
	public void initFrame() {
		frames= new JFrame("EtherEngine");
		frames.add(this);
		frames.setResizable(false);
		frames.pack();
		frames.setLocationRelativeTo(null);
		frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frames.setVisible(true);
}

	public synchronized void start() {
		thread = new Thread(this);
		isRunning = true;
		thread.start();
	}

	public synchronized void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String [] args) {
		Game game = new Game();
		game.start();
	}

	public void tick() {
		for(int i = 0; i < entities.size();i++) {
			Entity e = entities.get(i);
			if(e instanceof Player) {
				// Estou Dando Tick no Player
			}
			e.tick();
		}
	}

	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = image.getGraphics();
		g.setColor(new Color(0,0,0));
		g.fillRect(0, 0, WIDTH,HEIGHT);
		/**/
		
		world.render(g);
		for(int i = 0; i < entities.size();i++) {
			Entity e = entities.get(i);
			e.render(g);
		}
		
		g.dispose();
		g = bs.getDrawGraphics();
		g.drawImage(image,0,0,WIDTH*SCALE,HEIGHT*SCALE,null);
		bs.show();
	}
	
	public void run() {
		long lastTime = System.nanoTime();
		double amontOfTicks = 60.0;
		double ns = 1000000000 / amontOfTicks;
		double delta = 0;
		int frames = 0;
		double timer = System.currentTimeMillis();
		while(isRunning) {
			long now = System.nanoTime();
			delta+= (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1) {
				tick();
				render();
				requestFocus();
				frames++;
				delta--;
			}
			
			if(System.currentTimeMillis() - timer >= 1000) {
				System.out.println("FPS: "+ frames);
					frames = 0;
					timer+= 1000;
				}
				
			}
			
		stop();
		}

	public void keyTyped(KeyEvent e) {

	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP ||
				e.getKeyCode() == KeyEvent.VK_W ) {
			//CIMA
			player.up = true;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN ||
				e.getKeyCode() == KeyEvent.VK_S) {
			//BAIXO
			player.down = true;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT ||
				e.getKeyCode() == KeyEvent.VK_D ) {
			//Direita
			player.right = true;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT ||
				e.getKeyCode() == KeyEvent.VK_A) {
			//ESQUERDA
			player.left = true;
		}
	}

	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP ||
				e.getKeyCode() == KeyEvent.VK_W ) {
			//CIMA
			player.up = false;
		}else if(e.getKeyCode() == KeyEvent.VK_DOWN ||
				e.getKeyCode() == KeyEvent.VK_S) {
			//BAIXO
			player.down = false;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT ||
				e.getKeyCode() == KeyEvent.VK_D ) {
			//Direita
			player.right = false;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT ||
				e.getKeyCode() == KeyEvent.VK_A) {
			//ESQUERDA
			player.left = false;
		}
	}


}


