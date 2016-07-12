package fr.ulco.Boutiqueejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(name = "Maboutique1JNDi")
public class accescatalogueBean implements accesCatalogueBeanLocal, accesCatalogueBeanRemote{

	@PersistenceContext(unitName="managerBoutique")
	EntityManager em;
	
	@Override
	public List<Categorie> getListCategories() {
		// TODO Auto-generated method stub
		Query q=em.createQuery("select c from Categorie c");
		List<Categorie> cat;
		cat=q.getResultList();
		return cat;
	}

	@Override
	public List<Produit> getListProduits(int id) {
		// TODO Auto-generated method stub
		Query q=em.createQuery("select p from Produit p where fk_categorie = id ");
		List<Produit> prod;
		prod=q.getResultList();
		return prod;
	}

}
