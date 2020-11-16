package com.vinhblue.model.entity.service_furama;

import com.sun.javafx.beans.IDProperty;
import com.vinhblue.model.entity.contract.Contract;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import java.util.List;

@Entity(name="service")
@Getter @Setter @NoArgsConstructor
public class ServiceFurama {
    @Id
    @Column(name="service_id")
    @Pattern(regexp = "^DV-\\d{4}$", message = "id must be DV-XXXX with X is 0-9")
    private String serviceId;

    @Column(name="service_name")
    private String serviceName;

    @Positive(message = "Area must be positive")
    @Column(name="service_area")
    private Double serviceArea;

    @Positive(message = "Cost must be positive")
    @Column(name="service_cost")
    private Double serviceCost;

    @Positive(message = "Max people must be positive")
    @Column(name="service_max_people")
    private String serviceMaxPeople;

    @Column(name="service_standard")
    private String serviceStandard;

    @Column(name="service_description")
    private String serviceDescription;

    @Positive(message = "Pool area must be positive")
    @Column(name="service_pool_area")
    private Double servicePoolArea;

    @Positive(message = "Floor must be positive")
    @Column(name="service_floor")
    private Integer serviceNumFloor;

    @ManyToOne
    @JoinColumn(name="type_id", referencedColumnName = "id")
    private ServiceType serviceType;

    @OneToOne()
    @JoinColumn(name="type_rent_id", referencedColumnName = "id")
    private ServiceRentType serviceRentType;

    @OneToMany(mappedBy = "serviceFurama")
    private List<Contract> contract;

}
