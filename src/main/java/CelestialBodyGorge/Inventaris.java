package CelestialBodyGorge;

import nl.han.ica.oopg.tile.TileMap;

public class Inventaris {
	private TileMap tileMap;
	
	private int yCoord = 15;
	
	// 2D array locaties [15][9] t/m [15][13]
	// Normale tools index: 2 t/m 6
    // Geselecteerde tools index: 7 t/m 11
	
	private final int SCHOFFEL = 0;
	private final int GIETER = 1;
	private final int ZEIS = 2;
	private final int AARDBEIZAADJE = 3;
	private final int ROOSZAADJE = 4;
	
	public Inventaris(int geselecteerd, TileMap tileMap) {
		this.tileMap = tileMap;
		tekenInventaris(geselecteerd);
		
		
		tileMap.setTile(10, yCoord, 3);
		tileMap.setTile(11, yCoord, 4);
		tileMap.setTile(12, yCoord, 5);
		tileMap.setTile(13, yCoord, 6);
	}
	
	public void tekenInventaris(int geselecteerd) {
		if (geselecteerd == SCHOFFEL) {
			tileMap.setTile(9, yCoord, 7);
		} else {
			tileMap.setTile(9, yCoord, 2);
		}
		
		if (geselecteerd == GIETER) {
			tileMap.setTile(9, yCoord, 7);
		} else {
			tileMap.setTile(9, yCoord, 2);
		}
		
		if (geselecteerd == ZEIS) {
			tileMap.setTile(9, yCoord, 7);
		} else {
			tileMap.setTile(9, yCoord, 2);
		}
		
		if (geselecteerd == AARDBEIZAADJE) {
			tileMap.setTile(9, yCoord, 7);
		} else {
			tileMap.setTile(9, yCoord, 2);
		}
		
		if (geselecteerd == ROOSZAADJE) {
			tileMap.setTile(9, yCoord, 7);
		} else {
			tileMap.setTile(9, yCoord, 2);
		}
		
		
	}

}
