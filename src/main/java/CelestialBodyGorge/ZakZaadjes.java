package CelestialBodyGorge;

import nl.han.ica.oopg.objects.Sprite;

public abstract class ZakZaadjes extends Gereedschap {
	protected int prijs = 40;
	
	@Override
	public void gereedschapActie(Player speler) {
		if (speler.getGoud() >= prijs) {
			speler.setGoud(-prijs);
		}
		
		// if (tegel waar ik op sta == geschoffeld) {
		plantActie(speler);
		// }
	}
	
	public abstract void plantActie(Player speler);
}
