package com.vinhblue.model.entity.employee;

import com.vinhblue.model.entity.contract.Contract;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "employee")
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
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
    @JoinColumn(name = "education_degree_id", referencedColumnName = "id")
    private EducationDegree educationDegree;

    @ManyToOne()
    @JoinColumn(name = "position_id", referencedColumnName = "id")
    private Position position;

    @ManyToOne()
    @JoinColumn(name = "division_id", referencedColumnName = "id")
    private Division division;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Contract> contract;
}
