package com.example.SportyApi.repository.eventsrepo;


import com.example.SportyApi.model.events.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends JpaRepository<Events,Integer> {
}

