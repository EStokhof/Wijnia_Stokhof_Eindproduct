package CBG_Gereedschap;

import CelestialBodyGorge.Player;

/**
* IGereedschap is een interface die forceert dat iedere subklasse (ieder gereedschap) 
* de methode gereedschapActie moet hebben. 
*/
public interface IGereedschap {
	
    /**
     *  Deze methode wordt aangeroepen als de speler een actie met het gereedschap wil 
     * doen.
     * 
     * @param speler Een object van de huidige speler. 
     */
	public abstract void gereedschapActie(Player speler);	
}
