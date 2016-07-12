package fr.ulco.Boutiqueejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface GestionCommandeBeanRemote {

	public Commande createCommande();
	public List<Categorie> gererCommande();
	public void validerCommande(Commande c);
}
