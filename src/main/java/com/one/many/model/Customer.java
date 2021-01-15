package com.one.many.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String gender;

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL,fetch= FetchType.EAGER)
   @JoinColumn(name="cp_fk",referencedColumnName = "id")
    private List<Product> products;
}














