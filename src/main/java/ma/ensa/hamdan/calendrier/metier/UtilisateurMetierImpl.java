package ma.ensa.hamdan.calendrier.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.ensa.hamdan.calendrier.dao.UtilisateurRepository;
import ma.ensa.hamdan.calendrier.entities.Utilisateur;
@Service
public class UtilisateurMetierImpl implements UtilisateurMetier {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur addUser(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public Utilisateur updateUser(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(utilisateur);
	}

	@Override
	public List<Utilisateur> listUsers() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public void deleteUser(Long idUtilisateur) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(idUtilisateur);
		
	}

}
