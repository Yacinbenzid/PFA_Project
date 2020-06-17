package tn.essat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tn.essat.model.Compte;
import tn.essat.model.Etudiant;
import tn.essat.model.Role;

public class EtudiantDaoImp implements IEtudiantDao {
	
	EntityManager em;

	public EtudiantDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("essat");
		  this.em=fact.createEntityManager();
	}

	@Override
	public Etudiant getEtudiantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> getAllEtudiant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEtudiant(Etudiant c) {
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

	}

	@Override
	public void deleteEtudiant(int id) {
		
		em.getTransaction().begin();
		Etudiant c=em.find(Etudiant.class,id);
		em.remove(c);
		em.getTransaction().commit();

	}

	@Override
	public Etudiant update(Etudiant c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(int id) {
		Role r=em.find(Role.class,id);
		return r;
	}

	@Override
	public List<Compte> getAllCompte() {
		// TODO Auto-generated method stub
		return null;
	}

}
