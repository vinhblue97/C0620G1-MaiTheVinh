package com.vinhblue.model.entity.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "App_User",
        uniqueConstraints = {
                @UniqueConstraint(name = "APP_USER_UK", columnNames = "User_Name")})
public class AppUser {
    @Id
    @GeneratedValue
    @Column(name = "User_Id", nullable = false)
    private Long userId;

    @Column(name = "User_Name", nullable = false)
    private String userName;

    @Column(name = "Encryted_Password", nullable = false)
    private String encrytedPassword;

    @Column(name = "Enabled", length = 1, nullable = false)
    private boolean enabled;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Role_Id", referencedColumnName = "Role_Id")
    private AppRole appRole;

}
