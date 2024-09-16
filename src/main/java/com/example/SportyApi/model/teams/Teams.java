package com.example.SportyApi.model.teams;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "teams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teams {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private int code;

    @Column(name = "draw")
    private int draw;

    @Column(name = "form")
    private String form;

    @Column(name = "name")
    private String name;

    @Column(name = "played")
    private int played;

    @Column(name = "points")
    private int points;

    @Column(name = "position")
    private int position;

    @Column(name = "short_name")
    private String short_name;

    @Column(name = "strength")
    private int strength;

    @Column(name = "team_division")
    private String team_division;

    @Column(name = "unavailable")
    private boolean unavailable;

    @Column(name = "win")
    private int win;

    @Column(name = "loss")
    private int loss;

    @Column(name = "strength_overall_home")
    private int strength_overall_home;

    @Column(name = "strength_overall_away")
    private int strength_overall_away;

    @Column(name = "strength_attack_home")
    private int strength_attack_home;

    @Column(name = "strength_attack_away")
    private int strength_attack_away;

    @Column(name = "strength_defence_home")
    private int strength_defence_home;

    @Column(name = "strength_defence_away")
    private int strength_defence_away;

    @Column(name = "pulse_id")
    private int pulse_id;
}
