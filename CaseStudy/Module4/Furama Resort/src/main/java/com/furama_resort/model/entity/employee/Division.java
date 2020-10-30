package com.furama_resort.model.entity.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="employee_division")
@Getter @Setter @NoArgsConstructor
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer divisionId;
    @Column(name="name")
    private String divisionName;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    private List<Employee> employeeList;
}
