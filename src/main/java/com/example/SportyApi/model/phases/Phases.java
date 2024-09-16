package com.example.SportyApi.model.phases;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phases")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Phases {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_event")
    private int start_event;

    @Column(name = "stop_event")
    private int stop_event;

    @Column(name = "highest_score")
    private int highest_score;

}
