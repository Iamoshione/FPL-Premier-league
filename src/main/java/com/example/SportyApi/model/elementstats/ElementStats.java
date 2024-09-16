package com.example.SportyApi.model.elementstats;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "element_stats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ElementStats {

    @Id
    @Column(name = " Label")
    private String Label;

    @Column(name = "name")
    private String name;
}
