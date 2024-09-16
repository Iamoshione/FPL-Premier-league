package com.example.SportyApi.service.events.impl;

import com.example.SportyApi.model.events.ChipPlays;
import com.example.SportyApi.model.events.Events;
import com.example.SportyApi.model.events.TopElementInfo;
import com.example.SportyApi.persistence.events.IEventsDAO;
import com.example.SportyApi.service.events.IEventsService;
import org.springframework.stereotype.Service;


@Service
public class EventsServiceImpl implements IEventsService {

    private final IEventsDAO iEventsDAO;

    public EventsServiceImpl(IEventsDAO iEventsDAO){
        this.iEventsDAO = iEventsDAO;
    }

    @Override
    public void saveEvent(Events events) {
        iEventsDAO.saveEvent(events);
    }

    @Override
    public void saveChipPlays(ChipPlays chipPlays) {
        iEventsDAO.saveChipPlays(chipPlays);
    }

    @Override
    public void saveTopElementInfo(TopElementInfo topElementInfo) {
        iEventsDAO.saveTopElementInfo(topElementInfo);
    }
}
