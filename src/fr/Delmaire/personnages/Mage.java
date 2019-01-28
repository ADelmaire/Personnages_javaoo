package fr.Delmaire.personnages;

public class Mage extends persos implements Voler {

	public Mage() {
		super();
	}

	public Mage(int nombreDeVies, int puissance, String nom, String arme, String type) {
		super(nombreDeVies, puissance, nom, arme, type);
	}

	@Override
	public void attaquer() {
		System.out.println("boule de feu!!!");
	}

	@Override
	public void voler() {
		System.out.println("je peux aussi voler");
	}

}
