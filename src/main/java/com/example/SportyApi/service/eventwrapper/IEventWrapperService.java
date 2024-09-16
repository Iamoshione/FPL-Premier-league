package com.example.SportyApi.service.eventwrapper;

import com.example.SportyApi.model.events.EventWrapper;
import com.example.SportyApi.persistence.eventswrapper.IEventsWrapperDAO;

public interface IEventWrapperService {
    void saveEventWrapper(EventWrapper eventWrapper);
}
