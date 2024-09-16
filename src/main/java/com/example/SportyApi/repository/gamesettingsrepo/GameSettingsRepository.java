package com.example.SportyApi.repository.gamesettingsrepo;

import com.example.SportyApi.model.game_settings.GameSettings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameSettingsRepository extends JpaRepository<GameSettings,Integer> {
}
