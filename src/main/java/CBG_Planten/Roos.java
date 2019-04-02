package CBG_Planten;

import CBG_Tiles.BoardsTile;
import nl.han.ica.oopg.objects.Sprite;

public class Roos extends Planten {
	// Sprites voor ieder stadium (zaadje tot oogst)
	private final static Sprite stadium0 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos1.png");
    private final static Sprite stadium1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos2.png");
    private final static Sprite stadium2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos3.png");
    private final static Sprite oogst = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos4.png");
	
	public Roos(BoardsTile tile) {
		super(tile);
	}

	// Return roos sprites van het bijbehorende stadium
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
