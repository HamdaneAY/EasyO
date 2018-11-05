package ma.ensa.hamdan.calendrier.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.ensa.hamdan.calendrier.entities.Calendrier;

public interface CalendrierRepository extends JpaRepository<Calendrier,Long>{

}
