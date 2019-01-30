package no.hvl.dat109;

import java.awt.Graphics;
import java.util.ArrayList;

public class TerningsSett extends GameObject {
	
	private ArrayList<Terning> terninger;
	private int antallTerninger;
	private ArrayList<Terning> beholdes;
	

	public TerningsSett(int x, int y, ID id) {
		super(x,y,id);
		this.antallTerninger = 0;
		this.terninger = new ArrayList<Terning>(this.antallTerninger);
		
	}
	
	public TerningsSett(int antallTerninger, int x,int y , ID id) {
		super(x,y,id);
		this.antallTerninger = antallTerninger;
		this.terninger = new ArrayList<Terning>(antallTerninger);
	}
	
	public ArrayList<Terning> trillTerninger(int antall){
		ArrayList<Terning> alleTerninger = new ArrayList<Terning>();
		Terning terning = null;
		for(int i = 0; i<antall; i++) {
			terning = terninger.get(i);
			terning.resultat();
			alleTerninger.add(terning);
		}
		return alleTerninger;
	}
	
	/**
	 * beholder en enkelt terning i en beholdingstabell som lagres i Terningssett
	 * @param terning den terningen som skal beholdes
	 * @param dyr parametere dyr  brukes til å sette terningen til å ha et bestemt utfall istede for at den kastes
	 * tilfeldig, slik at en terning kan 'lagres' med en bestemt face value allerede regisrert til den.
	 */
	public void beholdTerning(Terning terning, String dyr){
		
		Terning skalBeholdes = new Terning(500,50,ID.Terning);
		skalBeholdes.setDyr(dyr);
		this.beholdes.add(skalBeholdes);
	}

	public int getAntallTerninger() {
		return antallTerninger;
	}

	public void setAntallTerninger(int antallTerninger) {
		this.antallTerninger = antallTerninger;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<Terning> getTerninger() {
		return terninger;
	}
	
	public void setTerninger(ArrayList<Terning> terninger) {
		this.terninger = terninger;
	}
	
	public ArrayList<Terning> getBeholdes() {
		return beholdes;
	}
	
	public void setBeholdes(ArrayList<Terning> beholdes) {
		this.beholdes = beholdes;
	}

}
