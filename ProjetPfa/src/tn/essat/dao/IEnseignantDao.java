package tn.essat.dao;

import java.util.List;

import tn.essat.model.Enseignant;

public interface IEnseignantDao {

	public Enseignant getEnseignantById(int id);
	public List<Enseignant> getAllEnseignant();
	public void  addEnseignant(Enseignant c);
	public void  deleteEnseignantr(int id);
	public Enseignant update(Enseignant c);
	
	
}
