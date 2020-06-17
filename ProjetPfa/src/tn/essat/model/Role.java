package tn.essat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="type_compte")
	private String type_compte;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Role(int id, String type_compte) {
		super();
		this.id = id;
		this.type_compte = type_compte;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType_compte() {
		return type_compte;
	}


	public void setType_compte(String type_compte) {
		this.type_compte = type_compte;
	}
	
	
	
	

}
