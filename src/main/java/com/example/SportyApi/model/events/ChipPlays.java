package com.example.SportyApi.model.events;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "chip_plays")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChipPlays {

    @Id
    @Column(name = "num_played")
    private int num_played;

    @Column(name = "chip_name")
    private String chip_name;

    @ManyToOne
    private Events events;

}
