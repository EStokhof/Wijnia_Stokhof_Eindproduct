package CelestialBodyGorge;

import nl.han.ica.oopg.tile.Tile;

public class Rooszaadje extends ZakZaadjes{
CBGapp world;

	public Rooszaadje(CBGapp world) {
		this.world = world;
	}

	@Override
	public void plantActie(Player speler) {
		BoardsTile tile = world.getTileOnPlayerPosition();
		
		System.out.println("Gebruik rooszaadjes!");
	
		if(tile.getGeschoffeld() == true && tile.getPlant() != null) {

			Roos roos = new Roos(tile);
			tile.setPlant(roos);
			
		}
		
		
		
	}
}
