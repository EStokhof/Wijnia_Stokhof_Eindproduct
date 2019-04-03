package CBG_Tiles;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.TileType;

/**
 * MenuTileType maakt de menu tiles aan via de methode uit de game
 * engine in TileType. 
 */
public class MenuTileType extends TileType<MenuTile> {

	 /**
     * Maak een nieuw object aan van MenuTileType.
     *
     * @param sprite De sprite van de menu tile. 
     */
	public MenuTileType( Sprite sprite) {
		super(MenuTile.class, sprite);
	}

}
