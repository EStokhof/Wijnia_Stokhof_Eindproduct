package CBG_Gereedschap;

import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;
import nl.han.ica.oopg.objects.Sprite;

/**
 * Een object van Schoffel is een van de menu items. 
 */
public class Schoffel implements IGereedschap {
    private Sprite geschoffeldeGrond = new Sprite("src/main/java/CelestialBodyGorge/media/grond/geschoffeldeGrond.png");
	
    /**
     * GereedschapActie voert de actie uit van de schoffel. Dit gebeurt ingame als de schoffel geselecterd
     * is in het menu en er een actie uitgevoerd wordt.
	
     * @param speler Een object van de huidige speler. 
     */
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik schoffel!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		
		if (boardstile.getSchoffelbaar() == true) {
			boardstile.setSchoffelbaar(false);
			boardstile.setGeschoffeld(true);
			boardstile.setSprite(geschoffeldeGrond);
		}
	}

}
