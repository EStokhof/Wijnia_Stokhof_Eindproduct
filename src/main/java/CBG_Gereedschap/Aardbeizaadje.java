package CBG_Gereedschap;

import CBG_Planten.Aardbei;
import CBG_Tiles.BoardsTile;

/**
 * Het object Aardbeizaadje wordt gebruikt als in het menu ingame het aardbeizaadje geselecteerd en
 * gebruikt is om een aardbei object aan te maken en deze in de tile te stoppen.
 */
public class Aardbeizaadje extends ZakZaadjes {
	
	/**
	 * Deze methode maakt een object van de plant en geeft  deze mee aan de tile. 
	 * 
	 *  @param tile De BoardsTile waarin de plant wordt gezet
	 */
	@Override
	public void plantActie(BoardsTile tile) {
		System.out.println("Gebruik aarbeizaadjes!");
		
		Aardbei aardbei = new Aardbei(tile);
		tile.setPlant(aardbei);
	}
}
