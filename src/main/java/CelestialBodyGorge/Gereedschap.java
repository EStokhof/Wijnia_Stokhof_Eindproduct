package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public abstract class Gereedschap extends Tile {
	
	
	Gereedschap(Sprite sprite) {
		super(sprite);
	}
	
	public abstract void gereedschapActie(Player speler);
}
