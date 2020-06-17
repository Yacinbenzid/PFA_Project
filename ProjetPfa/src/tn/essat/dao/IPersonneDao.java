package tn.essat.dao;

import java.util.List;

import tn.essat.model.Personne;

public interface IPersonneDao {
	
	public Personne getUserById(int id);
	public List<Personne> getAllUser();
	public void  addPersonne(Personne c);
	public void  deletePersonne(int id);
	public Personne update(Personne c);
	

	}
