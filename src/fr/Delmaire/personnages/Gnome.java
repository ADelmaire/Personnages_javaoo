package fr.Delmaire.personnages;

public class Gnome extends persos {

	public Gnome() {
		super();
	}

	public Gnome(int nombreDeVies, int puissance, String nom, String arme, String type) {
		super(nombreDeVies, puissance, nom, arme, type);
	}

	@Override
	public void attaquer() {
		System.out.println("attaque de gnome");
	}

}
