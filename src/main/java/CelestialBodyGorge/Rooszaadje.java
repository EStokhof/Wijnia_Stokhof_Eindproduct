package CelestialBodyGorge;

public class Rooszaadje extends ZakZaadjes{
	public CBGapp world;

	public Rooszaadje(CBGapp world) {
		this.world = world;
	}

	@Override
	public void plantActie(Player speler) {
		System.out.println("Gebruik rooszaadjes!");
		
		BoardsTile tile =speler.getTileOnPlayerPosition();
		// de boardstile waar de player opstaat wordt opgehaald. 
		
	
		if (tile.getGeschoffeld() == true && tile.getPlant() == null) {
			// als de aarde geschoffeld is, als er geen plant op staat
			
			Roos roos = new Roos(tile);
			tile.setPlant(roos); // geef roos mee aan de tile. dan zit er een plantje in
		}
	}
}
