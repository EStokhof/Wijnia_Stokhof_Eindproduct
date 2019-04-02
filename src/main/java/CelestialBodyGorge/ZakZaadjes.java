package CelestialBodyGorge;

public abstract class ZakZaadjes extends Gereedschap {
	protected int prijs = 40;
	
	@Override
	public void gereedschapActie(Player speler) {
		BoardsTile tile = speler.getTileOnPlayerPosition();
		
		if (tile.getGeschoffeld() == true && tile.getPlant() == null) {
			if (speler.getGoud() >= prijs) {
				plantActie(tile);
				speler.setGoud(-prijs);
			}
		}
	}
	
	public abstract void plantActie(BoardsTile tile);
}
