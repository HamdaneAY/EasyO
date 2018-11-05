package ma.ensa.hamdan.calendrier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.hamdan.calendrier.entities.Calendrier;
import ma.ensa.hamdan.calendrier.metier.CalendrierMetier;

@RestController
@RequestMapping("/EasyO")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class CalendrierRestService {
	
	@Autowired
	private CalendrierMetier calendrierMetier;
     
	@RequestMapping(value="/calendar",method=RequestMethod.POST)
	public Calendrier addCalendrier(Calendrier calendrier) {
		return calendrierMetier.addCalendrier(calendrier);
	}
	@RequestMapping(value="/calendar",method=RequestMethod.PUT)
	public Calendrier updateCalendrier(Calendrier calendrier) {
		return calendrierMetier.updateCalendrier(calendrier);
	}
	@RequestMapping(value="/calendar",method=RequestMethod.GET)
	public List<Calendrier> listCalendrier() {
		return calendrierMetier.listCalendrier();
	}
	@RequestMapping(value="/calendar",method=RequestMethod.DELETE)
	public void deleteCalendrier(Long idCalendrier) {
		calendrierMetier.deleteCalendrier(idCalendrier);
	}
	
	

}
