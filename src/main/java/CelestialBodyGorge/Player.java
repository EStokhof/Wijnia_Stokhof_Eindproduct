package CelestialBodyGorge;

import java.util.ArrayList;
import java.util.List;

import nl.han.ica.oopg.collision.CollidedTile;
import nl.han.ica.oopg.collision.ICollidableWithTiles;
import nl.han.ica.oopg.objects.AnimatedSpriteObject;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public class Player extends AnimatedSpriteObject implements ICollidableWithTiles {
	private CBGapp world;
	private Design inventaris;
	private Design geldBalk;
	private int gereedschapVast;
	private int goud;

	private float xPositie;
	private float yPositie;

	private boolean frameSwitch;

	ArrayList<Gereedschap> playerInventaris = new ArrayList<>();

	public Player(CBGapp world) {

		// Met `.concat()` plak je 2 strings aan elkaar.
		// De methode returned een nieuwe String terug.
		super(new Sprite(world.MEDIA_URL.concat("player/player.png")), 6);

		this.world = world;
		goud = 500;

		inventaris = new Design(); // iets meesturen? hierin sprites aanpassen van interface?
		geldBalk = new Design();

		playerInventaris.add(new Schoffel()); // index 0
		playerInventaris.add(new Gieter()); // index 1
		playerInventaris.add(new Zeis()); // index 2
		playerInventaris.add(new Rooszaadje()); // index 3
		playerInventaris.add(new Aardbeizaadje()); // index 4
		xPositie = this.getX();
		yPositie = this.getY();
		frameSwitch = false;
	}

	@Override
	public void update() {

	}

	@Override
	public void keyPressed(int keyCode, char key) {
		if (this.getX() < world.getWORLDWIDTH() || this.getX() > 0 || this.getY() < world.getWORLDHEIGHT()
				|| this.getY() > 0) {

			if (key == 'a' || key == 'A') {
				movePlayerX(-world.getTILESIZE());
				setCurrentFrameIndex(2);
				System.out.println("Naar links lopen");
			}
			if (key == 'w' || key == 'W') {
				movePlayerY(-world.getTILESIZE());

				if (frameSwitch == false) {
					frameSwitch = true;
					setCurrentFrameIndex(4);
				} else {
					frameSwitch = false;
					setCurrentFrameIndex(5);
				}

				System.out.println("Naar boven lopen");

			}
			if (key == 'd' || key == 'D') {
				movePlayerX(world.getTILESIZE());
				System.out.println("Naar rechts lopen");
				setCurrentFrameIndex(3); // texture change naar rechts lopen
			}
			if (key == 's' || key == 'S') {
				movePlayerY(world.getTILESIZE());
				System.out.println("Naar onder lopen");
				if (frameSwitch == false) {
					frameSwitch = true;
					setCurrentFrameIndex(0);
				} else {
					frameSwitch = false;
					setCurrentFrameIndex(1);
				}
				// texture change naar onder lopen
			}
			if (key == 'q' || key == 'Q') {
				if (gereedschapVast != 0) {
					gereedschapVast--;
					// verander sprites van inventaris (rood randje)
				}
			}
			if (key == 'e' || key == 'E') {
				if (gereedschapVast != playerInventaris.size() - 1) {
					gereedschapVast++;
					// verander sprites van inventaris (rood randje)
				}
			}
			if (key == ' ') {
				playerInventaris.get(getGereedschapVast()).gereedschapActie(this);
			}
		}
	}

	public int getGereedschapVast() {
		return gereedschapVast;
	}

	public int getGoud() {
		return goud;
	}

	public void setGoud(int geld) {
		goud += geld;

		if (geld < 0) {
			geld *= -1;
			System.out.println("Deze actie kostte " + geld + " goud");
		} else {
			System.out.println("je hebt " + geld + " goud verdient!");
		}

		System.out.println("Geld is nu " + goud);
	}

	void movePlayerX(float stepSize) {
		float huidigePositie = this.getX();
		float nieuwePositie = huidigePositie + stepSize;

		System.out.println(huidigePositie);
		if (nieuwePositie < world.getWORLDWIDTH() || nieuwePositie > 0) {
			if (getTileOnNextPlayerPosition(nieuwePositie, this.getY()).getLoopbaar() == true) {
				System.out.println(nieuwePositie);
				this.setX(nieuwePositie);
			}
		}
	}

	void movePlayerY(float stepSize) {
		float huidigePositie = this.getY();
		float nieuwePositie = huidigePositie + stepSize;
		System.out.println(huidigePositie);
		if (nieuwePositie <= world.getWORLDHEIGHT() || nieuwePositie >= 0) {
			if (getTileOnNextPlayerPosition(this.getX(), nieuwePositie).getLoopbaar() == true)
				System.out.println(nieuwePositie);
			this.setY(nieuwePositie);
		}
	}
	
	public Tile getTileOnPlayerPosition() { 
		int x= (int) xPositie;
		int y = (int) yPositie;
		
		return world.getTileOnObjectPosition(x, y);
	}

	public Tile getTileOnNextPlayerPosition(float xPositie, float yPositie) { 
		int x= (int) xPositie;
		int y = (int) yPositie;
		
		return world.getTileOnObjectPosition(x, y);
	}
	
	public boolean getSpelerOpGeschoffeldeAarde() {
		Tile tegel = getTileOnPlayerPosition();
		
		return tegel.getGeschoffeld();
	}
	
	public boolean getSpelerOpPlant() {
		Tile tegel = getTileOnPlayerPosition();
		
		return tegel.getPlant();
	}
	
	public boolean getSpelerOpOogst() {
		Tile tegel = getTileOnPlayerPosition();
		
		return tegel.getOogstbaar();
	}

	@Override
	public void tileCollisionOccurred(List<CollidedTile> collidedTiles) {
		// TODO Auto-generated method stub

	}
}
