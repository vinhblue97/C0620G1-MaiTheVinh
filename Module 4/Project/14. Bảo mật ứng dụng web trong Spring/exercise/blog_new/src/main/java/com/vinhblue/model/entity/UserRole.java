package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "user_role", uniqueConstraints = {
        @UniqueConstraint(name = "user_role_uk", columnNames = {"user_id", "role_id"})})
@Getter @Setter @NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private AppUser appUser;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", nullable = false)
    private AppRole appRole;
}
