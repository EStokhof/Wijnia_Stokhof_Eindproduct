package CBG_Gereedschap;

import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;
import nl.han.ica.oopg.objects.Sprite;

public class Zeis implements IGereedschap {
	private int verdient = 50;
	
	private Sprite aarde = new Sprite("src/main/java/CelestialBodyGorge/media/grond/aarde1.png");
	
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik zeis!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		
		if (boardstile.getOogstbaar() == true) {
			speler.setGoud(verdient);
			boardstile.setSprite(aarde);
			boardstile.setPlant(null);
			boardstile.setGeschoffeld(false);
			boardstile.setSchoffelbaar(true);
		}
	}

}
