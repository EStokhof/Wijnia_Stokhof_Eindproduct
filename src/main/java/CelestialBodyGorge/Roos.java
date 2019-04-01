package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public class Roos extends Planten {
	private final static Sprite stadium0 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos1.png");
    private final static Sprite stadium1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos2.png");
    private final static Sprite stadium2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos3.png");
    private final static Sprite oogst = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos4.png");
	
	public Roos(BoardsTile tile) {
		super(tile);
	}

	@Override
	protected Sprite getSpriteStadium0() {
		// TODO Auto-generated method stub
		return stadium0;
	}

	@Override
	protected Sprite getSpriteStadium1() {
		// TODO Auto-generated method stub
		return stadium1;
	}

	@Override
	protected Sprite getSpriteStadium2() {
		// TODO Auto-generated method stub
		return stadium2;
	}

	@Override
	protected Sprite getSpriteStadium3() {
		// TODO Auto-generated method stub
		return oogst;
	}
}
