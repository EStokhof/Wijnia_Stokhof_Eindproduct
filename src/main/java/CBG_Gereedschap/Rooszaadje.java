package CBG_Gereedschap;

import CBG_Planten.Roos;
import CBG_Tiles.BoardsTile;

//gecontroleerd
public class Rooszaadje extends ZakZaadjes{

	@Override
	public void plantActie(BoardsTile tile) {
		System.out.println("Gebruik rooszaadjes!");

		Roos roos = new Roos(tile);
		tile.setPlant(roos);
	}
}
