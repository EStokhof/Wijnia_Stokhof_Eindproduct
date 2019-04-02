package CBG_Gereedschap;

import CBG_Planten.Aardbei;
import CBG_Tiles.BoardsTile;

public class Aardbeizaadje extends ZakZaadjes {
	
	@Override
	public void plantActie(BoardsTile tile) {
		System.out.println("Gebruik aarbeizaadjes!");
		
		Aardbei aardbei = new Aardbei(tile);
		tile.setPlant(aardbei);
	}
}
