package com.vinhblue.model.entity.customer;

import com.vinhblue.model.entity.contract.Contract;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "customer")
@Getter
@Setter
@NoArgsConstructor
public class Customer implements Validator {

    @Id
    @Column(name = "customer_id")
    @Pattern(regexp = "^KH-\\d{4}$", message = "id must be KH-XXXX with X is 0-9")
    private String customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_birth_day")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate customerBirthDay;

    @Column(name = "customer_gender")
    private String customerGender;


    @Column(name = "customer_id_card")
    @Pattern(regexp = "^\\d{9}|\\d{12}$", message = "id card must length 9 or 12 numbers")
    private String customerIdCard;

    @Column(name = "customer_phone")
    @Pattern(regexp = "^(090|091|\\(84\\)\\+90|\\(84\\)\\+91)\\d{7}$", message = "phone must 090xxxxxxx or 091xxxxxxx or (84)+90xxxxxxx or (84)+91xxxxxxx")
    private String customerPhone;

    @Column(name = "customer_email")
    @Email(message = "email must like abc@abc.com")
    private String customerEmail;

    @Column(name = "customer_address")
    private String customerAddress;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type_customer_id", referencedColumnName = "type_customer_id")
    private TypeCustomer typeCustomer;

    @OneToMany(mappedBy = "customer")
    private List<Contract> contractList;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
