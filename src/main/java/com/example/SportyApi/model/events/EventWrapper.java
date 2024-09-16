package com.example.SportyApi.model.events;


import com.example.SportyApi.controller.http.HttpConnection;
import com.example.SportyApi.model.elements.Elements;
import com.example.SportyApi.model.elementstats.ElementStats;
import com.example.SportyApi.model.elementtypes.ElementTypes;
import com.example.SportyApi.model.game_settings.GameSettings;
import com.example.SportyApi.model.phases.Phases;
import com.example.SportyApi.model.teams.Teams;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EventWrapper {

    @Id
    private int id;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_wrapper_id")
    private List<Events> events;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_wrapper_id")
    private List<Phases> phases;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_wrapper_id")
    private List<Teams> teams;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_wrapper_id")
    private List<Elements> elements;

    @Column(name = "total_players")
    private int total_players;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_wrapper_id")
    private List<ElementStats> element_stats;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "event_wrapper_id")
    private List<ElementTypes> element_types;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "game_settings_id")
    private GameSettings game_settings;


}

