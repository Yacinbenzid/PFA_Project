package tn.essat.dao;

import java.util.List;

import tn.essat.model.Compte;
import tn.essat.model.Etudiant;
import tn.essat.model.Role;

public interface IEtudiantDao {

	
	public Etudiant getEtudiantById(int id);
	public List<Etudiant> getAllEtudiant();
	public void  addEtudiant(Etudiant c);
	public void  deleteEtudiant(int id);
	public Etudiant update(Etudiant c);
	public Role getRoleById(int id);
	public List<Compte> getAllCompte();
	
	
}
