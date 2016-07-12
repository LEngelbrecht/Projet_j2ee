package fr.ulco.Boutiqueejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="lengelbr", name="client")
public class Client {

	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String mdp;
	
	public Client(){
		super();
	}
	@Id
	@Column(name="id")
	@GeneratedValue
	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}
	
	@Column(name="nom")
	public String getNom(){
		return nom;
	}
	
	public void setNom(String nom){
		this.nom=nom;
	}
	
	@Column(name="prenom")
	public String getPrenom(){
		return prenom;
	}
	
	public void setPrenom(String prenom){
		this.prenom=prenom;
	}
	
	@Column(name="email")
	public String getEmail(){
		return mail;
	}
	
	public void setEmail(String mail){
		this.mail=mail;
	}
	
	@Column(name="mot_de_passe")
	public String getMdp(){
		return mdp;
	}
	
	public void setMdp(String mdp){
		this.mdp=mdp;
	}
	
}
