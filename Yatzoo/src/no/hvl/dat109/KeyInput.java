package no.hvl.dat109;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;

	public KeyInput(Handler handler) {
		this.handler = handler;
	}

	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();
		for (int i = 0; i < handler.getObjects().size(); i++) {
			GameObject tempObject = handler.getObjects().get(i);
			if (tempObject != null && tempObject.getId() == ID.Spiller1) {
				Spiller spiller = (Spiller)tempObject;
				if (key == KeyEvent.VK_T && spiller.getSpill().getDenSomSpiller().getId() == ID.Spiller1) {
					TerningsSett ts = spiller.getSpill().getKopp();
					spiller.trill(ts);
				}
			}
			if (tempObject != null && tempObject.getId() == ID.Spiller2) {
				Spiller spiller = (Spiller)tempObject;
				if (key == KeyEvent.VK_T && spiller.getSpill().getDenSomSpiller().getId() == ID.Spiller2) {
					TerningsSett ts = spiller.getSpill().getKopp();
					spiller.trill(ts);
				}
			}
			if (tempObject != null && tempObject.getId() == ID.Spiller3) {
				Spiller spiller = (Spiller)tempObject;
				if (key == KeyEvent.VK_T && spiller.getSpill().getDenSomSpiller().getId() == ID.Spiller3) {
					TerningsSett ts = spiller.getSpill().getKopp();
					spiller.trill(ts);
				}
			}
			if (tempObject != null && tempObject.getId() == ID.Spiller4) {
				Spiller spiller = (Spiller)tempObject;
				if (key == KeyEvent.VK_T && spiller.getSpill().getDenSomSpiller().getId() == ID.Spiller4) {
					TerningsSett ts = spiller.getSpill().getKopp();
					spiller.trill(ts);
				}
			}
			if ( tempObject != null && tempObject.getId() == ID.Spiller5) {
				Spiller spiller = (Spiller)tempObject;
				if (key == KeyEvent.VK_T && spiller.getSpill().getDenSomSpiller().getId() == ID.Spiller5) {
					TerningsSett ts = spiller.getSpill().getKopp();
					spiller.trill(ts);
				}
			}
		}
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
