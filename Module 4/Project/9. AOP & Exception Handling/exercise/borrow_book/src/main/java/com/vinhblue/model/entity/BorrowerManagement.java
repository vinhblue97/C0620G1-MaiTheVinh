package com.vinhblue.model.entity;

import com.vinhblue.model.entity.BookManagement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name="borrower_management")
@Getter @Setter @NoArgsConstructor
public class BorrowerManagement {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer borrowId;
    @Column(name="name")
    private String borrowerName;

    @OneToMany(mappedBy = "borrowerManagement", cascade = CascadeType.ALL)
    private List<BookManagement> bookManagementList;
}
