package CelestialBodyGorge;

import nl.han.ica.oopg.engine.GameEngine;
import nl.han.ica.oopg.sound.Sound;
import nl.han.ica.oopg.view.View;

// https://github.com/HANICA/oopg/wiki/03-Achtergrond-invoegen

public class CBGapp extends GameEngine {
	private Player player;
    private Sound backgroundSound;
    
    // Deze regel maakt het makkelijker om te refereren naar je plaatjes.
    public static String MEDIA_URL = "src/main/java/CelestialBodyGorge/media/";
    
    public static void main(String[] args) {
        CBGapp tw = new CBGapp();
        tw.runSketch();
    }

    @Override
    public void setupGame() {
        int worldWidth = 500;
        int worldHeight = 500;
        
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
    }

    @Override
    public void update() {
        // Dit doet nog helemaal niks
        
    }
    
    private void initializeSound() { 
    	backgroundSound = new Sound(this, "src/main/java/CelestialBodyGorge/media/");
    	
    }
}
