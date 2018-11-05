package ma.ensa.hamdan.calendrier.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Calendrier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_calendrier;
	private String designation;
	private Date data_creation;
	
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	
	@OneToMany(mappedBy="calendrier")
	private Set<Evenement> evenements =new HashSet<>();
	
	public Calendrier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calendrier(String designation) {
		super();
		this.designation = designation;
		this.data_creation=new Date();
	}
	public Long getId_calendrier() {
		return id_calendrier;
	}
	public void setId_calendrier(Long id_calendrier) {
		this.id_calendrier = id_calendrier;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getData_creation() {
		return data_creation;
	}
	public void setData_creation() {
		this.data_creation = new Date();
	}
	@JsonIgnore
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	@JsonIgnore
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Set<Evenement> getEvenements() {
		return evenements;
	}
	public void setEvenements(Set<Evenement> evenements) {
		this.evenements = evenements;
	}
	
	

}
