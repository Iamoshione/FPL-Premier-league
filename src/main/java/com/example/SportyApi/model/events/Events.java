package com.example.SportyApi.model.events;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Events {


    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "deadline_time")
    private String deadline_time;

    @Column(name = "release_time")
    private String release_time;

    @Column(name = "average_entry_score")
    private Integer average_entry_score;

    @Column(name = "finished")
    private Boolean finished;

    @Column(name = "data_checked")
    private Boolean data_checked;

    @Column(name = "highest_scoring_entry")
    private Long highest_scoring_entry;

    @Column(name = "deadline_time_epoch")
    private Long deadline_time_epoch;

    @Column(name = "deadline_time_game_offset")
    private Integer deadline_time_game_offset;

    @Column(name = "highest_score")
    private Integer highest_score;

    @Column(name = "is_previous")
    private Boolean is_previous;

    @Column(name = "is_current")
    private Boolean is_current;

    @Column(name = "is_next")
    private Boolean is_next;

    @Column(name = "cup_leagues_created")
    private Boolean cup_leagues_created;

    @Column(name = "h2h_ko_matches_created")
    private Boolean h2h_ko_matches_created;

    @Column(name = "ranked_count")
    private Integer ranked_count;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ChipPlays> chip_plays;

    @Column(name = "most_selected")
    private Integer most_selected;

    @Column(name = "most_transferred_in")
    private Integer most_transferred_in;

    @Column(name = "top_element")
    private Integer top_element;

    @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "top_element_info_id")
    private TopElementInfo top_element_info;

    @Column(name = "transfers_made")
    private Integer transfers_made;

    @Column(name = "most_captained")
    private Integer most_captained;

    @Column(name = "most_vice_captained")
    private Integer most_vice_captained;

}
