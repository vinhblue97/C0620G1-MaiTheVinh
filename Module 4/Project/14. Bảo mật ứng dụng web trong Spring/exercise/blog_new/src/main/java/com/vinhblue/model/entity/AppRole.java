package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "app_role", uniqueConstraints = {
        @UniqueConstraint(name = "app_role_uk", columnNames = "role_name")})
public class AppRole {
    @Id
    @GeneratedValue
    @Column(name = "role_id", nullable = false)
    private long roleId;

    @Column(name = "role_name", nullable = false)
    private String roleName;
}
