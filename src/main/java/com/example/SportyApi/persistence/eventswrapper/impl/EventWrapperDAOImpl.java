package com.example.SportyApi.persistence.eventswrapper.impl;

import com.example.SportyApi.model.events.EventWrapper;
import com.example.SportyApi.persistence.eventswrapper.IEventsWrapperDAO;
import com.example.SportyApi.repository.eventwrapperrepo.EventsWrapperRepository;
import org.springframework.stereotype.Component;


@Component
public class EventWrapperDAOImpl implements IEventsWrapperDAO {

    private final EventsWrapperRepository eventsWrapperRepository;

    public EventWrapperDAOImpl(EventsWrapperRepository eventsWrapperRepository) {
        this.eventsWrapperRepository = eventsWrapperRepository;
    }


    @Override
    public void saveEventWrapper(EventWrapper eventWrapper) {
        eventsWrapperRepository.save(eventWrapper);
    }
}
