package com.etiya.ecommercedemopair5.entities.concrete;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name="payment_type")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PaymentType {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="credit_card")
    private String creditCard;

    @Column(name="gift_card")
    private String giftCard;

    @Column(name="cash")
    private String cash;
}
