package CelestialBodyGorge;

public class Gieter extends Gereedschap {

	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik gieter!");
		BoardsTile boardstile = speler.getTileOnPlayerPosition();
		//haal de tile op waar de player op staat

		if (boardstile.getPlant() != null) {
			Planten plant = boardstile.getPlant();
			plant.setStadium();
		}
	}

}
