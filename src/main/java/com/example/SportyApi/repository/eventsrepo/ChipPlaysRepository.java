package com.example.SportyApi.repository.eventsrepo;

import com.example.SportyApi.model.events.ChipPlays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipPlaysRepository extends JpaRepository<ChipPlays,Integer> {
}
