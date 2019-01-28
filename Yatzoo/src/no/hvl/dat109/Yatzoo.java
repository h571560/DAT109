package no.hvl.dat109;

import java.util.ArrayList;

public class Yatzoo {
	
	private String rundeType;
	private TerningsSett kopp;
	private ArrayList<Resultatblokk> resultatBlokker;
	private ArrayList<Spiller> spillere;
	
	
	/**
	 * default konstruktør for Yatzoo Spillet
	 * setter rundetype til den første og 
	 * lager en liste med to spillere
	 */
	public Yatzoo() {
		this.rundeType = "lover";
		this.kopp = new TerningsSett(5);
		this.spillere = new ArrayList<Spiller>(2);
		this.resultatBlokker = new ArrayList<Resultatblokk>(spillere.size());
		
	}

	public Yatzoo(ArrayList<Spiller> spillere) {
		this.rundeType = "lover";
		this.kopp = new TerningsSett(5);
		this.resultatBlokker = new ArrayList<Resultatblokk>(spillere.size());
		
	}
	
	
	public void leggTilSpiller(Spiller spiller) {
		spillere.add(spiller);
	}
	
	
	public void startSpill() {
		
	}
	
	public String getRundeType() {
		return rundeType;
	}
	public void setRundeType(String rundetype) {
		this.rundeType = rundetype;
	}
	public TerningsSett getKopp() {
		return kopp;
	}
	public void setKopp(TerningsSett kopp) {
		this.kopp = kopp;
	}
	
	public ArrayList<Resultatblokk> getResultatBlokker() {
		return resultatBlokker;
	}

	public void setResultatBlokker(ArrayList<Resultatblokk> resultatBlokker) {
		this.resultatBlokker = resultatBlokker;
	}

	public ArrayList<Spiller> getSpillere() {
		return spillere;
	}

	public void setSpillere(ArrayList<Spiller> spillere) {
		this.spillere = spillere;
	}
	
	
	
	
}
