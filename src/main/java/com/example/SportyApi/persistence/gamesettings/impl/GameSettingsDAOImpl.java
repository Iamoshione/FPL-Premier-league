package com.example.SportyApi.persistence.gamesettings.impl;

import com.example.SportyApi.model.game_settings.GameSettings;
import com.example.SportyApi.persistence.gamesettings.IGameSettingsDAO;
import com.example.SportyApi.repository.gamesettingsrepo.GameSettingsRepository;
import org.springframework.stereotype.Component;


@Component
public class GameSettingsDAOImpl implements IGameSettingsDAO {

    private final GameSettingsRepository gameSettingsRepository;

    public GameSettingsDAOImpl(GameSettingsRepository gameSettingsRepository) {
        this.gameSettingsRepository = gameSettingsRepository;
    }

    @Override
    public void saveGameSettings(GameSettings gameSettings) {
        gameSettingsRepository.save(gameSettings);
    }
}
