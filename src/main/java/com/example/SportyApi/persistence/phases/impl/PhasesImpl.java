package com.example.SportyApi.persistence.phases.impl;


import com.example.SportyApi.model.phases.Phases;
import com.example.SportyApi.persistence.phases.IPhasesDAO;
import com.example.SportyApi.repository.phasesrepo.PhasesRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhasesImpl implements IPhasesDAO {

    private final PhasesRepository phasesRepository;

    public PhasesImpl(PhasesRepository phasesRepository){
        this.phasesRepository = phasesRepository;
    }
    @Override
    public void savePhases(Phases phases) {
        phasesRepository.save(phases);
    }

    @Override
    public List<Phases> findAll() {
       return phasesRepository.findAll();
    }

    @Override
    public boolean verifyPhases(List<Phases> phasesList) {
        return false;
    }


}
