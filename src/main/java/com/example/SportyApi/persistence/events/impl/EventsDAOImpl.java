package com.example.SportyApi.persistence.events.impl;

import com.example.SportyApi.model.events.ChipPlays;
import com.example.SportyApi.model.events.Events;
import com.example.SportyApi.model.events.TopElementInfo;
import com.example.SportyApi.persistence.events.IEventsDAO;
import com.example.SportyApi.repository.eventsrepo.ChipPlaysRepository;
import com.example.SportyApi.repository.eventsrepo.EventsRepository;
import com.example.SportyApi.repository.eventsrepo.TopElementInfoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;


@Component
public class EventsDAOImpl implements IEventsDAO {


    private final EventsRepository eventsRepository;
    private final ChipPlaysRepository chipPlaysRepository;
    private final TopElementInfoRepository topElementInfoRepository;


    public EventsDAOImpl(EventsRepository eventsRepository,ChipPlaysRepository chipPlaysRepository,TopElementInfoRepository topElementInfoRepository){
        this.eventsRepository = eventsRepository;
        this.chipPlaysRepository = chipPlaysRepository;
        this.topElementInfoRepository = topElementInfoRepository;
    }


    @Override
      public void saveEvent(Events events) {
        eventsRepository.save(events);
    }

    @Override
    public void saveChipPlays(ChipPlays chipPlays) {
         chipPlaysRepository.save(chipPlays);
    }

    @Override
    public void saveTopElementInfo(TopElementInfo topElementInfo) {
   topElementInfoRepository.save(topElementInfo);
    }
}
