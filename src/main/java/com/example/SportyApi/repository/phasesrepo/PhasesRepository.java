package com.example.SportyApi.repository.phasesrepo;

import com.example.SportyApi.model.phases.Phases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhasesRepository extends JpaRepository<Phases,Integer> {
}
