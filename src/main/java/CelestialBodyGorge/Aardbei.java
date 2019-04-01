package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public class Aardbei extends Planten {
    private Sprite aardbeiStadium1 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei2.png");
    private Sprite aardbeiStadium2 = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei3.png");
    private Sprite aardbeiOogst = new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei4.png");
	
    
	Aardbei(int x, int y, CBGapp world) {
		super(new Sprite("src/main/java/CelestialBodyGorge/media/planten/aardbei1.png"), x, y, world);
	}

	@Override
	protected void setSprite(int stadium) {
	}
//		switch(stadium) {
//		case 1:
//			setSprite(aardbeiStadium1);
//			break;
//		case 2:
//			setSprite(aardbeiStadium2);
//			break;
//		case 3:
//			setSprite(aardbeiOogst);
//			break;
//		}	
//	}
}
