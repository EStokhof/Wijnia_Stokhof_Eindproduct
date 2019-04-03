package CBG_Tiles;

import CBG_Planten.Planten;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

/**
 * Een BoardsTile object is er om aan een tile, maar wel los van een tile, eigenschappen toe 
 * te voegen zoals schoffelbaar, loopbaar en welke plant erin zit. 
 */
public class BoardsTile extends Tile {
	private boolean geschoffeld = false;
	private boolean oogstbaar = false;
	
	private boolean loopbaar = true;
	private boolean schoffelbaar = true;
	
	private Planten plant;

	/**
	 * Met de constructor van BoardsTile maak je een object aan.
	 * @param sprite De sprite van de tile.
	 */
    public BoardsTile(Sprite sprite) {
        super(sprite);
    }
    
    /**
     * Geeft de waarde van geschoffeld. 
     */
    public boolean getGeschoffeld() {
		return geschoffeld;
	}
    
    /**
     * Verandert de waarde van geschoffeld. 
     * 
     * @param geschoffeld De nieuwe waarde die geschoffeld moet krijgen.
     */
	public void setGeschoffeld(boolean geschoffeld) {
		this.geschoffeld = geschoffeld;
	}

	/**
     * Geeft terug welke plant in de BoardsTile zit. 
     * @return plant
     */	
	public Planten getPlant() {
		return plant;
	}
	
	 /**
     * Verandert de waarde van plant.
     * 
     * @param plant De nieuwe waarde die plant moet krijgen.
     */
	public void setPlant(Planten plant) {
		this.plant = plant;
	}

	 /**
     * Geeft of de BoardsTile oogstbaar is.
     * @return oogstbaar
     */	
	public boolean getOogstbaar() {
		return oogstbaar;
	}
	
	 /**
     * Verandert de waarde van oogstbaar.
     * 
     * @param oogstbaar De nieuwe waarde die oogstbaar moet krijgen.
     */
	public void setOogstbaar(boolean oogstbaar) {
		this.oogstbaar = oogstbaar;
	}

	 /**
     * Geeft terug of de BoardsTile loopbaar is of niet. 
     * @return loopbaar
     */	
	public boolean getLoopbaar() {
		return loopbaar;
	}
	
	 /**
     * Verandert de waarde van loopbaar.
     * 
     * @param loopbaar De nieuwe waarde die loopbaar moet krijgen.
     */
	public void setLoopbaar(boolean loopbaar) {
		this.loopbaar = loopbaar;
	}
	
	 /**
     * Geeft terug of de tile schoffelbaar is of niet.
     * @return schoffelbaar
     */	
	public boolean getSchoffelbaar() {
		return schoffelbaar;
	}
	
	 /**
     * Verandert de waarde van schoffelbaar.
     * 
     * @param schoffelbaar De nieuwe waarde die schoffelbaar moet krijgen.
     */
	public void setSchoffelbaar(boolean schoffelbaar) {
		this.schoffelbaar = schoffelbaar;
	}

}
