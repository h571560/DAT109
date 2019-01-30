package no.hvl.dat109;

import java.awt.Color;
import java.awt.Graphics;

public class Resultatblokk extends GameObject{
	
	private int poengsum;
	
	public Resultatblokk(int x, int y, ID id) {
		super(x,y,id);
		setPoengsum(0);
	}

	public void leggTilSide() {
		
	}

	public int getPoengsum() {
		return poengsum;
	}

	public void setPoengsum(int poengsum) {
		this.poengsum = poengsum;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(50, 700,200,400);
	}

}
