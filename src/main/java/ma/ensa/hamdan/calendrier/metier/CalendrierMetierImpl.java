package ma.ensa.hamdan.calendrier.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.hamdan.calendrier.dao.CalendrierRepository;
import ma.ensa.hamdan.calendrier.entities.Calendrier;
@Service
public class CalendrierMetierImpl implements CalendrierMetier {
	
	@Autowired
	private CalendrierRepository calendrierRepository;

	@Override
	public Calendrier addCalendrier(Calendrier calendrier) {
		// TODO Auto-generated method stub
		return calendrierRepository.save(calendrier);
	}

	@Override
	public Calendrier updateCalendrier(Calendrier calendrier) {
		// TODO Auto-generated method stub
		return calendrierRepository.save(calendrier);
	}

	@Override
	public List<Calendrier> listCalendrier() {
		// TODO Auto-generated method stub
		return calendrierRepository.findAll();
	}

	@Override
	public void deleteCalendrier(Long idCalendrier) {
		calendrierRepository.deleteById(idCalendrier);
		
	}

}
