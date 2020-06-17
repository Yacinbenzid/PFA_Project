package tn.essat.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tn.essat.model.Compte;
import tn.essat.model.Personne;
import tn.essat.model.Role;

public class GestionDaoImp implements IGestionDao {
	
	
	EntityManager em;

	public GestionDaoImp() {
		EntityManagerFactory fact=Persistence.createEntityManagerFactory("essat");
		  this.em=fact.createEntityManager();
	}
	
	
	
	@Override
	public Compte getCompteById(int id) {
		Compte c=em.find(Compte.class,id);
		return c;
	}

	@Override
	public Compte getCompteByEmail(String email) {
		Compte c=em.find(Compte.class,email);
		return c;
	}

	@Override
	public List<Compte> getAllCompte() {
		
		
		Query req=em.createQuery("select e from Compte e ");
		List<Compte>liste1=req.getResultList();
		
		return liste1;
	}

	@Override
	public void addCompte(Compte c) {
		
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteCompte(int id) {
		
		em.getTransaction().begin();
		Compte c=em.find(Compte.class,id);
		em.remove(c);
		em.getTransaction().commit();

	}

	@Override
	public Compte update(Compte c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role getRoleById(int id) {
		
		Role r=em.find(Role.class,id);
		return r;
	}

	@Override
	public List<Role> getAllCategorie() {
		
		
		Query req= em.createQuery("select c from Role c");
		List<Role> liste= req.getResultList();
		return liste;
	}

	@Override
	public Personne getPersonneById(int id) {
		Personne r=em.find(Personne.class,id);
		return r;
	}

	@Override
	public List<Personne> getAllPersonne() {
		
		Query req= em.createQuery("select c from User c");
		List<Personne> liste= req.getResultList();
		return liste;
	}

	@Override
	public Compte verif(String email, String pass) {
		
		 Query q=em.createQuery("select c from Compte c where c.email=:email and c.password=:pass ");
	     try{
	     q.setParameter("email", email);
	     q.setParameter("pass", pass);
	     Compte compte=(Compte) q.getSingleResult();
			
			return compte;
	     } catch(NoResultException e) {
	    	    return null;
	    	  }
		
	}

	@Override
	public String encrypt(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decrypt(String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
