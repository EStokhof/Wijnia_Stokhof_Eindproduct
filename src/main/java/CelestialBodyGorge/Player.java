package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;
import processing.core.PConstants;

public class Player extends SpriteObject {
    private CBGapp world;

    public Player(CBGapp world) {
        // Met `.concat()` plak je 2 strings aan elkaar.
        // De methode returned een nieuwe String terug. 
        super(new Sprite(CBGapp.MEDIA_URL.concat("player.png")));
    }

    @Override
    public void update() {
        
        
    }
    
    @Override
    public void keyPressed(int keyCode, char key) {
    	final int speed = 5;
        if (keyCode == PConstants.LEFT) {
          setDirectionSpeed(270, speed);
        }
    }

}
