package yourwebproject2.model.entity.prestation;

import java.time.LocalDate;

import yourwebproject2.model.entity.Formule;


public class Avion extends Prestation {


	public Avion(LocalDate dateDepart, LocalDate dateArrivee, int prixHT, String compagnie, Formule myFormule) {
		super(dateDepart, dateArrivee, prixHT, compagnie, myFormule);
		// TODO Auto-generated constructor stub
	}

	private String aeroport;

	public String getAeroport() {
		return aeroport;
	}

	public void setAeroport(String aeroport) {
		this.aeroport = aeroport;
	}

	@Override
	public String toString() {
		return "Avion [aeroport=" + aeroport + "]";
	}




}