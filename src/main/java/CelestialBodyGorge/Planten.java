package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileMap;

public abstract class Planten{
	protected int stadium;
	protected int x;
	protected int y;
	protected CBGapp world;
	protected Tile tile;
	
	protected final int MAXSTADIUM = 3;
	
	public Planten(Sprite sprite, int x, int y, CBGapp world) {
		this.world = world;
		this.x = x;
		this.y = y;
		tile = world.getTileOnPlayerPosition();
		
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
