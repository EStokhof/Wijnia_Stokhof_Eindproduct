package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import CBG_Tiles.BoardsTile;
import CBG_Tiles.BoardsTileType;
import CBG_Tiles.MenuTileType;
import nl.han.ica.oopg.dashboard.Dashboard;
import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.sound.Sound;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.View;

@SuppressWarnings("serial")
public class CBGapp extends GameEngine {
	private Player player;
	private Sound backgroundMusic;
	private ObjectText dashboardTextGoud;
	
	protected Dashboard pauzeMenu;

	private final int WORLDWIDTH = 1150;
	private final int WORLDHEIGHT = 800;
	private final int TILESIZE = 50;

	public static void main(String[] args) {
		CBGapp world = new CBGapp();
		world.runSketch();
	}

	@Override
	public void setupGame() {
		initializeSound();
		initializeTileMap();

		createDashboardGoud(150, 30); // dashboard voor het goud
		createPauzeMenu();
		
		player = new Player(this, tileMap);
		addGameObject(player, 200, 200);

		// set de view van de game. de hele map is altijd zichtbaar.
		View view = new View(WORLDWIDTH, WORLDHEIGHT);
		setView(view);
		size(WORLDWIDTH, WORLDHEIGHT);

	}

	@Override
	public void update() {

	}

	private void initializeSound() {
		backgroundMusic = new Sound(this, "src/main/java/CelestialBodyGorge/media/muziek/soundtrack.mp3");
		backgroundMusic.loop(-1);
	}

	private void initializeTileMap() {
		// deze initialiseert de tile map.
		// TILES ----------------------------
		Sprite grassSprite = new Sprite("src/main/java/CelestialBodyGorge/media/grond/gras1.png");
		BoardsTileType boardTileGrass = new BoardsTileType(grassSprite, true, true);

		Sprite aardeSprite = new Sprite("src/main/java/CelestialBodyGorge/media/grond/aarde1.png");
		BoardsTileType boardTileAarde = new BoardsTileType(aardeSprite, true, true);

		Sprite boom1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/boom1.png");
		BoardsTileType boardTileBoom1 = new BoardsTileType(boom1, false, false);

		Sprite boom2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/boom2.png");
		BoardsTileType boardTileBoom2 = new BoardsTileType(boom2, false, false);

		// MENU --------------------------------------
		// Schoffel
		Sprite schoffelNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/schoffelNormaal.PNG");
		MenuTileType boardTileSchoffelNormaal = new MenuTileType(schoffelNormaal);
		Sprite schoffelGeselecteerd = new Sprite(
				"src/main/java/CelestialBodyGorge/media/menu/schoffelGeselecteerd.PNG");
		MenuTileType boardTileSchoffelGeselecteerd = new MenuTileType(schoffelGeselecteerd);

		// Gieter
		Sprite gieterNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/gieter.png");
		MenuTileType boardTileGieterNormaal = new MenuTileType(gieterNormaal);
		Sprite gieterGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/gieterGeselecteerd.png");
		MenuTileType boardTileGieterGeselecteerd = new MenuTileType(gieterGeselecteerd);

		// Zeis
		Sprite zeisNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/zeis.png");
		MenuTileType boardTileZeisNormaal = new MenuTileType(zeisNormaal);
		Sprite zeisGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/zeisGeselecteerd.png");
		MenuTileType boardTileZeisGeselecteerd = new MenuTileType(zeisGeselecteerd);

		// Aardbeizaadje
		Sprite aardbeizaadjeNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/aardbeizaadje.PNG");
		MenuTileType boardTileAardbeizaadjeNormaal = new MenuTileType(aardbeizaadjeNormaal);
		Sprite aardbeizaadjeGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/aardbeizaadjeGeselecteerd.png");
		MenuTileType boardTileAardbeizaadjeGeselecteerd = new MenuTileType(aardbeizaadjeGeselecteerd);

		// Rooszaadje
		Sprite rooszaadjeNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/rooszaadje.PNG");
		MenuTileType boardTileRooszaadjeNormaal = new MenuTileType(rooszaadjeNormaal);
		Sprite rooszaadjeGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/rooszaadjeGeselecteerd.png");
		MenuTileType boardTileRooszaadjeGeselecteerd = new MenuTileType(rooszaadjeGeselecteerd);

		// array van alle tile types
		TileType[] tileTypes = { boardTileGrass, boardTileAarde, boardTileSchoffelNormaal, boardTileGieterNormaal,
				boardTileZeisNormaal, boardTileAardbeizaadjeNormaal, boardTileRooszaadjeNormaal,
				boardTileSchoffelGeselecteerd, boardTileGieterGeselecteerd, boardTileZeisGeselecteerd,
				boardTileAardbeizaadjeGeselecteerd, boardTileRooszaadjeGeselecteerd, boardTileBoom1, boardTileBoom2 };

		// Bodemtypes index: 0 en 1
		// Normale tools index: 2 t/m 6
		// Geselecteerde tools index: 7 t/m 11

		int tileSize = TILESIZE;
		int tilesMap[][] = { // [y][x]
				{ 13, 12, 12, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 13, 12, 13, 13 },
				{ 13, 13, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 12, 13, 12 },
				{ 12, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 13, 12 },
				{ 13, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 12 },
				{ 13, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
				{ 13, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 13, 13, 13, 13, 0, 0, 12, 12, 13, 0, 1, 1, 1 },
				{ 0, 0, 0, 12, 13, 13, 13, 12, 12, 13, 12, 12, 12, 13, 12, 13, 12, 12, 0, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 13, 13, 13, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 0, 0, 1, 1 } // 16 x 23 //
																										// (0-15) x
																										// (0-22)
		};
		tileMap = new TileMap(tileSize, tileTypes, tilesMap);
	}

	private void createDashboardGoud(int dashboardWidth, int dashboardHeight) {
		// dit is de text die het goud bijhoudt.
		Dashboard goud = new Dashboard(0, 0, dashboardWidth, dashboardHeight);
		dashboardTextGoud = new ObjectText("Goud: 400");
		goud.addGameObject(dashboardTextGoud);
		addDashboard(goud);
	}

	public void refreshDashboardText() {
		dashboardTextGoud.setText("Goud: " + player.getGoud());
	}
	
	private void createPauzeMenu() {
		// dit is het instellen van het scherm van het pauzemenu
		pauzeMenu = new Dashboard(50, 50, WORLDWIDTH-100, WORLDHEIGHT-100);
		pauzeMenu.setBackgroundImage(new Sprite("src/main/java/CelestialBodyGorge/media/player/pauze.png"));
	}

	public BoardsTile getTileOnObjectPosition(int x, int y) {
		// de tile opvragen waar een object op is
		return getTileFromTileMap(x, y);
	}

	private BoardsTile getTileFromTileMap(int x, int y) {
		// tile opvragen functie. 
		Tile tile = tileMap.getTileOnPosition(x, y);
		if (tile == null || !(tile instanceof BoardsTile)) {
			return null;
		}

		return (BoardsTile) tile;
	}

	public int getWORLDWIDTH() {
		return WORLDWIDTH;
	}

	public int getWORLDHEIGHT() {
		return WORLDHEIGHT;
	}

	public int getTILESIZE() {
		return TILESIZE;
	}

	public TileMap getTilemap() {
		return tileMap;
	}
}
