package CelestialBodyGorge;

import java.util.ArrayList;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;
import processing.core.PConstants;

public class Player extends SpriteObject {
	private CBGapp world;
	private int gereedschapVast;
	private int hoeveelheidGeld;
	
	private final int SCHOFFEL = 0;
	private final int GIETER = 1;
	private final int ZEIS = 2;
	private final int ROOSZAADJE = 3;
	private final int AARDBEIZAADJE = 4;
	private final int MAXGEREEDSCHAPVAST = 4;
	

	
	ArrayList<IGereedschap> playerInventaris = new ArrayList<IGereedschap>();
		
	public Player(CBGapp world) {
		
		// Met `.concat()` plak je 2 strings aan elkaar.
		// De methode returned een nieuwe String terug.
		super(new Sprite(CBGapp.MEDIA_URL.concat("player.png")));
		
		playerInventaris.add(new Schoffel()); // index 0
		playerInventaris.add(new Gieter()); // index 1
		playerInventaris.add(new Zeis()); // index 2
		playerInventaris.add(new Rooszaadje()); // index 3
		playerInventaris.add(new Aardbeizaadje()); // index 4
	}

	@Override
	public void update() {

	}

	@Override
	public void keyPressed(int keyCode, char key) {
		final int speed = 5;
	if (this.getX() < 1204 || this.getX() > 0 || this.getY() < 704 || this.getY() > 0) {
		if (key == 'a' || key == 'A') {
			setDirectionSpeed(270, speed);
			// setCurrentFrameIndex(0); texture change naar poppetje wat links loopt
			System.out.println("Naar links lopen");
		}
		if (key == 'w' || key == 'W') {
			setDirectionSpeed(0, speed);
			// texture change naar boven lopen
			System.out.println("Naar boven lopen");
		}
		if (key == 'd' || key == 'D') {
			setDirectionSpeed(90, speed);
			System.out.println("Naar rechts lopen");
			// setCurrentFrameIndex(1); texture change naar rechts lopen
		}
		if (key == 's' || key == 'S') {
			setDirectionSpeed(180, speed);
			System.out.println("Naar onder lopen");
			// texture change naar onder lopen
		}
		if (key == 'q' || key == 'Q') {
			if (gereedschapVast != 0) {
				gereedschapVast--;
			}
		}
		if (key == 'e' || key == 'E') {
			if (gereedschapVast != MAXGEREEDSCHAPVAST) {
				gereedschapVast++;
			}
		}
		if (key == ' ') {
			playerInventaris.get(getGereedschapVast()).gereedschapActie();
		}
	}
	}
	
	public int getGereedschapVast() {
		return gereedschapVast;
	}

	public int getHoeveelheidGeld() {
		return hoeveelheidGeld;
	}

	public void setHoeveelheidGeld(int hoeveelheidGeld) {
		this.hoeveelheidGeld = hoeveelheidGeld;
		System.out.println("Geld is nu" + hoeveelheidGeld);
	}
	


	
}
