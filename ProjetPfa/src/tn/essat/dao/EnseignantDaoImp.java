package tn.essat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tn.essat.model.Enseignant;

public class EnseignantDaoImp implements IEnseignantDao {

	EntityManager em;

	public EnseignantDaoImp() {
		
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("essat");
		  this.em=fact.createEntityManager();
	}
	
	
	
	@Override
	public Enseignant getEnseignantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Enseignant> getAllEnseignant() {
		Query req=em.createQuery("select e from Enseignant e ");
		List<Enseignant>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addEnseignant(Enseignant c) {

		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteEnseignantr(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Enseignant update(Enseignant c) {
		// TODO Auto-generated method stub
		return null;
	}

}
