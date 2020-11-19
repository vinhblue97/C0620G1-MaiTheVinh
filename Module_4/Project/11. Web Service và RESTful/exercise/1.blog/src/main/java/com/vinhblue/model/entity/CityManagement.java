package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "city")
@Getter
@Setter
@NoArgsConstructor
public class CityManagement {

    @Id
    @Column(name = "id")
    private Integer cityId;
    @Column(name = "name")
    private String cityName;

    @OneToOne(mappedBy = "city", cascade = CascadeType.ALL)
    private ModelManager modelManager;
}
