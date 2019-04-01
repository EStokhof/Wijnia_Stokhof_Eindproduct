package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Aardbeizaadje extends ZakZaadjes {
	// AARDBEIZAADJE AANPASSEN NAAR ROOSZAADJE
private CBGapp world;
Aardbeizaadje (CBGapp world) { 
	this.world = world;
}
	
	@Override
	public void plantActie(Player speler) {
		System.out.println("Gebruik aarbeizaadjes!");
	
//		new Aardbei();
		// maakt object aardbei aan
		// in aarbei set sprite op stadium 1 (of 0)
	}

	

}
