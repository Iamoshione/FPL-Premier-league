package com.example.SportyApi.repository.elementstats;

import com.example.SportyApi.model.elementstats.ElementStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementStatsRepository extends JpaRepository<ElementStats,String> {
}
