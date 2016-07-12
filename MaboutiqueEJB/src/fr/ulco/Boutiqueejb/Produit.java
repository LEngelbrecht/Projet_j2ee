package fr.ulco.Boutiqueejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(schema="lengelbr", name="produits")
public class Produit implements Serializable{
		
	
	private static final long serialVersionUID = 1L;
	private int id;
	private int id_categorie;
	private String libelle;
	private float prix;
	
	@Id 
	@Column(name="pk_produit")
	@GeneratedValue
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
		
	}
	
	@Column(name="fk_categorie")
	public int getIdCategorie(){
		return id_categorie;
	}
	
	public void setIdCategorie(int id_categorie){
		this.id_categorie=id_categorie;
	}
	
	@Column(name="libelle")
	public String getLibelle(){
		return libelle;
	}
	
	public void setLibelle(String libelle){
		this.libelle=libelle;
	}
	
	@Column(name="prix")
	public float getPrix(){
		return prix;
	}
	
	public void setPrix(float prix){
		this.prix=prix;
	}
}
