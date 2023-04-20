package com.etiya.ecommercedemopair5.entities.concrete;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Table(name="customers")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String  email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name="adress")
    private Adress adress;

    @ManyToOne
    @JoinColumn(name="comments")
    private Comment comment;

    @ManyToOne
    @JoinColumn(name="individual_customer")
    private IndividualCustomer individualCustomer;

    @ManyToOne
    @JoinColumn(name="commercial_customer")
    private CommercialCustomer commercialCustomer;

    @OneToMany(mappedBy = "products_order")
    private List<ProductOrder> productOrders ;


}
