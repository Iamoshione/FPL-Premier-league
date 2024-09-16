package com.example.SportyApi.persistence.elementstats;


import com.example.SportyApi.model.elements.Elements;
import com.example.SportyApi.model.elementstats.ElementStats;

public interface IElementStatsDAO {
    void saveElementStats(ElementStats elementStats);
}
