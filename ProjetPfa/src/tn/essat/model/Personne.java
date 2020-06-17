package tn.essat.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="personne")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "record_type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "personne_type")
public abstract class Personne {
	
	
	@Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="adresse")
	private String adresse;
	
	@Column(name="tel")
	private int tel;
	
	@Column(name="date_naissance")
	private String date_naissance;
	
	@Column(name="lieuDeNaissance")
	private String lieuDeNaissance;
	
	@Column(name="sexe")
	private String sexe ;
	
	@Column(name="nationalite")
	private String nationalite;
	
	

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Personne(int id, String nom, String prenom, String adresse, int tel, String date_naissance,
			String lieuDeNaissance, String sexe, String nationalite) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
		this.date_naissance = date_naissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.sexe = sexe;
		this.nationalite = nationalite;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public int getTel() {
		return tel;
	}



	public void setTel(int tel) {
		this.tel = tel;
	}



	public String getDate_naissance() {
		return date_naissance;
	}



	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}



	public String getLieuDeNaissance() {
		return lieuDeNaissance;
	}



	public void setLieuDeNaissance(String lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}



	public String getSexe() {
		return sexe;
	}



	public void setSexe(String sexe) {
		this.sexe = sexe;
	}



	public String getNationalite() {
		return nationalite;
	}



	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	
	
	
	
	

}
