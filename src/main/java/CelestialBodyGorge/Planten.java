package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public abstract class Planten {	
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
		}
		if (stadium == MAXSTADIUM) {
			setOogstbaar();
		}
		
		//als het stadium verandert, dan ook de sprite
		Sprite sprite = getSprite();
		tile.setSprite(sprite);
	}

	public void setOogstbaar() {
		tile.setOogstbaar(true);
	}

	// Get sprite van het juiste plantje in huidig stadium
	public Sprite getSprite() {
		switch(stadium) {
			case 1:
				return getSpriteStadium1();
			case 2:
				return getSpriteStadium2();
			case 3:
				return getSpriteStadium3();
			default:
				// Default als zaadje:
				return getSpriteStadium0();
		}	
	}
	
	// Get sprites van bijbehorende plantsoort
	protected abstract Sprite getSpriteStadium0();
	
	protected abstract Sprite getSpriteStadium1();
	
	protected abstract Sprite getSpriteStadium2();
	
	protected abstract Sprite getSpriteStadium3();
	
}
