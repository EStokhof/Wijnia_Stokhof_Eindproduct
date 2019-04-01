package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public class Schoffel extends Gereedschap {

    Sprite geschoffeldeGrond = new Sprite("src/main/java/CelestialBodyGorge/media/grond/geschoffeldeGrond.png");
	
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik schoffel!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		
		if (boardstile.getSchoffelbaar() == true) {
			boardstile.setGeschoffeld(true);
			boardstile.setSprite(geschoffeldeGrond);
			
		}
		
	}

}
