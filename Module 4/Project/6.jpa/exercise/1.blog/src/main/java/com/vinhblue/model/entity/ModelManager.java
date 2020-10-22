package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "model")
@Getter
@Setter
@NoArgsConstructor
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer modelId;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "model_age")
    private String modelAge;
    @Column(name = "model_hobby")
    private String modelHobby;

    public Model(Integer modelId, String modelName, String modelAge, String modelHobby) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.modelAge = modelAge;
        this.modelHobby = modelHobby;
    }
}
