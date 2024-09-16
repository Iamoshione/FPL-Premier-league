package com.example.SportyApi.service.teams.impl;

import com.example.SportyApi.model.teams.Teams;
import com.example.SportyApi.persistence.teams.ITeamsDAO;
import com.example.SportyApi.service.teams.ITeamsService;
import org.springframework.stereotype.Service;

@Service
public class TeamsServcieImpl implements ITeamsService {

    private final ITeamsDAO iTeamsDAO;

    public TeamsServcieImpl(ITeamsDAO iTeamsDAO) {
        this.iTeamsDAO = iTeamsDAO;
    }

    @Override
    public void saveTeams(Teams teams) {
        iTeamsDAO.saveTeams(teams);
    }
}
