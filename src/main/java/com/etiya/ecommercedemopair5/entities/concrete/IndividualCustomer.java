package com.etiya.ecommercedemopair5.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@Table(name="individual_customer")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class IndividualCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tckn")
    private String tckn;

    @ManyToOne
    @JoinColumn(name="invoice")
    private Invoice invoice;

}
