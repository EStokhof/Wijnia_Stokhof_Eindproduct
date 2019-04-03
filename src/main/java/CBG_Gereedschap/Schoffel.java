package CBG_Gereedschap;

import CBG_Tiles.BoardsTile;
import CelestialBodyGorge.Player;
import nl.han.ica.oopg.objects.Sprite;

//gecontroleerd
public class Schoffel implements IGereedschap {
    private Sprite geschoffeldeGrond = new Sprite("src/main/java/CelestialBodyGorge/media/grond/geschoffeldeGrond.png");
	
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik schoffel!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		
		if (boardstile.getSchoffelbaar() == true) {
			boardstile.setSchoffelbaar(false);
			boardstile.setGeschoffeld(true);
			boardstile.setSprite(geschoffeldeGrond);
		}
	}

}
