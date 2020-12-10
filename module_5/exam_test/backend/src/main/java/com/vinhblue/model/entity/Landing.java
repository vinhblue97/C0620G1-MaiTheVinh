package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name ="landing")
@Getter @Setter @NoArgsConstructor
public class Landing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "int")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="price", columnDefinition = "int")
    private String price;

    @Column(name="area", columnDefinition = "int")
    private String area;


}
