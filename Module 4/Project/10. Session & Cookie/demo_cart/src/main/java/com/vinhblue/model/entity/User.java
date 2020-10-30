package com.vinhblue.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity(name = "user")
@Getter @Setter @NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer userId;
    @Column(name = "user_name")
//    @NotBlank
    private String userName;
    @Column(name = "password")
//    @NotBlank
    private String userPassword;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="item_user", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="item_id"))
    private Set<Item> likedItem;
}
