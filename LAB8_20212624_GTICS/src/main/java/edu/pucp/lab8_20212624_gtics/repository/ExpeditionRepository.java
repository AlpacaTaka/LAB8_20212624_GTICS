package edu.pucp.lab8_20212624_gtics.repository;

import edu.pucp.lab8_20212624_gtics.entity.Expedition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExpeditionRepository extends JpaRepository<Expedition, Long> {
}

