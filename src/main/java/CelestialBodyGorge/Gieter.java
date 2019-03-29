package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Gieter extends Gereedschap {
	
	public Gieter() {
		super(new Sprite("src/main/java/CelestialBodyGorge/media/menu/gieter.png"));
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
