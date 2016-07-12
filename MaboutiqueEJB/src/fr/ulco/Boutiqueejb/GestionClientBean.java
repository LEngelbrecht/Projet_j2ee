package fr.ulco.Boutiqueejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GestionClientBean implements GestionClientBeanRemote, GestionClientBeanLocal{

	@PersistenceContext(unitName="managerBoutique")
	EntityManager em;
	@Override
	public void createClient(String nom, String prenom, String email, String mdp) {
		// TODO Auto-generated method stub
		Client c = new Client();
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setEmail(email);
		c.setMdp(mdp);
		this.em.persist(c);
	}

}
