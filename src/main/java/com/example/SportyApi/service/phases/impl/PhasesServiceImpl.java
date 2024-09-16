package com.example.SportyApi.service.phases.impl;

import com.example.SportyApi.model.phases.Phases;
import com.example.SportyApi.persistence.phases.IPhasesDAO;
import com.example.SportyApi.service.phases.IPhasesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhasesServiceImpl implements IPhasesService {

    private final IPhasesDAO iPhasesDAO;

    public PhasesServiceImpl (IPhasesDAO iPhasesDAO){
        this.iPhasesDAO = iPhasesDAO;
    }

    @Override
    public void savePhases(Phases phases) {
        iPhasesDAO.savePhases(phases);
    }

    @Override
    public List<Phases> findAll() {
       return iPhasesDAO.findAll();
    }
}
