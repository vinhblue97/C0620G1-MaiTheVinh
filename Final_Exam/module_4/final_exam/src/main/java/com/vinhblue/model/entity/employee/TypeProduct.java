package com.vinhblue.model.entity.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="position")
@Getter @Setter @NoArgsConstructor
public class TypeProduct {
    @Id
    @Column(name="position_id")
    private Integer id;

    @Column(name="position_name")
    private String name;

    @OneToMany(mappedBy = "employeePosition")
    private List<Product> productList;
}
