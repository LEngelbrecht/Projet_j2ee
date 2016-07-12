package fr.ulco.Boutiqueejb;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="lengelbr", name="lignes_commandes")
public class LigneCommande implements Serializable {


	private static final long serialVersionUID = 1L;
	private int id;
	private String code_prod;
	private String design_prod;
	private float prix_unit;
	private int quantite;
	//private Collection<Commande> commandes;
	
	@Id
	@Column(name="pk_ligne_commande")
	@GeneratedValue
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	@Column(name="code_prod")
	public String getCode(){
		return code_prod;
	}
	
	public void setCode(String code){
		this.code_prod=code;
	}
	
	@Column(name="design_prod")
	public String getDesign(){
		return design_prod;
	}
	
	public void setDesign(String design){
		this.design_prod=design;
	}
	
	@Column(name="prix_unit_prod")
	public float getPrix(){
		return prix_unit;
	}
	
	public void setPrix(float prix){
		this.prix_unit=prix;
	}
	
	@Column(name="qte_prod")
	public int getQte(){
		return quantite;
	}
	
	public void setQte(int qte){
		this.quantite=qte;
	}
	
	/*@OneToMany(mappedBy="lignes_commandes", cascade=CascadeType.ALL)
	public Collection<Commande> getCmde(){
		return commandes;
	}
	
	public void setCmde(Collection<Commande> commande){
		this.commandes=commande;
	}*/
}
