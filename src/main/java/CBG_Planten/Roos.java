package CBG_Planten;

import CBG_Tiles.BoardsTile;
import nl.han.ica.oopg.objects.Sprite;

/**
 * Van de klasse Roos maak je een object, die je meegeeft in de BoardsTile als plant.
 */
public class Roos extends Planten {
	// Sprites voor ieder stadium (zaadje tot oogst)
	private static Sprite stadium0 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos1.png");
    private static Sprite stadium1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos2.png");
    private static Sprite stadium2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos3.png");
    private static Sprite oogst = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos4.png");
	
    /**
	* Met deze constructor maak je een object aan van Roos.
	* 
	*  @param tile De BoardsTile waarop de speler staat. 
	*/
	public Roos(BoardsTile tile) {
		super(tile);
	}

	/**
	 * Geeft de sprite van stadium 0 van de plant mee. 
	 * @return stadium0
	 */
	@Override
	protected Sprite getSpriteStadium0() {
		return stadium0;
	}
	
	/**
	 * Geeft de sprite van stadium 1 van de plant mee. 
	 * @return stadium1
	 */
	@Override
	protected Sprite getSpriteStadium1() {
		return stadium1;
	}

	/**
	 * Geeft de sprite van stadium 2 van de plant mee. 
	 * @return stadium2
	 */
	@Override
	protected Sprite getSpriteStadium2() {
		return stadium2;
	}

	/**
	 * Geeft de sprite van stadium 3 van de plant mee.
	 * @return stadium3 
	 */
	@Override
	protected Sprite getSpriteStadium3() {
		return oogst;
	}
}
