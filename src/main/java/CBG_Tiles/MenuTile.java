package CBG_Tiles;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

/**
 * Een MenuTile object is er om aan een tile, maar wel los van een tile, eigenschappen toe 
 * te voegen aan menu tiles.
 */

public class MenuTile extends Tile {

	  /**
     * Maakt een nieuw object aan van MenuTile. 
     *
     * @param sprite De sprite van de MenuTile. 
     */
	public MenuTile(Sprite sprite) {
		super(sprite);
	}
}
