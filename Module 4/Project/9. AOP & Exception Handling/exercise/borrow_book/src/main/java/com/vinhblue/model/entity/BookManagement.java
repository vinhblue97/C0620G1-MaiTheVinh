package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "book_management")
@Getter @Setter @NoArgsConstructor
public class BookManagement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    @Column(name="name")
    private String bookName;
    @Column(name="quantity")
    private Integer bookQuantity;

    @OneToOne(mappedBy = "bookManagement", cascade = CascadeType.ALL)
    private BorrowerManagement borrowerManagement;

}
