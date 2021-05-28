package yourwebproject2.model.entity.compta;

import yourwebproject2.model.entity.acteur.Client;

/** 
 *  G?n?re facture avec informations ad?quates
 */
public class Facture {

    private Client  myClient;

	public Facture(Client myClient) {
		super();
		this.myClient = myClient;
	}

	public Client getMyClient() {
		return myClient;
	}

	public void setMyClient(Client myClient) {
		this.myClient = myClient;
	}

	@Override
	public String toString() {
		return "Facture [myClient=" + myClient + "]";
	}

}