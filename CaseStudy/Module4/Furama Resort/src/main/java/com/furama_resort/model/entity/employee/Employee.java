package com.furama_resort.model.entity.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="employee")
@Getter @Setter @NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer employeeId;
    @Column(name="employee_name")
    private String employeeName;
    @Column(name="employee_birthday")
    private String employeeBirthDay;
    @Column(name="employee_id_card")
    private String employeeIdCard;
    @Column(name="employee_phone_number")
    private String employeePhoneNumber;
    @Column(name="employee_email")
    private String employeeEmail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_degree_id", referencedColumnName = "id")
    private EducationDegree educationDegree;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="position_id", referencedColumnName = "id")
    private Position position;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="division_id", referencedColumnName = "id")
    private Division division;
}
