package com.example.SportyApi.persistence.teams.impl;

import com.example.SportyApi.model.teams.Teams;
import com.example.SportyApi.persistence.teams.ITeamsDAO;
import com.example.SportyApi.repository.teamsrepo.TeamsRepository;
import org.springframework.stereotype.Component;

@Component
public class TeamDAOImpl implements ITeamsDAO {

    private final TeamsRepository teamsRepository;

    public TeamDAOImpl(TeamsRepository teamsRepository) {
        this.teamsRepository = teamsRepository;
    }

    @Override
    public void saveTeams(Teams teams) {
        teamsRepository.save(teams);
    }
}
