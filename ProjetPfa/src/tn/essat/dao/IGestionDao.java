package tn.essat.dao;

import java.util.List;

import tn.essat.model.Compte;
import tn.essat.model.Personne;
import tn.essat.model.Role;

public interface IGestionDao {

	public Compte getCompteById(int id);

	public Compte getCompteByEmail(String email);

	public List<Compte> getAllCompte();

	public void addCompte(Compte c);

	public void deleteCompte(int id);

	public Compte update(Compte c);

	public Role getRoleById(int id);

	public List<Role> getAllCategorie();

	public Personne getPersonneById(int id);

	public List<Personne> getAllPersonne();

	public Compte verif(String email, String pass);

	public String encrypt(String password);

	public String decrypt(String password);
	
}
