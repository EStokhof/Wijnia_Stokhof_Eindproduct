package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public class Schoffel extends Gereedschap {

    Sprite geschoffeldeGrond = new Sprite("src/main/java/CelestialBodyGorge/media/grond/geschoffeldeGrond.png");
	
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik schoffel!");
		Tile tile = speler.getTileOnPlayerPosition();
		
		if (tile.getSchoffelbaar() == true) {
			tile.setGeschoffeld(true);
			tile.setSprite(geschoffeldeGrond);
			
		}
		
	}

}
