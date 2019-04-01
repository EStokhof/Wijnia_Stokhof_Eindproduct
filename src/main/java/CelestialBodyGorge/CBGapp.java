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
        
        // uiteraard kan je het toevoegen van
        // nieuwe game objects misschien het beste
        // in een aparte methode doen
        // i.p.v. de update zo groot te maken.
       // creeert de player + zet dit in de game object lijst.  
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
        Sprite grassSprite = new Sprite("src/main/java/CelestialBodyGorge/media/grond/gras1.png");
        TileType<BoardsTile> boardTileGrass = new TileType<>(BoardsTile.class, grassSprite);
        
        Sprite aardeSprite = new Sprite("src/main/java/CelestialBodyGorge/media/grond/aarde1.png");
        TileType<BoardsTile> boardTileAarde = new TileType<>(BoardsTile.class, aardeSprite);
        
        // Schoffel
    	Sprite schoffelNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/schoffelNormaal.PNG");
    	TileType<BoardsTile> boardTileSchoffelNormaal = new TileType<>(BoardsTile.class, schoffelNormaal);
    	Sprite schoffelGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/schoffelGeselecteerd.PNG");
    	TileType<BoardsTile> boardTileSchoffelGeselecteerd = new TileType<>(BoardsTile.class, schoffelGeselecteerd);
    	
    	// Gieter
    	Sprite gieterNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/gieter.png");
    	TileType<BoardsTile> boardTileGieterNormaal = new TileType<>(BoardsTile.class, gieterNormaal);
    	Sprite gieterGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/gieterGeselecteerd.png");
    	TileType<BoardsTile> boardTileGieterGeselecteerd = new TileType<>(BoardsTile.class, gieterGeselecteerd);
    	
    	// Zeis
    	Sprite zeisNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/zeis.png");
    	TileType<BoardsTile> boardTileZeisNormaal = new TileType<>(BoardsTile.class, zeisNormaal);
    	Sprite zeisGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/zeisGeselecteerd.png");
    	TileType<BoardsTile> boardTileZeisGeselecteerd = new TileType<>(BoardsTile.class, zeisGeselecteerd);
    	
    	// Aardbeizaadje
    	Sprite aardbeizaadjeNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/aardbeizaadje.PNG");
    	TileType<BoardsTile> boardTileAardbeizaadjeNormaal = new TileType<>(BoardsTile.class, aardbeizaadjeNormaal);
    	Sprite aardbeizaadjeGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/aardbeizaadjeGeselecteerd.png");
    	TileType<BoardsTile> boardTileAardbeizaadjeGeselecteerd = new TileType<>(BoardsTile.class, aardbeizaadjeGeselecteerd);
    	
    	// Rooszaadje
    	Sprite rooszaadjeNormaal = new Sprite("src/main/java/CelestialBodyGorge/media/menu/rooszaadje.PNG");
    	TileType<BoardsTile> boardTileRooszaadjeNormaal = new TileType<>(BoardsTile.class, rooszaadjeNormaal);
    	Sprite rooszaadjeGeselecteerd = new Sprite("src/main/java/CelestialBodyGorge/media/menu/rooszaadjeGeselecteerd.png");
    	TileType<BoardsTile> boardTileRooszaadjeGeselecteerd = new TileType<>(BoardsTile.class, rooszaadjeGeselecteerd);
    	
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
    
public Tile getTileOnObjectPosition (int x, int y) { 
	return tileMap.getTileOnPosition( x, y);
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
