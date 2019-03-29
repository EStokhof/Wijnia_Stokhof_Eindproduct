package CelestialBodyGorge;

import java.util.ArrayList;
import java.util.List;

import nl.han.ica.oopg.collision.CollidedTile;
import nl.han.ica.oopg.collision.ICollidableWithTiles;
import nl.han.ica.oopg.objects.AnimatedSpriteObject;
import nl.han.ica.oopg.objects.GameObject;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.objects.SpriteObject;
import processing.core.PConstants;

public class Player extends AnimatedSpriteObject implements ICollidableWithTiles {
	private CBGapp world;
	private int gereedschapVast;
	private int hoeveelheidGeld;

	private final int SCHOFFEL = 0;
	private final int GIETER = 1;
	private final int ZEIS = 2;
	private final int ROOSZAADJE = 3;
	private final int AARDBEIZAADJE = 4;
	private final int MAXGEREEDSCHAPVAST = 4;

	private float xPositie;
	private float yPositie;

	ArrayList<IGereedschap> playerInventaris = new ArrayList<IGereedschap>();

	public Player(CBGapp world) {

		// Met `.concat()` plak je 2 strings aan elkaar.
		// De methode returned een nieuwe String terug.
		super(new Sprite(CBGapp.MEDIA_URL.concat("player/naarBenedenLopen1.png")), 6);
		this.world = world;
		playerInventaris.add(new Schoffel()); // index 0
		playerInventaris.add(new Gieter()); // index 1
		playerInventaris.add(new Zeis()); // index 2
		playerInventaris.add(new Rooszaadje()); // index 3
		playerInventaris.add(new Aardbeizaadje()); // index 4
		xPositie = this.getX();
		yPositie = this.getY();
	}

	@Override
	public void update() {

	}

	@Override
	public void keyPressed(int keyCode, char key) {
		final int speed = 5;
		if (this.getX() < 1204 || this.getX() > 0 || this.getY() < 704 || this.getY() > 0) {

			if (key == 'a' || key == 'A') {
				movePlayerX(-world.getTILESIZE());
				//this.setSprite
				System.out.println("Naar links lopen");
			}
			if (key == 'w' || key == 'W') {
				movePlayerY(-world.getTILESIZE());
				// texture change naar boven lopen
				System.out.println("Naar boven lopen");
			}
			if (key == 'd' || key == 'D') {
				movePlayerX(world.getTILESIZE());
				System.out.println("Naar rechts lopen");
				// setCurrentFrameIndex(1); texture change naar rechts lopen
			}
			if (key == 's' || key == 'S') {
				movePlayerY(world.getTILESIZE());
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

	void movePlayerX(float stepSize) {
		float huidigePositie = this.getX();
		float nieuwePositie = huidigePositie + stepSize;
		this.setX(nieuwePositie);
	}

	void movePlayerY(float stepSize) {
		float huidigePositie = this.getY();
		float nieuwePositie = huidigePositie + stepSize;
		this.setY(nieuwePositie);
	}

	@Override
	public void tileCollisionOccurred(List<CollidedTile> collidedTiles) {
		// TODO Auto-generated method stub
		
	}
}
