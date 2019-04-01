package CelestialBodyGorge;

import nl.han.ica.oopg.tile.TileMap;

public class Inventaris {
	private TileMap tileMap;
	
	private int yCoord = 15;
	private int xCoordMin = 9;
	private int xCoord = 9;
	
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
	}
	
	public void tekenInventaris(int geselecteerd) {
		if (geselecteerd == SCHOFFEL) {
			tileMap.setTile(9, yCoord, 7);
		} else {
			tileMap.setTile(9, yCoord, 2);
		}
		xCoord++;
		
		if (geselecteerd == GIETER) {
			tileMap.setTile(xCoord, yCoord, 8);
		} else {
			tileMap.setTile(xCoord, yCoord, 3);
		}
		xCoord++;
		
		if (geselecteerd == ZEIS) {
			tileMap.setTile(xCoord, yCoord, 9);
		} else {
			tileMap.setTile(xCoord, yCoord, 4);
		}
		xCoord++;
		
		if (geselecteerd == AARDBEIZAADJE) {
			tileMap.setTile(xCoord, yCoord, 10);
		} else {
			tileMap.setTile(xCoord, yCoord, 5);
		}
		xCoord++;
		
		if (geselecteerd == ROOSZAADJE) {
			tileMap.setTile(xCoord, yCoord, 11);
		} else {
			tileMap.setTile(xCoord, yCoord, 6);
		}
		
		xCoord = xCoordMin;
	}

}
