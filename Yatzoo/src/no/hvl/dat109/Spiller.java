package no.hvl.dat109;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Spiller extends GameObject{

	private String navn;
	private Yatzoo spill;
	private Resultatblokk resultatBlokk;
	
	public Spiller(int x, int y, ID id) {
		super(x,y,id);
		this.navn = "spiller " + Math.floor(Math.random()+5);
	}
	
	public Spiller(String navn, int x,int y, ID id) {
		super(x,y,id);
		this.navn = navn;
	}
	
	public ArrayList<Terning> trillSett() {
		TerningsSett sett = spill.getKopp();
		ArrayList<Terning> terninger = sett.trill();
		
		return terninger;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public Yatzoo getSpill() {
		return spill;
	}

	public void setSpill(Yatzoo spill) {
		this.spill = spill;
	}

	public Resultatblokk getResultatBlokk() {
		return resultatBlokk;
	}

	public void setResultatBlokk(Resultatblokk resultatBlokk) {
		this.resultatBlokk = resultatBlokk;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		
	}
	
}
