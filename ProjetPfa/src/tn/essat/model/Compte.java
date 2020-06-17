package tn.essat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="date_creation")
	private String date_creation;
	
	
	@OneToOne
	@JoinColumn(name="personne_id")
	private Personne user;
	@JoinColumn(name="role_id")
	private Role role;
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Compte(int id, String email, String password, String date_creation, Personne user, Role role) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.date_creation = date_creation;
		this.user = user;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDate_creation() {
		return date_creation;
	}


	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}


	public Personne getUser() {
		return user;
	}


	public void setUser(Personne user) {
		this.user = user;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}
	
	
		
	

	

}
