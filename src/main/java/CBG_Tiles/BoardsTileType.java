package CBG_Tiles;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileType;

/**
 * Wanneer aangeroepen, maakt BoardsTileType de tiles aan via de methode uit de game
 * engine en zet in de BoardsTile de loopbaarheid en de schoffelbaarheid
 * van een tile.  
 */
public class BoardsTileType extends TileType<BoardsTile> {

	private boolean loopbaar;
	private boolean schoffelbaar;
	
	  /**
     * Maakt een nieuw object van het type BoardsTileType.
     * 
     * @param sprite De sprite van de tile.
     * @param loopbaar De loopbaarheid van de tile.
     * @param schoffelbaar De schoffelbaarheid van de tile. 
     */
	public BoardsTileType(Sprite sprite, boolean loopbaar, boolean schoffelbaar) {
		super(BoardsTile.class, sprite);
		this.loopbaar = loopbaar;
		this.schoffelbaar = schoffelbaar;
	}
	
	/**
	 * Met deze functie wordt de oorspronkelijke functie in de Game Engine overrided. 
	 * Deze methode creeert een nieuwe Tile en BoardsTile tegelijkertijd, op
	 * basis van de originele functie. De loopbaarheid en schoffelbaarheid worden
	 * direct verandert naar wat is meegegeven in de constructor
	 * van BoardsTileType.
	 * 
	 * @param tileSize de grootte van de tiles.
	 */
	@Override
	public Tile createNewInstanceOfTile(int tileSize) {
		// Hier overriden we de functie uit TileType 
		// met super.CreateNewInstanceOfTile(tileSize); laten we de originele functie zijn ding doen
		// dit stoppen we in BoardsTile tile, dus in tile.
		// Daarna zetten wij de loopbaarhied & schoffelbaarheid
		// en dan wordt de BoardsTile tile gereturned. 
		
		BoardsTile tile = (BoardsTile) super.createNewInstanceOfTile(tileSize);

		tile.setLoopbaar(loopbaar);
		tile.setSchoffelbaar(schoffelbaar);
		
		return tile;
	}
	
	
	

	
}
