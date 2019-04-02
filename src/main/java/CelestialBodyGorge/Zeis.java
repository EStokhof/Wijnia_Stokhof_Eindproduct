package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Zeis extends Gereedschap {
	
	public int verdient = 50;
	
	public Sprite aarde = new Sprite("src/main/java/CelestialBodyGorge/media/grond/aarde1.png");
	
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik zeis!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		
		if (boardstile.getOogstbaar() == true) {
			speler.setGoud(verdient);
			boardstile.setSprite(aarde);
			boardstile.setPlant(null);
		}
	}

}
