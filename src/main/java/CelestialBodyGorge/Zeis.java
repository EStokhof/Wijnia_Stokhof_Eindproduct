package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Zeis extends Gereedschap {
	public int verdient = 50;
	
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik zeis!");
		
		// if (tegel waar ik op sta == oogstbaar) {
		speler.setGoud(verdient);
		// }
	}

}
