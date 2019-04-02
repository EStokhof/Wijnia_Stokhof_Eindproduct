package CelestialBodyGorge;

import nl.han.ica.oopg.objects.GameObject;
import processing.core.PGraphics;

public class ObjectText extends GameObject {
	private String text;
	private int textSize = 22;
	
	public ObjectText(String text) {
		this.text = text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public void update() {
	
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void draw(PGraphics g) {
	    g.textAlign(g.LEFT, g.TOP);
	    g.background(0, 0, 0, 150);
	    g.textSize(textSize);
	    g.text(text, getX(), getY());
	}
}
