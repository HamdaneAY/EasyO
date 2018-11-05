package ma.ensa.hamdan.calendrier.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Evenement  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_evenemet;
	private String designation;
	private String description;
	private Date date_debut;
	private Date date_fin;
	private boolean notifier;
	private String importance;
	private String type;
	
	@ManyToOne
	@JoinColumn(name="id_calendrier")
	private Calendrier calendrier;

	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Evenement(String designation, String description, Date date_debut, Date date_fin, boolean notifier,
			String importance, String type, Calendrier calendrier) {
		super();
		this.designation = designation;
		this.description = description;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.notifier = notifier;
		this.importance = importance;
		this.type = type;
		this.calendrier = calendrier;
	}

	public Long getId_evenemet() {
		return id_evenemet;
	}

	public void setId_evenemet(Long id_evenemet) {
		this.id_evenemet = id_evenemet;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public boolean isNotifier() {
		return notifier;
	}

	public void setNotifier(boolean notifier) {
		this.notifier = notifier;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
   @JsonIgnore
	public Calendrier getCalendrier() {
		return calendrier;
	}
    @JsonSetter
	public void setCalendrier(Calendrier calendrier) {
		this.calendrier = calendrier;
	}
	
	
	
	

}
