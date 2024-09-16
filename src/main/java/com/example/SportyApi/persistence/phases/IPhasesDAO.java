package com.example.SportyApi.persistence.phases;

import com.example.SportyApi.model.phases.Phases;

import java.util.List;

public interface IPhasesDAO {
    void savePhases(Phases phases);
    List<Phases> findAll();
    boolean verifyPhases(List<Phases> phasesList);
}
