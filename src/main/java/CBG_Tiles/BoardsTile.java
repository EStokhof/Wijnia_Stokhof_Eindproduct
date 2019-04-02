package CBG_Tiles;

import CBG_Planten.Planten;
import nl.han.ica.oopg.objects.Sprite;
import nl.han.ica.oopg.tile.Tile;

public class BoardsTile extends Tile {
	private boolean geschoffeld = false;
	private boolean oogstbaar = false;
	
	private boolean loopbaar = true;
	private boolean schoffelbaar = true;
	
	private Planten plant;

    public BoardsTile(Sprite sprite) {
        super(sprite);
    }
    
    // set & get geschoffeld
    public boolean getGeschoffeld() {
		return geschoffeld;
	}
	public void setGeschoffeld(boolean geschoffeld) {
		this.geschoffeld = geschoffeld;
	}

	// set & get plant
	public Planten getPlant() {
		return plant;
	}
	public void setPlant(Planten plant) {
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
	
	public void setSchoffelbaar(boolean schoffelbaar) {
		this.schoffelbaar = schoffelbaar;
	}

}
