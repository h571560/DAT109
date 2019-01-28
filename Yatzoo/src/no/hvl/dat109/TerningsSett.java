package no.hvl.dat109;

import java.util.ArrayList;

public class TerningsSett {
	
	ArrayList<Terning> terninger;
	private int antallTerninger;
	ArrayList<Terning> beholdes;
	
	public TerningsSett() {
		this.antallTerninger = 0;
		this.terninger = new ArrayList<Terning>(this.antallTerninger);
		
	}
	
	public TerningsSett(Integer antallTerninger) {
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
		
		Terning skalBeholdes = new Terning();
		skalBeholdes.setDyr(dyr);
		this.beholdes.add(skalBeholdes);
	}

	public int getAntallTerninger() {
		return antallTerninger;
	}

	public void setAntallTerninger(int antallTerninger) {
		this.antallTerninger = antallTerninger;
	}

}
