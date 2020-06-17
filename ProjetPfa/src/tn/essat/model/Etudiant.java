package tn.essat.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="etudiant")
@DiscriminatorValue(value="etudiant")
public class Etudiant extends Personne {

	private int typeEtudiant;

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id, String nom, String prenom, String adresse, int tel, String date_naissance,
			String lieuDeNaissance, String sexe, String nationalite) {
		super(id, nom, prenom, adresse, tel, date_naissance, lieuDeNaissance, sexe, nationalite);
		// TODO Auto-generated constructor stub
	}

	public int getTypeEtudiant() {
		return typeEtudiant;
	}

	public void setTypeEtudiant(int typeEtudiant) {
		this.typeEtudiant = typeEtudiant;
	}
	
	
	
	
	
	
}
