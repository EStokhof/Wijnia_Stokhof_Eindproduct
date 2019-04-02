package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.TextObject;
import nl.han.ica.oopg.dashboard.Dashboard;
import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.sound.Sound;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.View;
//import processing.core.PImage;

@SuppressWarnings("serial")
public class CBGapp extends GameEngine {
	private Player player;
    private Sound backgroundMusic;
    private ObjectText dashboardTextGoud;
    
    private final int WORLDWIDTH = 1150;
	private final int WORLDHEIGHT = 800;
	private final int TILESIZE = 50;

    // Deze regel maakt het makkelijker om te refereren naar je plaatjes.
    public static String MEDIA_URL = "src/main/java/CelestialBodyGorge/media/";
    
    public static void main(String[] args) {
        CBGapp world = new CBGapp();
        world.runSketch();
    }

    @Override
    public void setupGame() {
    	initializeSound();
        initializeTileMap();
        
        player = new Player(this, tileMap);
        addGameObject(player, 200, 200);
        createDashboard(150, 30);
        // set de view van de game. de hele map is altijd zichtbaar.
        View view = new View(WORLDWIDTH, WORLDHEIGHT);
        setView(view);
        size(WORLDWIDTH, WORLDHEIGHT);
        
    }

    @Override
    public void update() {
        // Dit doet nog helemaal niks
        
    }
    
    private void initializeSound() { 
    	backgroundMusic = new Sound(this, "src/main/java/CelestialBodyGorge/media/muziek/soundtrack.mp3");
    	backgroundMusic.loop(-1);
    }
    
    private void initializeTileMap () { 
    	
    	// TILES ----------------------------
        Sprite grassSprite = new Sprite("src/main/java/CelestialBodyGorge/media/grond/gras1.png");
        BoardsTileType boardTileGrass = new BoardsTileType(grassSprite, true, true);
        
        Sprite aardeSprite = new Sprite("src/main/java/CelestialBodyGorge/media/grond/aarde1.png");
        BoardsTileType boardTileAarde = new BoardsTileType(aardeSprite, true, true);
        
        // MENU --------------------------------------
        // Schoffel
    	Sprite schoffelNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/schoffelNormaal.PNG");
    	MenuTileType boardTileSchoffelNormaal = new MenuTileType(schoffelNormaal);
    	Sprite schoffelGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/schoffelGeselecteerd.PNG");
    	MenuTileType  boardTileSchoffelGeselecteerd = new MenuTileType(schoffelGeselecteerd);
    	
    	// Gieter
    	Sprite gieterNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/gieter.png");
    	MenuTileType  boardTileGieterNormaal = new MenuTileType( gieterNormaal);
    	Sprite gieterGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/gieterGeselecteerd.png");
    	MenuTileType  boardTileGieterGeselecteerd = new MenuTileType( gieterGeselecteerd);
    	
    	// Zeis
    	Sprite zeisNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/zeis.png");
    	MenuTileType  boardTileZeisNormaal = new MenuTileType( zeisNormaal);
    	Sprite zeisGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/zeisGeselecteerd.png");
    	MenuTileType  boardTileZeisGeselecteerd = new MenuTileType( zeisGeselecteerd);
    	
    	// Aardbeizaadje
    	Sprite aardbeizaadjeNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/aardbeizaadje.PNG");
    	MenuTileType  boardTileAardbeizaadjeNormaal =new MenuTileType( aardbeizaadjeNormaal);
    	Sprite aardbeizaadjeGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/aardbeizaadjeGeselecteerd.png");
    	MenuTileType  boardTileAardbeizaadjeGeselecteerd = new MenuTileType( aardbeizaadjeGeselecteerd);
    	
    	// Rooszaadje
    	Sprite rooszaadjeNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/rooszaadje.PNG");
    	MenuTileType  boardTileRooszaadjeNormaal =new MenuTileType( rooszaadjeNormaal);
    	Sprite rooszaadjeGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/rooszaadjeGeselecteerd.png");
    	MenuTileType  boardTileRooszaadjeGeselecteerd = new MenuTileType(rooszaadjeGeselecteerd);
    	
        TileType[] tileTypes = {boardTileGrass, boardTileAarde, boardTileSchoffelNormaal, boardTileGieterNormaal, 
        		boardTileZeisNormaal, boardTileAardbeizaadjeNormaal, boardTileRooszaadjeNormaal,
        		boardTileSchoffelGeselecteerd, boardTileGieterGeselecteerd, boardTileZeisGeselecteerd, 
        		boardTileAardbeizaadjeGeselecteerd, boardTileRooszaadjeGeselecteerd};
        
        // Bodemtypes index: 0 en 1
        // Normale tools index: 2 t/m 6
        // Geselecteerde tools index: 7 t/m 11
        
        int tileSize = TILESIZE;
        int tilesMap[][] = { 	// [y][x]
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}  // 16 x 23 // (0-15) x (0-22)
        };
        tileMap = new TileMap(tileSize, tileTypes, tilesMap);
    }
    
    

    
    private void createDashboard(int dashboardWidth, int dashboardHeight) {
        Dashboard goud = new Dashboard(0, 0, dashboardWidth, dashboardHeight);
        dashboardTextGoud = new ObjectText("Goud: ");
        goud.addGameObject(dashboardTextGoud);
        addDashboard(goud);
    }
    
    public void refreshDashboardText() { 
    	        dashboardTextGoud.setText("Goud: " + player.getGoud());
    }
    
public BoardsTile getTileOnObjectPosition (int x, int y) { 
	return getTileFromTileMap( x, y);
}
public BoardsTile getTileOnPlayerPosition () { 
	 int x = (int)player.getxPositie();
	 int y = (int) player.getyPositie();
		return getTileFromTileMap( x, y);
		
	}

	private BoardsTile getTileFromTileMap(int x, int y) {
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
