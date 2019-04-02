package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public class Gieter extends Gereedschap {

	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik gieter!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();

		if (boardstile.getPlant() != null) {
			Planten plant = boardstile.getPlant();
			if (plant.stadium != plant.MAXSTADIUM) {
				
				plant.stadium++;
				System.out.println(plant.stadium);
			}
		}
	}

}
