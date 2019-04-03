package CBG_Gereedschap;

import CBG_Planten.Planten;
import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;

/**
 * Een object van Gieter is een van de menu items. 
 */
public class Gieter implements IGereedschap {

	  /**
     * GereedschapActie voert de actie uit van de gieter. Dit gebeurt ingame als de gieter geselecteerd
     * is in het menu en er een actie uitgevoerd wordt.   
     * 
     * @param speler Een object van de huidige speler. 
     */
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik gieter!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		//haal de tile op waar de player op staat

		if (boardstile.getPlant() != null) {
			Planten plant = boardstile.getPlant();
			plant.setStadium();
		}
	}
}
