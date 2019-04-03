package CBG_Planten;

import CBG_Tiles.BoardsTile;
import nl.han.ica.oopg.objects.Sprite;

//gecontroleerd
public class Aardbei extends Planten {
	// Sprites voor ieder stadium (zaadje tot oogst)
	private static Sprite stadium0 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei1.png");
	private static Sprite stadium1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei2.png");
	private static Sprite stadium2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei3.png");
	private static Sprite oogst = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei4.png");

	public Aardbei(BoardsTile tile) {
		super(tile);
	}

	@Override
	protected Sprite getSpriteStadium0() {
		return stadium0;
	}

	@Override
	protected Sprite getSpriteStadium1() {
		return stadium1;
	}

	@Override
	protected Sprite getSpriteStadium2() {
		return stadium2;
	}

	@Override
	protected Sprite getSpriteStadium3() {
		return oogst;
	}
}
