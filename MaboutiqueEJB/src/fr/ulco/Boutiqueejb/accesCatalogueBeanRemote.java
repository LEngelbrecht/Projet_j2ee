package fr.ulco.Boutiqueejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface accesCatalogueBeanRemote {

	public List<Categorie> getListCategories();
	public List<Produit> getListProduits(int id);
}
