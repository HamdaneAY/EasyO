package ma.ensa.hamdan.calendrier.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.hamdan.calendrier.dao.EvenementRepository;
import ma.ensa.hamdan.calendrier.entities.Evenement;

@Service
public class EvenementMetierImpl implements EvenementMetier {
    @Autowired
	private EvenementRepository evenementRepository;
	@Override
	public Evenement addEvent(Evenement event) {
		// TODO Auto-generated method stub
		return evenementRepository.save(event);
	}

	@Override
	public Evenement updateEvent(Evenement event) {
		// TODO Auto-generated method stub
		return evenementRepository.save(event);
	}

	@Override
	public List<Evenement> listEvents() {
		// TODO Auto-generated method stub
		return evenementRepository.findAll();
	}

	@Override
	public void deleteEvent(Long idEvenement) {
    evenementRepository.deleteById(idEvenement);		
	}

}
