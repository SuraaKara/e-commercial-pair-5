package com.etiya.ecommercedemopair5.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Table(name="street")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "street_name")
    private String streetName;

    @OneToMany(mappedBy = "street")
    private List<Adress> adress;

}
