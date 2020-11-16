package com.vinhblue.model.entity.service_furama;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="type_rent_service")
@Getter @Setter @NoArgsConstructor
public class ServiceRentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="year")
    private String year;

    @Column(name="month")
    private String month;

    @Column(name="day")
    private String day;

    @Column(name="hour")
    private String hour;

    @OneToOne(mappedBy = "serviceRentType")
    private ServiceFurama serviceFurama;
}
