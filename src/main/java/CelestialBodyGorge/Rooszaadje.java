package CelestialBodyGorge;

public class Rooszaadje extends ZakZaadjes{
CBGapp world;

	public Rooszaadje(CBGapp world) {
		this.world = world;
	}

	@Override
	public void plantActie(Player speler) {
		BoardsTile tile = world.getTileOnPlayerPosition();
		
		System.out.println("Gebruik rooszaadjes!");
	
		if(tile.getGeschoffeld() == true) {
			Roos roos = new Roos(tile);
			tile.setPlant(roos);
			
		}
		
		
		
	}
}
