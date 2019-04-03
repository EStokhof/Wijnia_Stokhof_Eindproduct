package CelestialBodyGorge;

import nl.han.ica.oopg.objects.GameObject;
import processing.core.PGraphics;

/**
 * Dit object wordt gebruikt voor de text in een dashboard.
 */
public class ObjectText extends GameObject {
	private String text;
	private final int textSize = 22;
	
	/**
	 * Maakt een object aan van ObjectText.
	 * 
	 * @param text De text die het moet afbeelden.
	 */
	public ObjectText(String text) {
		this.text = text;
	}
	
	/**
	 * Verandert de waarde van text.
	 * @param text De nieuwe waarde die text moet krijgen.
	 */
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
