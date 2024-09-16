package com.example.SportyApi.service.phases;

import com.example.SportyApi.model.phases.Phases;

import java.util.List;

public interface IPhasesService {
    void savePhases(Phases phases);
    List<Phases> findAll();
}
