package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Schoffel extends Gereedschap {

	Schoffel() {
		super(new Sprite("src/main/java/CelestialBodyGorge/media/geschoffeldeAarde.png"));
	}

	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik schoffel!");
	}

}
