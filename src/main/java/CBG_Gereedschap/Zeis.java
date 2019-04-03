package CBG_Gereedschap;

import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;
import nl.han.ica.oopg.objects.Sprite;

/**
 * Een object van Zeis is een van de menu items. 
 */

public class Zeis implements IGereedschap {
	private final int VERDIENT = 50;
	private Sprite aarde = new Sprite("src/main/java/CelestialBodyGorge/media/grond/aarde1.png");
	
	  /**
     * GereedschapActie voert de actie uit van de zeis. Dit gebeurt ingame als de zeis geselecteerd
     * is in het menu en er een actie uitgevoerd wordt.   
     * 
     * @param speler Een object van de huidige speler. 
     */
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik zeis!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		
		if (boardstile.getOogstbaar() == true) {
			speler.setGoud(VERDIENT);
			boardstile.setSprite(aarde);
			boardstile.setPlant(null);
			boardstile.setGeschoffeld(false);
			boardstile.setSchoffelbaar(true);
		}
	}

}
