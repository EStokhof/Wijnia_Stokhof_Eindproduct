package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;
import processing.core.PConstants;

public class Player extends SpriteObject {
	private CBGapp world;
	private int gereedschapVast;
	private final int MAXGEREEDSCHAPVAST = 5;
	private int hoeveelheidGeld;

	public Player(CBGapp world) {
		// Met `.concat()` plak je 2 strings aan elkaar.
		// De methode returned een nieuwe String terug.
		super(new Sprite(CBGapp.MEDIA_URL.concat("player.png")));
	}

	@Override
	public void update() {

	}

	@Override
	public void keyPressed(int keyCode, char key) {
		final int speed = 5;
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
			gebruikGereedschap();
		}
	}

	void gebruikGereedschap() {
		int a = getGereedschapVast();
		// LINK HIER NAAR GEREEDSCHAP. 
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
