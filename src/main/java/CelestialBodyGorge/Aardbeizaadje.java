package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Aardbeizaadje extends ZakZaadjes {

	Aardbeizaadje() {
		super(new Sprite("src/main/java/CelestialBodyGorge/media/menu/aardbeiZaadjes.png"));
	}

	public void plantActie() {
		System.out.println("Gebruik aarbeizaadjes!");
		
		// maakt object aardbei aan
		// in aarbei set sprite op stadium 1 (of 0)
	}

}
