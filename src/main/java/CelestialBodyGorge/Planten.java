package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileMap;

public abstract class Planten{	
	protected int stadium = 0;
	protected final int MAXSTADIUM = 3;
	protected BoardsTile tile;
	
	public Planten(BoardsTile tile) {
		this.tile = tile;
		this.tile.setSprite(getSprite());
	}

	public void setStadium() {
		if (stadium != MAXSTADIUM) {
			stadium++;
			//setSprite(stadium);
			if (stadium == MAXSTADIUM) {
				// zet tegel op oogstbaar
			}
		}
	}

	public void setOogstbaar() { 
		if(stadium == MAXSTADIUM) {
			tile.setOogstbaar(true);
		}
	}
	protected abstract Sprite getSpriteStadium0();
	protected abstract Sprite getSpriteStadium1();
	protected abstract Sprite getSpriteStadium2();
	protected abstract Sprite getSpriteStadium3();

	public Sprite getSprite() {
		switch(stadium) {
		case 1: return getSpriteStadium1();
		case 2: return getSpriteStadium2();
		case 3: return getSpriteStadium3();
		default: return getSpriteStadium0();
		}	
	}
	
}
