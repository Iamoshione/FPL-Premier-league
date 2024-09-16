package com.example.SportyApi.repository.eventsrepo;


import com.example.SportyApi.model.events.TopElementInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopElementInfoRepository extends JpaRepository<TopElementInfo,Integer> {
}
