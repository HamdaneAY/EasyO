package ma.ensa.hamdan.calendrier.metier;

import java.util.List;

import ma.ensa.hamdan.calendrier.entities.Utilisateur;

public interface UtilisateurMetier {

	public Utilisateur addUser(Utilisateur utilisateur);

	public Utilisateur updateUser(Utilisateur utilisateur);

	public List<Utilisateur> listUsers();

	public void deleteUser(Long idUtilisateur);

}
