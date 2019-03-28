package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.sound.Sound;
import nl.han.ica.oopg.tile.Tile;
import nl.han.ica.oopg.tile.TileMap;
import nl.han.ica.oopg.tile.TileType;
import nl.han.ica.oopg.view.View;

// https://github.com/HANICA/oopg/wiki/03-Achtergrond-invoegen

public class CBGapp extends GameEngine {
	private Player player;
    private Sound backgroundMusic;
    
    // Deze regel maakt het makkelijker om te refereren naar je plaatjes.
    public static String MEDIA_URL = "src/main/java/CelestialBodyGorge/media/";
    
    public static void main(String[] args) {
        CBGapp tw = new CBGapp();
        tw.runSketch();
    }

    @Override
    public void setupGame() {
        int worldWidth = 1204;
        int worldHeight = 903;
        
        // uiteraard kan je het toevoegen van
        // nieuwe game objects misschien het beste
        // in een aparte methode doen
        // i.p.v. de update zo groot te maken.
       
       // creeert de player + zet dit in de game object lijst.  
        player = new Player(this);
        addGameObject(player, 200, 200);
      
        // set de view van de game. de hele map is altijd zichtbaar.
        View view = new View(worldWidth, worldHeight);
        setView(view);
        size(worldWidth, worldHeight);
        
        initializeSound();
        initializeTileMap();
    }

    @Override
    public void update() {
        // Dit doet nog helemaal niks
        
    }
    
    private void initializeSound() { 
    	backgroundMusic = new Sound(this, "src/main/java/CelestialBodyGorge/media/soundtrack.mp3");
    	backgroundMusic.loop(-1);
    }
    
    private void initializeTileMap () { 
        Sprite grassSprite = new Sprite("src/main/java/CelestialBodyGorge/media/gras1.png");
        TileType<BoardsTile> boardTileType = new TileType<>(BoardsTile.class, grassSprite);
        Sprite aardeSprite = new Sprite("src/main/java/CelestialBodyGorge/media/aarde1.png");
        TileType<BoardsTile> boardTileType2 = new TileType<>(BoardsTile.class, aardeSprite);
    	
        TileType[] tileTypes = {boardTileType, boardTileType2};
        int tileSize = 50;
        int tilesMap[][] = {
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, 0, 1, 1, -1, -1, -1, -1},
                {-1, -1, -1, 0, 4, 1, -1, -1, -1, -1},
                {-1, -1, -1, 0, -1, 1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, 1, -1, -1, -1, -1},
                {-1, -1, -1, 0, 0, 0, 0, -1, 0, 0},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };
        tileMap = new TileMap(tileSize, tileTypes, tilesMap);
    }
}
