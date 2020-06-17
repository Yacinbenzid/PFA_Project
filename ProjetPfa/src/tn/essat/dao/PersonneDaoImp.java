package tn.essat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tn.essat.model.Personne;

public class PersonneDaoImp implements IPersonneDao {
	
	EntityManager em;

	public PersonneDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("essat");
		  this.em=fact.createEntityManager();
	}
	
	@Override
	public Personne getUserById(int id) {
		Personne u=em.find(Personne.class,id);
		return u;
	}

	@Override
	public List<Personne> getAllUser() {
		Query req=em.createQuery("select e from User e ");
		List<Personne>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addPersonne(Personne c) {
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();

	}

	@Override
	public void deletePersonne(int id) {

		em.getTransaction().begin();
		Personne c=em.find(Personne.class,id);
		em.remove(c);
		em.getTransaction().commit();

	}

	@Override
	public Personne update(Personne c) {
		// TODO Auto-generated method stub
		return null;
	}

}
