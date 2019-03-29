package CelestialBodyGorge;

public abstract class Planten {
	protected int stadium;
	protected int x;
	protected int y;
	
	protected final int MAXSTADIUM = 3;
	
	Planten(int x, int y) {
		stadium = 0;
		this.x = x;
		this.y = y;
	}
	
	public void setStadium() {
		if (stadium != MAXSTADIUM) {
			stadium++;
			setSprite(stadium);
		}
	}
	
	protected abstract void setSprite(int stadium);
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
