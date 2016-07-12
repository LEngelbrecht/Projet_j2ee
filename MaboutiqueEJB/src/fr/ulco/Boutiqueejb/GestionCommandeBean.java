package fr.ulco.Boutiqueejb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GestionCommandeBean implements GestionCommandeBeanRemote, GestionCommandeBeanLocal{

	@PersistenceContext(unitName="managerBoutique")
	EntityManager em;
	@Override
	public Commande createCommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> gererCommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validerCommande(Commande c) {
		// TODO Auto-generated method stub
		c.setNumero("69");
		em.persist(c);
		System.out.println("commande enregistré : " + c);
	}

}
