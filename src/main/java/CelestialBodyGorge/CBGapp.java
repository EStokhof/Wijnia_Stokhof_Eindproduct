package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.sound.Sound;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.View;


public class CBGapp extends GameEngine {
	private Player player;
    private Sound backgroundMusic;
 
	private TileMap tilemap;
    
    private final int WORLDWIDTH = 1200;
	private final int WORLDHEIGHT = 800;
	private final int TILESIZE = 50;

    // Deze regel maakt het makkelijker om te refereren naar je plaatjes.
    public static String MEDIA_URL = "src/main/java/CelestialBodyGorge/media/";
    
    public static void main(String[] args) {
        CBGapp tw = new CBGapp();
        tw.runSketch();
    }

    @Override
    public void setupGame() {

        // uiteraard kan je het toevoegen van
        // nieuwe game objects misschien het beste
        // in een aparte methode doen
        // i.p.v. de update zo groot te maken.
       // creeert de player + zet dit in de game object lijst.  
        player = new Player(this);
        addGameObject(player, 200, 200);
      
        // set de view van de game. de hele map is altijd zichtbaar.
        View view = new View(WORLDWIDTH, WORLDHEIGHT);
        setView(view);
        size(WORLDWIDTH, WORLDHEIGHT);
        
        initializeSound();
        initializeTileMap();
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
        
        Sprite geschoffeldSprite = new Sprite("src/main/java/CelestialBodyGorge/media/grond/geschoffeldeGrond.png");
        TileType<BoardsTile> boardTileGeschoffeld = new TileType<>(BoardsTile.class, geschoffeldSprite);
        
//        Sprite zaadjeSprite = new Sprite("src/main/java/CelestialBodyGorge/media/aarde1.png");
//        TileType<BoardsTile> boardTileZaadje = new TileType<>(BoardsTile.class, zaadjeSprite);
//        
//        Sprite roos1Sprite = new Sprite("src/main/java/CelestialBodyGorge/media/aarde1.png");
//        TileType<BoardsTile> boardTileRoos1 = new TileType<>(BoardsTile.class, roos1Sprite);
//        
//        Sprite roos2Sprite = new Sprite("src/main/java/CelestialBodyGorge/media/aarde1.png");
//        TileType<BoardsTile> boardTileRoos2 = new TileType<>(BoardsTile.class, roos2Sprite);
//        
//        Sprite aardbei1Sprite = new Sprite("src/main/java/CelestialBodyGorge/media/aarde1.png");
//        TileType<BoardsTile> boardTileAardbei1 = new TileType<>(BoardsTile.class, aardbei1Sprite);
//        
//        Sprite aardbei2Sprite = new Sprite("src/main/java/CelestialBodyGorge/media/aarde1.png");
//        TileType<BoardsTile> boardTileAardbei2 = new TileType<>(BoardsTile.class, aardbei2Sprite);
//    	
      TileType[] tileTypes = {boardTileGrass, boardTileAarde, boardTileGeschoffeld
    		  
      };
//        		boardTileZaadje, boardTileRoos1, boardTileRoos2, boardTileAardbei1, boardTileAardbei2};
        // 0 t/m 7
        int tileSize = TILESIZE;
        int tilesMap[][] = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        tileMap = new TileMap(tileSize, tileTypes, tilesMap);
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
 		return tilemap;
 	}
}
