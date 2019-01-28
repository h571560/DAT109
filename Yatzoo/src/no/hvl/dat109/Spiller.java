package no.hvl.dat109;

import java.util.ArrayList;

public class Spiller {

	private String navn;
	private Yatzoo spill;
	private Resultatblokk resultatBlokk;
	
	public Spiller() {
		this.navn = "spiller " + Math.floor(Math.random()+5);	
		this.resultatBlokk = new Resultatblokk();
	}
	
	public Spiller(String navn) {
		this.navn = navn;
		this.resultatBlokk = new Resultatblokk();
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
	
}
