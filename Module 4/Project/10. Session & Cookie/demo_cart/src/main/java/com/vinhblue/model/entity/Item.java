package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "item")
@Getter
@Setter
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer itemId;
    @Column(name = "name")
    private String itemName;

    @ManyToMany(mappedBy = "likedItem")
    private Set<User> likedUser;
}
