package com.etiya.ecommercedemopair5.entities.concrete;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Table(name="discount")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Discount {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="discount_type")
    private String discountType;

    @Column(name="expiration_date")
    private Date expirationDate;

    @Column(name="discount_amount")
    private Double discountAmount;
}
