package com.vinhblue.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity(name="customer")
@Getter @Setter @NoArgsConstructor
public class Customer implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer customerId;
    @Column(name="name")
    @NotBlank(message = "Please enter name")
    private String customerName;
    @Email(message = "Please enter the email")
    @Column(name="email")
    private String customerEmail;
    @Column(name="birth_day")
    private String customerBirthDay;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="type_id", referencedColumnName = "id")
    private TypeCustomer typeCustomer;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        if (customer.customerName.equals("")){
            errors.rejectValue("customerName", "name.empty");
        }
    }
}
