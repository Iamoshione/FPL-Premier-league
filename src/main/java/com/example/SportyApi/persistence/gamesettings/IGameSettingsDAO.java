package com.example.SportyApi.persistence.gamesettings;

import com.example.SportyApi.model.game_settings.GameSettings;

public interface IGameSettingsDAO {
    void saveGameSettings(GameSettings gameSettings);
}
