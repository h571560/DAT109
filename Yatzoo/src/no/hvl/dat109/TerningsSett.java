package no.hvl.dat109;

import java.awt.Graphics;
import java.util.ArrayList;

public class TerningsSett extends GameObject {
	
	ArrayList<Terning> terninger;
	private int antallTerninger;
	ArrayList<Terning> beholdes;
	
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
	
	public ArrayList<Terning> trill(){
		ArrayList<Terning> alleTerninger = new ArrayList<Terning>();
		for(no.hvl.dat109.Terning t:terninger) {
			t.trill();
			alleTerninger.add(t);
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

}
