package no.hvl.dat109;

import java.awt.Graphics;
import java.util.ArrayList;

public class Yatzoo extends GameObject {

	private String rundeType;
	private TerningsSett kopp;
	private ArrayList<Resultatblokk> resultatBlokker;
	private ArrayList<Spiller> spillere;

	/**
	 * default konstruktør for Yatzoo Spillet setter rundetype til den første og
	 * lager en liste med to spillere
	 */
	public Yatzoo() {
		super(YatzooMain.WIDTH,YatzooMain.HEIGHT, ID.Yatzoo);
		this.rundeType = "løver";
		this.kopp = new TerningsSett(500, 500, 5, ID.TerningsSett);
		this.spillere = new ArrayList<Spiller>(5);
		this.resultatBlokker = new ArrayList<Resultatblokk>(spillere.size());
		this.resultatBlokker.add(new Resultatblokk(1, 1, ID.Resultatblokk1));
		this.resultatBlokker.add(new Resultatblokk(1, 1, ID.Resultatblokk2));
		this.resultatBlokker.add(new Resultatblokk(1, 1, ID.Resultatblokk3));
		this.resultatBlokker.add(new Resultatblokk(1, 1, ID.Resultatblokk4));
		this.resultatBlokker.add(new Resultatblokk(1, 1, ID.Resultatblokk5));

	}
	
	public void spillTrekk(Spiller spiller) {
		boolean fornoyd = false;
		int trykk = 0;
		
		while (!fornoyd && trykk < 3) {
			if (spiller.trykket()) {
				kopp.trillTerninger(kopp.getTerninger().size() - spiller.getBehold().getAntallTerninger());
				trykk++;
			}
		}
	}

	public void spillRunde() {
		int runder = 12;
		for (int i = 0; i < runder; i++) {
			for (Spiller s : spillere) {
				spillTrekk(s);
			}
		}

	}

	public Spiller spillerVant() {
		return(regelBok.visResultat());
	}

	public void delUt() {
		for (Resultatblokk r : resultatBlokker) {
				for(Spiller s:spillere) {
					if(s.getResultatBlokk() == null && r.getBruker() == null) {
						s.setResultatBlokk(r);
						r.setBruker(s);
					}
			}
		}
	}

	public void leggTilSpiller(Spiller spiller) {
		spillere.add(spiller);
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

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub

	}

}
