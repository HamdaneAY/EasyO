package ma.ensa.hamdan.calendrier.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.hamdan.calendrier.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

}
