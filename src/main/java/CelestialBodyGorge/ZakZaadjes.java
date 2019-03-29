package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public abstract class ZakZaadjes extends Gereedschap {
	protected int prijs = 40;
	
	ZakZaadjes(Sprite sprite) {
		super(sprite);
	}
	
	@Override
	public void gereedschapActie(Player speler) {
		if (speler.getGoud() >= prijs) {
			speler.setGoud(-prijs);
		}
		
		// if (tegel waar ik op sta == geschoffeld) {
		plantActie();
		// }
	}
	
	public abstract void plantActie();
}
