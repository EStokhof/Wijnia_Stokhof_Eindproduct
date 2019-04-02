package CelestialBodyGorge;

public class Rooszaadje extends ZakZaadjes{
	public CBGapp world;

	public Rooszaadje(CBGapp world) {
		this.world = world;
	}

	@Override
	public void plantActie(Player speler) {
		System.out.println("Gebruik rooszaadjes!");
		BoardsTile tile = world.getTileOnPlayerPosition();
	
		if (tile.getGeschoffeld() == true && tile.getPlant() != null) {
			Roos roos = new Roos(tile);
			tile.setPlant(roos);
		}
	}
}
