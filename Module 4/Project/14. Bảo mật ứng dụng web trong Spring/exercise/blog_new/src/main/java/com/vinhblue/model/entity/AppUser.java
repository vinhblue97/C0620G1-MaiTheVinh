package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "app_user",
        uniqueConstraints = {
        @UniqueConstraint(name="app_user_uk", columnNames = "user_name")})
public class AppUser {
        @Id
        @GeneratedValue
        @Column(name="user_id", nullable = false)
        private long UserId;

        @Column(name="user_name", nullable = false)
        private String UserName;

        @Column(name = "Encryted_Password", length = 128, nullable = false)
        private String encrytedPassword;

        @Column(name = "Enabled", length = 1, nullable = false)
        private boolean enabled;
}
