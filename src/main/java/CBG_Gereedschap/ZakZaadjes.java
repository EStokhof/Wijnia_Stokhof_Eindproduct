package CBG_Gereedschap;

import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;

/**
 * Deze class is de overkoepelende, abstracte class voor alle plantenzaadjes (Rooszaadje, Aardbeizaadje).
 *
 */
public abstract class ZakZaadjes implements IGereedschap {
	protected final int PRIJS = 40;
	
	/**<
	 * ZakZaadjes heeft de overkoepelende gereedschapActie die voor elke 
	 * subclasse geld. GereedschapsActie checkt of de condities goed zijn, en dan wordt
	 * er een plantje geplant. 
	
	 * @param speler Een object van huidige speler
	 */
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
	
	/**
	 * Een abstracte methode die wordt geimplementeerd in de subclasses van ZakZaadjes,
	 * voor het daadwerkelijk planten van de specifieke planten in de BoardsTile.
	 *  
	 * @param tile De BoardsTile waarop de speler staat. 
	 */
	public abstract void plantActie(BoardsTile tile);
}
