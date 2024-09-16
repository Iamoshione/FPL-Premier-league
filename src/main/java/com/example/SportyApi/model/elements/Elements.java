package com.example.SportyApi.model.elements;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "elements")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Elements {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "chance_of_playing_next_round")
    private int chance_of_playing_next_round;

    @Column(name = "chance_of_playing_this_round")
    private int chance_of_playing_this_round;

    @Column(name = "code")
    private int code;

    @Column(name = "cost_change_event")
    private int cost_change_event;

    @Column(name = "cost_change_event_fall")
    private int cost_change_event_fall;

    @Column(name = "cost_change_start")
    private int cost_change_start;

    @Column(name = "cost_change_start_fall")
    private int cost_change_start_fall;

    @Column(name = "dreamteam_count")
    private int dreamteam_count;

    @Column(name = "element_type")
    private int element_type;

    @Column(name = "ep_next")
    private String ep_next;

    @Column(name = "ep_this")
    private String ep_this;

    @Column(name = "event_points")
    private int event_points;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "form")
    private String form;

    @Column(name = "in_dreamteam")
    private boolean in_dreamteam;

    @Column(name = "news")
    private String news;

    @Column(name = "news_added")
    private String news_added;

    @Column(name = "now_cost")
    private int now_cost;

    @Column(name = "photo")
    private String photo;

    @Column(name = "points_per_game")
    private String points_per_game;

    @Column(name = "second_name")
    private String second_name;

    @Column(name = "selected_by_percent")
    private String selected_by_percent;

    @Column(name = "special")
    private boolean special;

    @Column(name = "squad_number")
    private Integer squad_number;

    @Column(name = "status")
    private String status;

    @Column(name = "team")
    private int team;

    @Column(name = "team_code")
    private int team_code;

    @Column(name = "total_points")
    private int total_points;

    @Column(name = "transfers_in")
    private int transfers_in;

    @Column(name = "transfers_in_event")
    private int transfers_in_event;

    @Column(name = "transfers_out")
    private int transfers_out;

    @Column(name = "transfers_out_event")
    private int transfers_out_event;

    @Column(name = "value_form")
    private String value_form;

    @Column(name = "value_season")
    private String value_season;

    @Column(name = "web_name")
    private String web_name;

    @Column(name = "region")
    private String region;

    @Column(name = "minutes")
    private int minutes;

    @Column(name = "goals_scored")
    private int goals_scored;

    @Column(name = "assists")
    private int assists;

    @Column(name = "clean_sheets")
    private int clean_sheets;

    @Column(name = "goals_conceded")
    private int goals_conceded;

    @Column(name = "own_goals")
    private int own_goals;

    @Column(name = "penalties_saved")
    private int penalties_saved;

    @Column(name = "penalties_missed")
    private int penalties_missed;

    @Column(name = "yellow_cards")
    private int yellow_cards;

    @Column(name = "red_cards")
    private int red_cards;

    @Column(name = "saves")
    private int saves;

    @Column(name = "bonus")
    private int bonus;

    @Column(name = "bps")
    private int bps;

    @Column(name = "influence")
    private String influence;

    @Column(name = "creativity")
    private String creativity;

    @Column(name = "threat")
    private String threat;

    @Column(name = "ict_index")
    private String ict_index;

    @Column(name = "starts")
    private int starts;

    @Column(name = "expected_goals")
    private String expected_goals;

    @Column(name = "expected_assists")
    private String expected_assists;

    @Column(name = "expected_goal_involvements")
    private String expected_goal_involvements;

    @Column(name = "expected_goals_conceded")
    private String expected_goals_conceded;

    @Column(name = "influence_rank")
    private int influence_rank;

    @Column(name = "influence_rank_type")
    private int influence_rank_type;

    @Column(name = "creativity_rank")
    private int creativity_rank;

    @Column(name = "creativity_rank_type")
    private int creativity_rank_type;

    @Column(name = "threat_rank")
    private int threat_rank;

    @Column(name = "threat_rank_type")
    private int threat_rank_type;

    @Column(name = "ict_index_rank")
    private int ict_index_rank;

    @Column(name = "ict_index_rank_type")
    private int ict_index_rank_type;

    @Column(name = "corners_and_indirect_freekicks_order")
    private String corners_and_indirect_freekicks_order;

    @Column(name = "corners_and_indirect_freekicks_text")
    private String corners_and_indirect_freekicks_text;

    @Column(name = "direct_freekicks_order")
    private String direct_freekicks_order;

    @Column(name = "direct_freekicks_text")
    private String direct_freekicks_text;

    @Column(name = "penalties_order")
    private int penalties_order;

    @Column(name = "penalties_text")
    private String penalties_text;

    @Column(name = "expected_goals_per_90")
    private String expected_goals_per_90;

    @Column(name = "saves_per_90")
    private String saves_per_90;

    @Column(name = "expected_assists_per_90")
    private String expected_assists_per_90;

    @Column(name = "expected_goal_involvements_per_90")
    private String expected_goal_involvements_per_90;

    @Column(name = "expected_goals_conceded_per_90")
    private String expected_goals_conceded_per_90;

    @Column(name = "goals_conceded_per_90")
    private String goals_conceded_per_90;

    @Column(name = "now_cost_rank")
    private int now_cost_rank;

    @Column(name = "now_cost_rank_type")
    private int now_cost_rank_type;

    @Column(name = "form_rank")
    private int form_rank;

    @Column(name = "form_rank_type")
    private int form_rank_type;

    @Column(name = "points_per_game_rank")
    private int points_per_game_rank;

    @Column(name = "points_per_game_rank_type")
    private int points_per_game_rank_type;

    @Column(name = "selected_rank")
    private int selected_rank;

    @Column(name = "selected_rank_type")
    private int selected_rank_type;

    @Column(name = "starts_per_90")
    private String starts_per_90;

    @Column(name = "clean_sheets_per_90")
    private String clean_sheets_per_90;
}
