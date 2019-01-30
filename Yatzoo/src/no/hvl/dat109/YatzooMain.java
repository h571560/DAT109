package no.hvl.dat109;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class YatzooMain extends Canvas implements Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9209794224137885175L;
	public static final int WIDTH = 1600;
	public static final int HEIGHT = WIDTH/12*7;
	private Thread thread;
	private boolean running = false;
	private Handler handler;
	
	public YatzooMain() {
		
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));
		new Window(WIDTH,HEIGHT,"YATZOO",this);
		
		
		Yatzoo brett = new Yatzoo();
		
		Spiller spiller1 = new Spiller(100,500,ID.Spiller1);
		Spiller spiller2 = new Spiller(200,500,ID.Spiller2);
		
		handler.addObject(spiller1);
		handler.addObject(spiller2);
		handler.addObject(brett);
		handler.addObject(new Yatzoo());
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	public synchronized void stop() {
		try {
		thread.join();
		setRunning(false);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new YatzooMain();

	}

	@Override
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000/amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				delta--;
			}
			if(running)
				render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				frames = 0;
			}
		}
		stop();	
	}
	
	private void tick() {
		
		handler.tick();
		
	}
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		handler.render(g);
		g.dispose();
		bs.show();
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

}
