package com.example.SportyApi.service.eventwrapper.impl;

import com.example.SportyApi.model.events.EventWrapper;
import com.example.SportyApi.persistence.eventswrapper.IEventsWrapperDAO;
import com.example.SportyApi.service.eventwrapper.IEventWrapperService;
import org.springframework.stereotype.Service;

@Service
public class EventWrapperService implements IEventWrapperService {

    private final IEventsWrapperDAO iEventsWrapperDAO;

    public EventWrapperService(IEventsWrapperDAO iEventsWrapperDAO) {
        this.iEventsWrapperDAO = iEventsWrapperDAO;
    }

    @Override
    public void saveEventWrapper(EventWrapper eventWrapper) {
        EventWrapper wrapper = new EventWrapper();
        wrapper.setId(1);
        wrapper.setEvents(eventWrapper.getEvents());
        wrapper.setGame_settings(eventWrapper.getGame_settings());
        wrapper.setPhases(eventWrapper.getPhases());
        wrapper.setTotal_players(eventWrapper.getTotal_players());
        wrapper.setElement_stats(eventWrapper.getElement_stats());
        wrapper.setElement_types(eventWrapper.getElement_types());
        wrapper.setTeams(eventWrapper.getTeams());
        wrapper.setElements(eventWrapper.getElements());
        iEventsWrapperDAO.saveEventWrapper(wrapper);
    }
}
