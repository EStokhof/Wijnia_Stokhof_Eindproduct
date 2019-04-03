package CBG_Gereedschap;

import CBG_Planten.Planten;
import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;

//gecontroleerd
public class Gieter implements IGereedschap {

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
