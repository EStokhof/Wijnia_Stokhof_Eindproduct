package nl.han.ica.oopg.tile;

import nl.han.ica.oopg.objects.Sprite;

/**
 * The tile Object is used to bind a Sprite to an location in a TileMap
 * Extend tile to create different types of tiles.
 */
public class Tile {

	private boolean loopbaar = true;
	private boolean geschoffeld = false;
	private boolean plant = false;
	private boolean oogstbaar = false;

	private Sprite sprite;

    /**
     *
     * @param sprite The image which will be drawn whenever the draw method of the tile is called.
     */
    public Tile(Sprite sprite) {
        setSprite(sprite);
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
    public boolean isGeschoffeld() {
		return geschoffeld;
	}
	public void setGeschoffeld(boolean geschoffeld) {
		this.geschoffeld = geschoffeld;
	}

	// set & get plant
	public boolean isPlant() {
		return plant;
	}
	public void setPlant(boolean plant) {
		this.plant = plant;
	}

	// set & get oogstbaar
	public boolean isOogstbaar() {
		return oogstbaar;
	}
	public void setOogstbaar(boolean oogstbaar) {
		this.oogstbaar = oogstbaar;
	}

	// set & get loopbaar
	public boolean isLoopbaar() {
		return loopbaar;
	}
	public void setLoopbaar(boolean loopbaar) {
		this.loopbaar = loopbaar;
	}

}
