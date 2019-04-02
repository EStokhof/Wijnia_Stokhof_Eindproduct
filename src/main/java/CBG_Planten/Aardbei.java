package CBG_Planten;

import CBG_Tiles.BoardsTile;
import nl.han.ica.oopg.objects.Sprite;

public class Aardbei extends Planten {
	private final static Sprite stadium0 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei1.png");
	private final static Sprite stadium1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei2.png");
	private final static Sprite stadium2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei3.png");
	private final static Sprite oogst = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei4.png");

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
//	}
}
