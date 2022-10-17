package histoire;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix",8);
		Gaulois obelix = new Gaulois ("Obelix",15);
		Druide panoramix = new Druide ("Panoramix",5,10);
		Romain minus = new Romain ("Minus",6);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.booster(obelix);
		obelix.parler("Par Belenos, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}
}