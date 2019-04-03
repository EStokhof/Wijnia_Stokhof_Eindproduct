package CBG_Gereedschap;

import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;

//gecontroleerd
public abstract class ZakZaadjes implements IGereedschap {
	protected final int PRIJS = 40;
	
	@Override
	public void gereedschapActie(Player speler) {
		BoardsTile tile = speler.getTileOnPlayerPosition();
		
		if (tile.getGeschoffeld() == true && tile.getPlant() == null) {
			if (speler.getGoud() >= PRIJS) {
				plantActie(tile);
				speler.setGoud(-PRIJS);
			}
		}
	}
	
	public abstract void plantActie(BoardsTile tile);
}
