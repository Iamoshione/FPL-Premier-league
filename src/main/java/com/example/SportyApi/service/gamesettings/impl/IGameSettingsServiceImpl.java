package com.example.SportyApi.service.gamesettings.impl;

import com.example.SportyApi.model.game_settings.GameSettings;
import com.example.SportyApi.persistence.gamesettings.IGameSettingsDAO;
import com.example.SportyApi.service.gamesettings.IGameSettingsService;
import org.springframework.stereotype.Service;


@Service
public class IGameSettingsServiceImpl implements IGameSettingsService {

    private final IGameSettingsDAO iGameSettingsDAO;

    public IGameSettingsServiceImpl(IGameSettingsDAO iGameSettingsDAO){
        this.iGameSettingsDAO = iGameSettingsDAO;
    }

    @Override
    public void saveGameSettings(GameSettings gameSettings) {
        iGameSettingsDAO.saveGameSettings(gameSettings);
    }

}
