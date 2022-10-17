package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbtrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheeObtenu = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheeObtenu!= null && i < tropheeObtenu.length 
				&& tropheeObtenu[i] != null ; i++, nbtrophees++) {
			this.trophees[nbtrophees] = tropheeObtenu[i];
		}
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void boirePotion(int forcePotion) {
		parler("Merci Druide, je sens que ma force est " + forcePotion + " fois décuplée.");
	}
	
	public void faireUneDonation (Musee musee) {
		if(trophees != null) {
			String texte = "Je donne au musee tout mes trophees :";
			for(int i=0; i<nbtrophees; i++){
				texte += "\n-" + trophees[i].getEquipement();
			}
			this.parler(texte);
		}
		
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain romain = new Romain("Romain", 5);
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Salutation voyageur!");
		asterix.boirePotion(6);
		asterix.frapper(romain);
		asterix.frapper(romain);
		asterix.frapper(romain);
		Musee leLouvre = new Musee("Lelouvre");
		asterix.faireUneDonation(leLouvre);
		
	}
}
