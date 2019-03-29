package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public abstract class Planten extends Tile {
	protected int stadium;
	protected int x;
	protected int y;
	protected Tile tegel;
	
	protected final int MAXSTADIUM = 3;
	
	Planten(Sprite sprite, int x, int y) {
		super(sprite);
		stadium = 0;
		this.x = x;
		this.y = y;
	}
	
	public void setStadium() {
		if (stadium != MAXSTADIUM) {
			stadium++;
			setSprite(stadium);
			if (stadium == MAXSTADIUM) {
				// zet tegel op oogstbaar
			}
		}
	}
	
	protected abstract void setSprite(int stadium);
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
