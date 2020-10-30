package com.furama_resort.model.entity.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="employee_position")
@Getter @Setter @NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer positionId;
    @Column(name="name")
    private String positionName;

    @OneToMany(mappedBy = "position", cascade = CascadeType.ALL)
    private List<Employee> employeeList;
}
