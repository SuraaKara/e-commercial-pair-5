package com.etiya.ecommercedemopair5.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name="payment")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Payment {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="discount_id")
    private Discount discount;

    @ManyToOne
    @JoinColumn(name="payment_type_id")
    private PaymentType paymentType;

    @OneToMany(mappedBy = "orders")
    private List<Order> orders;
}
