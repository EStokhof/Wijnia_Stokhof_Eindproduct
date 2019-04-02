package CelestialBodyGorge;

public class Rooszaadje extends ZakZaadjes{

	@Override
	public void plantActie(BoardsTile tile) {
		System.out.println("Gebruik rooszaadjes!");
		
		Roos roos = new Roos(tile);
		tile.setPlant(roos);
	}
}
