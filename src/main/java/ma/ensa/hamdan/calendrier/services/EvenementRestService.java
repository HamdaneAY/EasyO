package ma.ensa.hamdan.calendrier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.hamdan.calendrier.entities.Evenement;
import ma.ensa.hamdan.calendrier.metier.EvenementMetier;

@RestController
@RequestMapping("/EasyO")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class EvenementRestService {
	
	@Autowired
	private EvenementMetier evenementMetier;
    
	@RequestMapping(value="evenement",method=RequestMethod.POST)
	public Evenement addEvent(Evenement event) {
		return evenementMetier.addEvent(event);
	}
	@RequestMapping(value="evenement",method=RequestMethod.PUT)
	public Evenement updateEvent(Evenement event) {
		return evenementMetier.updateEvent(event);
	}
	@RequestMapping(value="evenement",method=RequestMethod.GET)
	public List<Evenement> listEvents() {
		return evenementMetier.listEvents();
	}
	@RequestMapping(value="evenement",method=RequestMethod.DELETE)
	public void deleteEvent(Long idEvenement) {
		evenementMetier.deleteEvent(idEvenement);
	}

}
