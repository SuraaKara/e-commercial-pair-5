package com.etiya.ecommercedemopair5.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name="adress")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "adress_description")
    private String adressDescription;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

    @ManyToOne
    @JoinColumn(name="street_id")
    private Street street;

    @ManyToOne
    @JoinColumn(name="region_id")
    private Region region;

    @ManyToOne
    @JoinColumn(name="postal_code_id")
    private PostalCode postalCode;

    @OneToMany(mappedBy = "customers")
    private List<Customer> customers;

    @OneToMany(mappedBy = "products_order")
    private List<ProductOrder> productOrders ;



}
