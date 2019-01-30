package no.hvl.dat109;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	private LinkedList<GameObject> objects = new LinkedList<GameObject>();
	
	public void tick() {
		for(int i= 0; i< objects.size(); i++) {
			GameObject  tempObject = objects.get(i);
			
			tempObject.tick();
		}
	}
	

	public void render(Graphics g) {
		for(int i= 0; i< objects.size(); i++) {
			GameObject  tempObject = objects.get(i);
			
			tempObject.render(g);
		}
	}
	
	public boolean trykket(boolean trykket) {
		return trykket;
	}
	
	public void addObject(GameObject object) {
		objects.add(object);
	}
	
	public void removeObject(GameObject object) {
		objects.remove(object);
	}


	public LinkedList<GameObject> getObjects() {
		return objects;
	}


	public void setObjects(LinkedList<GameObject> objects) {
		this.objects = objects;
	}
	
}
