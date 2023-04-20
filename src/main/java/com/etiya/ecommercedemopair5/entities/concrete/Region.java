package com.etiya.ecommercedemopair5.entities.concrete;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Table(name="region")
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "region_name")
    private String regionName;

    @OneToMany(mappedBy = "region")
    private List<Adress> adress;

}
