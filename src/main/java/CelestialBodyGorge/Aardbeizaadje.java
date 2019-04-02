package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Aardbeizaadje extends ZakZaadjes {
	// AARDBEIZAADJE AANPASSEN NAAR ROOSZAADJE
private CBGapp world;
Aardbeizaadje (CBGapp world) { 
	this.world = world;
}
	
	@Override
	public void plantActie(Player speler) {
		BoardsTile tile = speler.getTileOnPlayerPosition();
		
//		
		if(tile.getGeschoffeld() == true  && tile.getPlant() == null) {
			Aardbei aardbei = new Aardbei(tile);
			tile.setPlant(aardbei);
			
		}
	}

	

}
