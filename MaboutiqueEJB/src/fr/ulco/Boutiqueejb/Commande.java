package fr.ulco.Boutiqueejb;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema="lengelbr", name="commandes")
public class Commande implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String numero;
	//@OneToMany(mappedBy="LigneCommande.commandes", cascade=CascadeType.ALL)
	//private Collection<LigneCommande> lignes_commandes;
	
	@Id
	@Column(name="pk_commande")
	@GeneratedValue
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	@Column(name="numero")
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero){
		this.numero=numero;
	}
	
		
	/*public Collection<LigneCommande> getLigneCommandes(){
		return lignes_commandes;
	}
	
	public void setLigneCommandes(Collection<LigneCommande> lignescommandes){
		this.lignes_commandes=lignescommandes;
	}*/
	
	public String toString(){
		return "id" + id + "numero" + numero;
	}
}
