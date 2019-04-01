package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.TileMap;

public abstract class Planten {
	protected int stadium;
	protected int x;
	protected int y;
	protected TileMap tileMap;
	
	protected final int MAXSTADIUM = 3;
	
	public Planten(TileMap tileMap) {
		this.tileMap = tileMap;
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
