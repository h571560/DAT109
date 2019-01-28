package no.hvl.dat109;

import java.awt.Color;
import java.awt.Graphics;

public class Resultatblokk extends GameObject{
	
	private int poengsum;
	private Spiller bruker;
	private Yatzoo eier;
	
	public Resultatblokk(int x, int y, ID id) {
		super(x,y,id);
		setPoengsum(0);
	}
	
	public Resultatblokk(Spiller bruker,int x, int y, ID id) {
		super(x,y,id);
		this.bruker = bruker;
		setPoengsum(0);
	}
	
	public Spiller getBruker() {
		return bruker;
	}

	public void setBruker(Spiller bruker) {
		this.bruker = bruker;
	}

	public Yatzoo getEier() {
		return eier;
	}

	public void setEier(Yatzoo eier) {
		this.eier = eier;
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
		g.fillRect(bruker.getX(),bruker.getY(),200,400);
	}

}
