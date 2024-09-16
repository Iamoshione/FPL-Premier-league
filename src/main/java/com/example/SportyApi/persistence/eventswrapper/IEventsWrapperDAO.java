package com.example.SportyApi.persistence.eventswrapper;


import com.example.SportyApi.model.events.EventWrapper;

public interface IEventsWrapperDAO {
    void saveEventWrapper(EventWrapper eventWrapper);
}
