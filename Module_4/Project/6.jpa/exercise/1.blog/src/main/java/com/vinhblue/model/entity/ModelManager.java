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
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "model_age")
    private String modelAge;
    @Column(name = "model_hobby")
    private String modelHobby;
    @Column(name="url_img")
    private String urlImg;

    public ModelManager(Integer modelId, String modelName, String modelAge, String modelHobby, String urlImg) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.modelAge = modelAge;
        this.modelHobby = modelHobby;
        this.urlImg = urlImg;
    }
}
