package com.vinhblue.model.entity.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "employee")
@Getter @Setter @NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", columnDefinition = "int")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_birthday")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate employeeBirthDay;

    @Column(name = "employe_idcard")
    private String employeeIdCard;

    @Column(name = "employee_phone")
    private String employeePhone;

    @Column(name = "employee_email")
    private String employeeEmail;

    @Column(name = "employee_salary")
    private Long employeeSalary;

    @ManyToOne()
    @JoinColumn(name = "education_degree_id", referencedColumnName = "education_degree_id")
    private EducationDegree employeeEducationDegree;

    @ManyToOne()
    @JoinColumn(name = "position_id", referencedColumnName = "position_id")
    private Position employeePosition;

    @ManyToOne()
    @JoinColumn(name = "division_id", referencedColumnName = "division_id")
    private Division employeeDivision;
}
