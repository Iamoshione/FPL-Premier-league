package com.example.SportyApi.model.game_settings;


import com.example.SportyApi.model.events.EventWrapper;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "game_settings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameSettings {

    @Id
    private int game_settings_id;

    @Column(name = "league_join_private_max")
    private int league_join_private_max;

    @Column(name = "league_join_public_max")
    private int league_join_public_max;

    @Column(name = "league_max_size_public_classic")
    private int league_max_size_public_classic;

    @Column(name = "league_max_size_public_h2h")
    private int league_max_size_public_h2h;

    @Column(name = "league_max_size_private_h2h")
    private int league_max_size_private_h2h;

    @Column(name = "league_max_ko_rounds_private_h2h")
    private int league_max_ko_rounds_private_h2h;

    @Column(name = "league_prefix_public")
    private String league_prefix_public;

    @Column(name = "league_points_h2h_win")
    private int league_points_h2h_win;

    @Column(name = "league_points_h2h_lose")
    private int league_points_h2h_lose;

    @Column(name = "league_points_h2h_draw")
    private int league_points_h2h_draw;

    @Column(name = "league_ko_first_instead_of_random")
    private boolean league_ko_first_instead_of_random;

    @Column(name = "cup_start_event_id")
    private Integer cup_start_event_id;  // Integer to allow null

    @Column(name = "cup_stop_event_id")
    private Integer cup_stop_event_id;  // Integer to allow null

    @Column(name = "cup_qualifying_method")
    private String cup_qualifying_method;

    @Column(name = "cup_type")
    private String cup_type;

   @Column(name = "featured_entries")
   private String[] featured_entries;  // Array to hold list of entries

    @Column(name = "percentile_ranks")
    private int[] percentile_ranks;

    @Column(name = "squad_squadplay")
    private int squad_squadplay;

    @Column(name = "squad_squadsize")
    private int squad_squadsize;

    @Column(name = "squad_team_limit")
    private int squad_team_limit;

    @Column(name = "squad_total_spend")
    private int squad_total_spend;

    @Column(name = "ui_currency_multiplier")
    private int ui_currency_multiplier;

    @Column(name = "ui_use_special_shirts")
    private boolean ui_use_special_shirts;

    @Column(name = "ui_special_shirt_exclusions")
    private String[] ui_special_shirt_exclusions;  // Array to hold list of exclusions

    @Column(name = "stats_form_days")
    private int stats_form_days;

    @Column(name = "sys_vice_captain_enabled")
    private boolean sys_vice_captain_enabled;

    @Column(name = "transfers_cap")
    private int transfers_cap;

    @Column(name = "transfers_sell_on_fee")
    private double transfers_sell_on_fee;

    @Column(name = "max_extra_free_transfers")
    private int max_extra_free_transfers;

    @Column(name = "league_h2h_tiebreak_stats")
    private String[] league_h2h_tiebreak_stats;  // Array to hold list of stats

    @Column(name = "timezone")
    private String timezone;
}
