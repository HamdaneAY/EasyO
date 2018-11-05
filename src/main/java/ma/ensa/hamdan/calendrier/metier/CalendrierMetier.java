package ma.ensa.hamdan.calendrier.metier;

import java.util.List;

import ma.ensa.hamdan.calendrier.entities.Calendrier;

public interface CalendrierMetier {
public Calendrier addCalendrier(Calendrier calendrier);
public Calendrier updateCalendrier(Calendrier calendrier);
public List<Calendrier> listCalendrier();
public void deleteCalendrier(Long idCalendrier);

}
