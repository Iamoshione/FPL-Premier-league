package com.example.SportyApi.service.elementstats.impl;

import com.example.SportyApi.model.elements.Elements;
import com.example.SportyApi.model.elementstats.ElementStats;
import com.example.SportyApi.persistence.elementstats.IElementStatsDAO;
import com.example.SportyApi.service.elements.IElementsService;
import com.example.SportyApi.service.elementstats.IElementStatsService;
import org.springframework.stereotype.Component;

@Component
public class IElementsStatsImpl implements IElementStatsService {

    private final IElementStatsDAO iElementStatsDAO;

    public IElementsStatsImpl(IElementStatsDAO iElementStatsDAO) {
        this.iElementStatsDAO = iElementStatsDAO;
    }


    @Override
    public void saveElementStats(ElementStats elementStats) {
        iElementStatsDAO.saveElementStats(elementStats);
    }
}
