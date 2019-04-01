package CelestialBodyGorge;

import nl.han.ica.oopg.objects.GameObject;
import processing.core.PGraphics;

public class ObjectText extends GameObject {
	  private String text;

	    public ObjectText(String text) {
	        this.text = text;
	    }

	    public void setText(String text) {
	        this.text = text;
	    }

	    @Override
	    public void update() {

	    }

	    @Override
	    public void draw(PGraphics g) {
	        g.textAlign(g.LEFT, g.TOP);
	        g.background(0, 0, 0, 150);
	        g.textSize(22);
	        g.text(text, getX(), getY());
	    }
}
