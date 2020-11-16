package com.vinhblue.model.entity.contract;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "attach_service")
@Getter
@Setter
@NoArgsConstructor
public class AttachService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attach_service_id")
    private Integer id;

    @Column(name = "attach_service_name")
    private String name;

    @Column(name = "attach_service_cost")
    private Double cost;

    @Column(name="attach_service_unit")
    private Integer unit;

    @Column(name="attach_service_status")
    private String status;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="contract_detail", joinColumns = @JoinColumn(name="attach_service_id"), inverseJoinColumns = @JoinColumn(name="contract_id"))
    private Set<Contract> contractSet;

}
