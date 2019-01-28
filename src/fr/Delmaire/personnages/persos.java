package fr.Delmaire.personnages;

public abstract class persos {

	protected int nombreDeVies;
	protected int puissance;
	protected String nom;
	protected String arme;
	protected String type;

	public persos() {
		super();
	}

	public persos(int nombreDeVies, int puissance, String nom, String arme, String type) {
		super();
		this.nombreDeVies = nombreDeVies;
		this.puissance = puissance;
		this.nom = nom;
		this.arme = arme;
		this.type = type;
	}

	public abstract void attaquer();

	public void manger() {
		System.out.println("miam");
	}

	public void sauter() {
		System.out.println("hop!");
	}

	public void seCacher() {
		System.out.println("caché");
	}

	public void changerDArme(String nouvelleArme) {
		System.out.println("changement d'arme");
		arme = nouvelleArme;
		// ou this.arme = nouvelleArme
	}

	public int getNombreDeVies() {
		return nombreDeVies;
	}

	public void setNombreDeVies(int nombreDeVies) {
		this.nombreDeVies = nombreDeVies;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getArme() {
		return arme;
	}

	public void setArme(String arme) {
		this.arme = arme;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
