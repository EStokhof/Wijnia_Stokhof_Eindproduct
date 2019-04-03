package CelestialBodyGorge;

import nl.han.ica.oopg.tile.TileMap;

public class Inventaris {
	private TileMap tileMap;
	
	// 2D array locaties [15][9] t/m [15][13]
	private final int YCOORD = 15;
	private final int XCOORDMIN = 9;
	private int xCoord = 9;
	
	// Normale tools index: 2 t/m 6
	// Geselecteerde tools index: 7 t/m 11
	private final int NORMALTOOLMIN = 2;
	private int normalToolIndex = 2;
	private final int SELECTEDTOOLMIN = 7;
	private int selectedToolIndex = 7;
	private final int AANTALTOOLS = 5;
	
	public Inventaris(int geselecteerd, TileMap tileMap) {
		this.tileMap = tileMap;
		tekenInventaris(geselecteerd);
	}
	
	public void tekenInventaris(int geselecteerd) {
		for (int i = 0; i < AANTALTOOLS; i++) {
			if (geselecteerd == i) {
				tileMap.setTile(xCoord, YCOORD, selectedToolIndex);
			} else {
				tileMap.setTile(xCoord, YCOORD, normalToolIndex);
			}
			xCoord++;
			selectedToolIndex++;
			normalToolIndex++;
			
			if (i == AANTALTOOLS-1) {
				xCoord = XCOORDMIN;
				selectedToolIndex = SELECTEDTOOLMIN;
				normalToolIndex = NORMALTOOLMIN;
			}
		}
	}

}
