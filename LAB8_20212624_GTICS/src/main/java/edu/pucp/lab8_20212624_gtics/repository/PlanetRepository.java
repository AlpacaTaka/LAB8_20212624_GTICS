package edu.pucp.lab8_20212624_gtics.repository;


import edu.pucp.lab8_20212624_gtics.entity.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

}
