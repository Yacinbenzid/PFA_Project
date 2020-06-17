package tn.essat.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="enseignant")
@DiscriminatorValue(value="enseignant")
public class Enseignant extends Personne{
	
	private int typeEnseignant;

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(int id, String nom, String prenom, String adresse, int tel, String date_naissance,
			String lieuDeNaissance, String sexe, String nationalite) {
		super(id, nom, prenom, adresse, tel, date_naissance, lieuDeNaissance, sexe, nationalite);
		// TODO Auto-generated constructor stub
	}

	public int getTypeEnseignant() {
		return typeEnseignant;
	}

	public void setTypeEnseignant(int typeEnseignant) {
		this.typeEnseignant = typeEnseignant;
	}
	
	
	

}
