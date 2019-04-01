package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Aardbeizaadje extends ZakZaadjes {
private CBGapp world;
Aardbeizaadje (CBGapp world) { 
	this.world = world;
}
	
	@Override
	public void plantActie(Player speler) {
		System.out.println("Gebruik aarbeizaadjes!");
		int x = (int) speler.getxPositie();
		int y = (int)speler.getyPositie();
		
		new Aardbei(x, y, world);
		// maakt object aardbei aan
		// in aarbei set sprite op stadium 1 (of 0)
	}

	

}
