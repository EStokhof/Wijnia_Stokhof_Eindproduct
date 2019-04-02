package CBG_Tiles;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileType;

public class BoardsTileType extends TileType<BoardsTile> {

	private boolean loopbaar;
	private boolean schoffelbaar;
	
	public BoardsTileType(Sprite sprite, boolean loopbaar, boolean schoffelbaar) {
		super(BoardsTile.class, sprite);
		this.loopbaar = loopbaar;
		this.schoffelbaar = schoffelbaar;
	}
	
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
