package no.hvl.dat109;

import java.awt.Graphics;
import java.util.Random;

public class Terning extends GameObject {
	
	private String verdi;
	
	public Terning(int x,int y, ID id) {
		super(x,y,id);
		setDyr("");
	}
	
	public String resultat() {
		String resultat ="";
		int tall;
		Random random = new Random();
		tall = (random.nextInt(5));
		switch(tall){
		
		case 0:
			resultat = "løve";
			break;
		case 1:
			resultat = "slange";
			break;
		case 2:
			resultat="panda";
			break;
		case 3:
			resultat="gris";
			break;
		case 4:
			resultat="elefant";
			break;
		case 5:
			resultat="hval";
			break;
		
		}
		return resultat;
	}
	public String getDyr() {
		return verdi;
	}

	public void setDyr(String dyr) {
		this.verdi = dyr;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	
	
}
