package com.example.SportyApi.persistence.events;


import com.example.SportyApi.model.events.ChipPlays;
import com.example.SportyApi.model.events.Events;
import com.example.SportyApi.model.events.TopElementInfo;

public interface IEventsDAO {
    void saveEvent(Events events);
    void saveChipPlays (ChipPlays chipPlays);
    void saveTopElementInfo(TopElementInfo topElementInfo);
}
