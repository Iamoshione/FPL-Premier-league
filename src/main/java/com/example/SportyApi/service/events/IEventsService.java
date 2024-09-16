package com.example.SportyApi.service.events;

import com.example.SportyApi.model.events.ChipPlays;
import com.example.SportyApi.model.events.Events;
import com.example.SportyApi.model.events.TopElementInfo;

public interface IEventsService {
    void saveEvent(Events events);
    void saveChipPlays (ChipPlays chipPlays);
    void saveTopElementInfo(TopElementInfo topElementInfo);
}
