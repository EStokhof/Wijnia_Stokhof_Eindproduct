package CelestialBodyGorge;

import nl.han.ica.oopg.tile.Tile;

public class Rooszaadje extends ZakZaadjes{
CBGapp world;
	public Rooszaadje(CBGapp world) {
		this.world = world;
	}

	@Override
	public void plantActie(Player speler) {
		System.out.println("Gebruik rooszaadjes!");
		int x = (int) speler.getxPositie();
		int y = (int)speler.getyPositie();
		
		new Roos(x, y, world);
	}
}
