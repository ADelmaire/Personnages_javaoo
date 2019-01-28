package fr.Delmaire.personnages;

public class Troll extends persos {

	public Troll() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Troll(int nombreDeVies, int puissance, String nom, String arme, String type) {
		super(nombreDeVies, puissance, nom, arme, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer() {
		System.out.println("à la hache!");
	}

}
