package com.example.SportyApi.model.elementtypes;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "element_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ElementTypes {


    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "plural_name")
    private String plural_name;

    @Column(name = "plural_name_short")
    private String plural_name_short;

    @Column(name = "singular_name")
    private String singular_name;

    @Column(name = "singular_name_short")
    private String singular_name_short;

    @Column(name = "squad_select")
    private int squad_select;

    @Column(name = "squad_min_select")
    private String squad_min_select;

    @Column(name = "squad_max_select")
    private String squad_max_select;

    @Column(name = "squad_min_play")
    private int squad_min_play;

    @Column(name = "squad_max_play")
    private int squad_max_play;

    @Column(name = "ui_shirt_specific")
    private boolean ui_shirt_specific;

    @Column(name = "sub_positions_locked")
    private int[] sub_positions_locked;

    @Column(name = "element_count")
    private int element_count;
}
