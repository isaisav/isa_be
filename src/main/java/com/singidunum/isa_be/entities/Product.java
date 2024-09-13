package com.singidunum.isa_be.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_size",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "size_id", referencedColumnName = "id")
    )
    @JsonManagedReference
    private List<Size> sizes;
    private String brand;
    private Integer model_year;
    private Integer price;
    private String image_path;
    @ManyToMany
    @JsonBackReference
    private List<Receipt> receipts;
}
