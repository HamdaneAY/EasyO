package ma.ensa.hamdan.calendrier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.ensa.hamdan.calendrier.entities.Utilisateur;
import ma.ensa.hamdan.calendrier.metier.UtilisateurMetier;

@RestController
@RequestMapping("/EasyO")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class UtilisateurRestService {
	
	@Autowired
	private UtilisateurMetier utilisateurMetier;
    
	@RequestMapping(value="utilisateur" , method=RequestMethod.POST)
	public Utilisateur addUser(Utilisateur utilisateur) {
		return utilisateurMetier.addUser(utilisateur);
	}
    
	@RequestMapping(value="utilisateur",method=RequestMethod.PUT)
     public Utilisateur updateUser(Utilisateur utilisateur) {
		return utilisateurMetier.updateUser(utilisateur);
	}
	
    @RequestMapping(value="utilisateur",method=RequestMethod.GET)
	public List<Utilisateur> listUsers() {
		return utilisateurMetier.listUsers();
	}
    
    @RequestMapping(value="utilisateur",method=RequestMethod.DELETE)
	public void deleteUser(Long idUtilisateur) {
		utilisateurMetier.deleteUser(idUtilisateur);
	}
	
	

}
