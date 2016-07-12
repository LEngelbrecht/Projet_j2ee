package fr.ulco.Boutiqueejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="lengelbr", name="categories")
public class Categorie implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String libelle;
	
	public Categorie(){
		
	}
	
	@Id
	@Column(name="id_categorie")
	@GeneratedValue
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}
	
	@Column(name="libelle")
	public String getLibelle(){
		return libelle;
	}
	
	public void setLibelle(String libelle){
		this.libelle=libelle;
	}
	
	public String toString(){
		return "id " + id + "Libelle " +libelle; 
	}
}
