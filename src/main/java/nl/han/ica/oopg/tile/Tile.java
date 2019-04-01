package nl.han.ica.oopg.tile;

import nl.han.ica.oopg.objects.Sprite;

/**
 * The tile Object is used to bind a Sprite to an location in a TileMap
 * Extend tile to create different types of tiles.
 */
public class Tile {

	// voor als het een plant is.
	// 0 is zaadje, 4 is oogstbaar. 
	private int plantStadium;
	private final int ROOS = 0;
	private final int AARDBEI = 1;
	private int plantsoort; 
	private boolean plant = false;
	private boolean geschoffeld = false;
	private boolean oogstbaar = false;
	
	private boolean loopbaar = true;
	private boolean schoffelbaar = true;


	private Sprite sprite;

    /**
     *
     * @param sprite The image which will be drawn whenever the draw method of the tile is called.
     */
    public Tile(Sprite sprite, boolean loopbaar, boolean schoffelbaar) {
        setSprite(sprite);
        this.loopbaar = loopbaar;
        this.schoffelbaar = schoffelbaar;
    }

    /**
     * Use to get the Sprite object which is used to draw the image of the tile.
     *
     * @return sprite
     */
    public Sprite getSprite() {
        return sprite;
    }

    /**
     * Use to set an new Sprite object to replace the image used to draw the tile.
     *
     * @param sprite The new image which will be drawn whenever the draw method of the tile is called.
     */
    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    /**
     * Use to set the height and width of a Sprite object to an single size to ensure the sprite is an rectangle.
     *
     * @param size int which stands for the amount of pixels the Sprite must set for its height and width.
     */
    public void setSpriteSize(int size) {
        sprite.resize(size, size);
    }
    
     // set & get geschoffeld
    public boolean getGeschoffeld() {
		return geschoffeld;
	}
	public void setGeschoffeld(boolean geschoffeld) {
		this.geschoffeld = geschoffeld;
	}

	// set & get plant
	public boolean getPlant() {
		return plant;
	}
	public void setPlant(boolean plant) {
		this.plant = plant;
	}

	// set & get oogstbaar
	public boolean getOogstbaar() {
		return oogstbaar;
	}
	public void setOogstbaar(boolean oogstbaar) {
		this.oogstbaar = oogstbaar;
	}

	// set & get loopbaar
	public boolean getLoopbaar() {
		return loopbaar;
	}
	public void setLoopbaar(boolean loopbaar) {
		this.loopbaar = loopbaar;
	}
	public boolean getSchoffelbaar() {
		return schoffelbaar;
	}

}
