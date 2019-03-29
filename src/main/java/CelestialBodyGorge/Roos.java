package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Roos extends Planten {
    private Sprite roosStadium1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos2.png");
    private Sprite roosStadium2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos3.png");
    private Sprite roosOogst = new Sprite("src/main/java/CelestialBodyGorge/media/planten/rood4.png");
	
    
	Roos(Sprite sprite, int x, int y) {
		super(new Sprite("src/main/java/CelestialBodyGorge/media/planten/roos1.png"), x, y);
	}

	@Override
	protected void setSprite(int stadium) {
		switch(stadium) {
		case 1:
			setSprite(roosStadium1);
			break;
		case 2:
			setSprite(roosStadium2);
			break;
		case 3:
			setSprite(roosOogst);
			break;
		}	
	}
}
