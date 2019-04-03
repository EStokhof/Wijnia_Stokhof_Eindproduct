package CelestialBodyGorge;

import java.util.ArrayList;

import CBG_Gereedschap.Aardbeizaadje;
import CBG_Gereedschap.Gieter;
import CBG_Gereedschap.IGereedschap;
import CBG_Gereedschap.Rooszaadje;
import CBG_Gereedschap.Schoffel;
import CBG_Gereedschap.Zeis;
import CBG_Tiles.BoardsTile;
import nl.han.ica.oopg.objects.AnimatedSpriteObject;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.TileMap;

public class Player extends AnimatedSpriteObject {
	private CBGapp world;
	private Inventaris inventaris;

	private int gereedschapVast = 0;
	private int goud = 400;
	private float xPositie = 200;
	private float yPositie = 200;
	private boolean frameSwitch = false;

	ArrayList<IGereedschap> playerInventaris = new ArrayList<>();

	public Player(CBGapp world, TileMap tileMap) {
		// Met '.concat()' plak je 2 strings aan elkaar - returned een nieuwe String
		super(new Sprite("src/main/java/CelestialBodyGorge/media/player/player.png"), 6);
		this.world = world;

		inventaris = new Inventaris(gereedschapVast, tileMap);

		playerInventaris.add(new Schoffel()); // index 0
		playerInventaris.add(new Gieter()); // index 1
		playerInventaris.add(new Zeis()); // index 2
		playerInventaris.add(new Aardbeizaadje()); // index 3
		playerInventaris.add(new Rooszaadje()); // index 4
	}

	@Override
	public void update() {
		world.refreshDashboardText();
	}

	@Override
	public void keyPressed(int keyCode, char key) {
		if (world.getThreadState() == false) {
			switch (key) {
			case 'a':
			case 'A':
				movePlayerX(-world.getTILESIZE());
				System.out.println("Naar links lopen");

				// Texture change naar links lopen
				setCurrentFrameIndex(2);
				break;
			case 'w':
			case 'W':
				movePlayerY(-world.getTILESIZE());
				System.out.println("Naar boven lopen");

				// Texture change tijdens naar boven lopen
				if (frameSwitch == false) {
					frameSwitch = true;
					setCurrentFrameIndex(4);
				} else {
					frameSwitch = false;
					setCurrentFrameIndex(5);
				}
				break;
			case 'd':
			case 'D':
				movePlayerX(world.getTILESIZE());
				System.out.println("Naar rechts lopen");

				// Texture change naar rechts lopen
				setCurrentFrameIndex(3);
				break;
			case 's':
			case 'S':
				movePlayerY(world.getTILESIZE());
				System.out.println("Naar onder lopen");

				// Texture change tijdens naar onderen lopen
				if (frameSwitch == false) {
					frameSwitch = true;
					setCurrentFrameIndex(0);
				} else {
					frameSwitch = false;
					setCurrentFrameIndex(1);
				}
				break;
			case 'q':
			case 'Q':
				// In de inventaris een gereedschap naar links
				if (gereedschapVast != 0) {
					gereedschapVast--;
				}
				break;
			case 'e':
			case 'E':
				// In de inventaris een gereedschap naar rechts
				if (gereedschapVast != playerInventaris.size() - 1) {
					gereedschapVast++;
				}
				break;
			case ' ':
				// Voer de actie uit van het gereedschap
				playerInventaris.get(getGereedschapVast()).gereedschapActie(this);
				break;

			}

			// Teken het menu met het [nieuwe] geselecteerde gereedschap
			inventaris.tekenInventaris(gereedschapVast);
			world.refreshDashboardText();
		}

		if (key == 'p' || key == 'P') {
			if (world.getThreadState() == false) {
				world.addDashboard(world.pauzeMenu);
				world.pauseGame();
				System.out.println(world.getThreadState());
			}
			else if (world.getThreadState() == true) {

				world.resumeGame();
				world.deleteDashboard(world.pauzeMenu);
				System.out.println("pauze");
				System.out.println(world.getThreadState());
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
		// functie om de player elke keer een tile te laten lopen, X-as
		float huidigePositie = this.getX();
		float nieuwePositie = huidigePositie + stepSize;

		if (nieuwePositie <= world.getWORLDWIDTH() - stepSize && nieuwePositie >= 0) {
			// als de volgende stap in de wereld zit
			if (getTileOnNextPlayerPosition(nieuwePositie, this.getY()).getLoopbaar() == true) {
				// check of de volgende tile loopbaar is
				xPositie = nieuwePositie;
				this.setX(nieuwePositie);
			}
		}
	}

	void movePlayerY(float stepSize) {
		// functie om de player een tile elke keer te laten lopen, Y-as
		float huidigePositie = this.getY();
		float nieuwePositie = huidigePositie + stepSize;

		if (nieuwePositie <= world.getWORLDHEIGHT() - stepSize && nieuwePositie >= 0) {
			// als de volgende stap in de wereld zit
			if (getTileOnNextPlayerPosition(this.getX(), nieuwePositie).getLoopbaar() == true) {
				// check of de volgende tile loopbaar is
				yPositie = nieuwePositie;
				this.setY(nieuwePositie);
			}
		}
	}

	public BoardsTile getTileOnPlayerPosition() {
		int x = (int) xPositie;
		int y = (int) yPositie;

		return world.getTileOnObjectPosition(x, y);
	}

	public BoardsTile getTileOnNextPlayerPosition(float xPositie, float yPositie) {
		// deze functie is nodig voor het lopen.
		int x = (int) xPositie;
		int y = (int) yPositie;

		return world.getTileOnObjectPosition(x, y);
	}

	public float getxPositie() {
		return xPositie;
	}

	public float getyPositie() {
		return yPositie;
	}

}
