package ma.ensa.hamdan.calendrier.metier;

import java.util.List;

import ma.ensa.hamdan.calendrier.entities.Evenement;

public interface EvenementMetier {
	public Evenement addEvent(Evenement event);
	public Evenement updateEvent(Evenement event);
	public List<Evenement> listEvents();
	public void deleteEvent(Long idEvenement);
}
