package com.example.SportyApi.persistence.elementstats.impl;


import com.example.SportyApi.model.elementstats.ElementStats;
import com.example.SportyApi.persistence.elementstats.IElementStatsDAO;
import com.example.SportyApi.repository.elementstats.ElementStatsRepository;
import org.springframework.stereotype.Component;

@Component
public class ElementStatsDAOImpl implements IElementStatsDAO {

    private final ElementStatsRepository elementStatsRepository;

    public ElementStatsDAOImpl(ElementStatsRepository elementStatsRepository) {
        this.elementStatsRepository = elementStatsRepository;
    }


    @Override
    public void saveElementStats(ElementStats elementStats) {
        elementStatsRepository.save(elementStats);
    }
}
