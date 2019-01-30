package no.hvl.dat109;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Spiller extends GameObject{

	private String navn;
	private Resultatblokk resultatBlokk;
	private TerningsSett behold;
	private Yatzoo spill;
	
	public TerningsSett getBehold() {
		return behold;
	}

	public void setBehold(TerningsSett behold) {
		this.behold = behold;
	}

	public Spiller(int x, int y, ID id) {
		super(x,y,id);
		this.navn = "";
		this.behold = new TerningsSett(x,y,id);
	}

	public Spiller(String navn, int x,int y,ID id) {
		super(x,y,id);
		this.navn = navn;
		this.behold = new TerningsSett(5,x,y,id);
	}
	
	public void trill(TerningsSett terninger) {
		int index = 0;
		TerningsSett trilletSett = new TerningsSett(50,100,terninger.id);
		Terning terning = null;
		for(Terning t: terninger.getTerninger()) {
			index = terninger.getTerninger().indexOf(t);
			terning = terninger.getTerninger().get(index);
			t.resultat();
			terninger.getTerninger().add(terning);
		}
		this.behold = trilletSett;
		
	}


	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
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

	public Yatzoo getSpill() {
		return spill;
	}

	public void setSpill(Yatzoo spill) {
		this.spill = spill;
	}
	
	
}
