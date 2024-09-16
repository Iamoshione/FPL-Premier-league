package com.example.SportyApi.repository.eventwrapperrepo;

import com.example.SportyApi.model.events.EventWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsWrapperRepository extends JpaRepository<EventWrapper,Long> {
}
