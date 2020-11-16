package com.vinhblue.model.entity.contract;

import com.vinhblue.model.entity.customer.Customer;
import com.vinhblue.model.entity.employee.Employee;
import com.vinhblue.model.entity.service_furama.ServiceFurama;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.Set;

@Entity(name="contract")
@Getter @Setter @NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contract_id")
    private Integer id;

    @Column(name="start_date")
    @Past
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate startDate;

    @Column(name="end_date")
    @Future
    @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
    private LocalDate endDate;

    @Column(name="deposit")
    private Double deposit;

    @Column(name="total_money")
    private Double totalMoney;

    @ManyToOne()
    @JoinColumn(name="customer_id", referencedColumnName = "customer_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name="employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    @ManyToOne()
    @JoinColumn(name="service_id", referencedColumnName = "service_id")
    private ServiceFurama serviceFurama;

    @ManyToMany(mappedBy = "contractSet")
    private Set<AttachService> attachServiceSet;
}
