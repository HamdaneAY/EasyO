package ma.ensa.hamdan.calendrier.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_utilisateur;
	private String telephone;
	private String email;
	private String password;
	private String nom;
	private String prenom;
	private String fonction;
	@OneToMany(mappedBy="utilisateur")
	private Set<Calendrier> calendries= new HashSet<>();
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String telephone, String email, String password, String nom, String prenom, String fonction) {
		super();
		this.telephone = telephone;
		this.email = email;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
	}
	
	public Long getId_utilisateur() {
		return id_utilisateur;
	}
	public void setId_utilisateur(Long id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public void setCalendries(Set<Calendrier> calendries) {
		this.calendries = calendries;
	}
	public Set<Calendrier> getCalendries() {
		return calendries;
	}
	
	
	
	
	

}
