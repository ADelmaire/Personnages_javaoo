package fr.Delmaire.personnages;

public class Main {

	public static void main(String[] args) {

		Troll bubu = new Troll(3, 3, "Bubu", "hache", "troll des bois");
		Mage gdf = new Mage(5, 27, "Gandalf", "baton", "mage gris");
		Guerrier maurice = new Guerrier(15, 12, "Maurice", "épée", "bourrin");
		Gnome david = new Gnome(18, 8, "David", "épée", "ndj");

		bubu.attaquer();
		david.attaquer();
		maurice.manger();

		System.out.println(david.getArme());
		david.changerDArme("arc");
		System.out.println(david.getArme());

		gdf.attaquer();
		gdf.voler();
	}

}
