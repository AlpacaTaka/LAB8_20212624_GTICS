package edu.pucp.lab8_20212624_gtics.repository;

import edu.pucp.lab8_20212624_gtics.entity.CrewMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CrewMemberRepository extends JpaRepository<CrewMember, Long> {
}

