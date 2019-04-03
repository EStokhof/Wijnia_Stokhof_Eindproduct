package CBG_Gereedschap;

import CBG_Planten.Roos;
import CBG_Tiles.BoardsTile;

/**
 * Het object Rooszaadje wordt gebruikt als in het menu ingame het rooszaadje geselecteerd en
 * gebruikt is om een Roos object aan te maken en deze in de tile te stoppen.
 */
public class Rooszaadje extends ZakZaadjes{

	
	/**
	 * Deze methode maakt een object van de plant en geeft  deze mee aan de tile. 
	 * 
	 *  @param tile De BoardsTile waarin de plant wordt gezet
	 */
	@Override
	public void plantActie(BoardsTile tile) {
		System.out.println("Gebruik rooszaadjes!");

		Roos roos = new Roos(tile);
		tile.setPlant(roos);
	}
}
