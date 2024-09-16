package com.example.SportyApi.repository.teamsrepo;

import com.example.SportyApi.model.teams.Teams;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamsRepository extends JpaRepository<Teams,Integer> {
}
