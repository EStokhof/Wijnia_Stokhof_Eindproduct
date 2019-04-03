package CBG_Planten;

import CBG_Tiles.BoardsTile;
import nl.han.ica.oopg.objects.Sprite;
/**
 * Planten is een abstracte class die de methodes heeft en set voor alle groeibare planten
 * ingame. Roos en Aardbei zijn hiervan dus ook een subclasse. 
 */
public abstract class Planten {	
	protected final int MAXSTADIUM = 3;
	protected int stadium = 0;
	protected BoardsTile tile;
	
	 /**
	 * De constructor van de class Planten.
     * 
     * @param tile De BoardsTile waarop de speler staat. 
     */
	public Planten(BoardsTile tile) {
		this.tile = tile;
		this.tile.setSprite(getSprite());
	}

	 /**
	 * Zet de groeistadium van een plant 1 omhoog, of als het niet verder kan groeien,
	 * zet de plant als oogstbaar.
	 */
	public void setStadium() {
		if (stadium != MAXSTADIUM) {
			stadium++;
		}
		if (stadium == MAXSTADIUM) {
			setOogstbaar();
		}
		
		//als het stadium verandert, dan ook de sprite
		Sprite sprite = getSprite();
		tile.setSprite(sprite);
	}

	 /**
	 * Deze methode zorgt ervoor dat een plant oogstbaar wordt.
	 */
	private void setOogstbaar() {
		tile.setOogstbaar(true);
	}

	 /**
	 * Wanneer aangeroepen, verandert de sprite op basis van de stadium van de plant. 
	 */
	private Sprite getSprite() {
		switch(stadium) {
			case 1:
				return getSpriteStadium1();
			case 2:
				return getSpriteStadium2();
			case 3:
				return getSpriteStadium3();
			default:
				// Default als zaadje:
				return getSpriteStadium0();
		}	
	}
	

	 /**
	 * Haalt de bijbehorende  sprite van stadium 0 van de subklasse. 
	 */
	protected abstract Sprite getSpriteStadium0();
	
	 /**
	* Haalt de bijbehorende  sprite van stadium 1 van de subklasse. 
	 */
	protected abstract Sprite getSpriteStadium1();
	
	 /**
	* Haalt de bijbehorende  sprite van stadium 2 van de subklasse. 
	 */
	protected abstract Sprite getSpriteStadium2();
	
	 /**
	* Haalt de bijbehorende  sprite van stadium 3 van de subklasse. 
	*/
	protected abstract Sprite getSpriteStadium3();
	
}
