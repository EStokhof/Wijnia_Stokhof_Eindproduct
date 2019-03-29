package CelestialBodyGorge;

public class Zeis implements IGereedschap {
	public int verdient = 50;
	
	@Override
	public void gereedschapActie(Player speler) {
		System.out.println("Gebruik zeis!");
		
		// if (tegel waar ik op sta == oogstbaar) {
		speler.setGoud(verdient);
		// }
	}

}
