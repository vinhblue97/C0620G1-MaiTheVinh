package com.vinhblue.model.entity.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="education_degree")
@Getter @Setter @NoArgsConstructor
public class EducationDegree {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "educationDegree")
    private List<Employee> employeeList;
}
