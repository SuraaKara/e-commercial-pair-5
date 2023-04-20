package com.etiya.ecommercedemopair5.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Table(name="postal_code")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PostalCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "postal_code_name")
    private String postalCode;

    @OneToMany(mappedBy = "postal_code")
    private List<Adress> adress;

}
