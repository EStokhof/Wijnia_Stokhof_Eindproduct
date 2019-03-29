package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public class Gieter extends Tile implements IGereedschap {

	public Gieter(Sprite sprite) {
		super(sprite);
	}

	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik gieter!");
		
		// To do:
		// Check of er een plant is (stadium zaadje of hoger - niet oogstbaar)
		// Hoog het stadium op
		// Nieuwe sprite
		
	}

}
