package fr.Delmaire.personnages;

public class Guerrier extends persos {

	public Guerrier() {
		super();
	}

	public Guerrier(int nombreDeVies, int puissance, String nom, String arme, String type) {
		super(nombreDeVies, puissance, nom, arme, type);
	}

	@Override
	public void attaquer() {
		System.out.println("à l'épée");
	}

}
