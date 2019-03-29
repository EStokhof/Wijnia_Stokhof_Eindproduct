package CelestialBodyGorge;

public abstract class Plantenzaadjes implements IGereedschap {
	protected int prijs = 40;
	
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
