package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "model")
@Getter
@Setter
@NoArgsConstructor
public class ModelManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer modelId;
    @Column(name = "model_name", length = 50)
    private String modelName;
    @Column(name="model_email", length = 50)
    private String modelEmail;
    @Column(name = "model_birth_day")
    private String modelBirthDay;
    @Column(name = "model_hobby")
    private String modelHobby;
    @Column(name="url_img")
    private String urlImg;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="city_id", referencedColumnName = "id")
    private CityManagement city;
}
