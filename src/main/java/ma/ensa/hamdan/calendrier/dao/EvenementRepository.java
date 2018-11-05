package ma.ensa.hamdan.calendrier.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.hamdan.calendrier.entities.Evenement;

public interface EvenementRepository  extends JpaRepository<Evenement,Long>{

}
