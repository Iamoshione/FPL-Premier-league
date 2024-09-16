package com.example.SportyApi.model.events;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "top_element_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TopElementInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int top_element_info_id;

    @Column(name = "id")
    private int id;

    @Column (name = "points")
    private int points;

    @ManyToOne
    private Events events;

}
