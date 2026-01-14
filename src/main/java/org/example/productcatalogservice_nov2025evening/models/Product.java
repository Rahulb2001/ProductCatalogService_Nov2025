package org.example.productcatalogservice_nov2025evening.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="products")
public class Product extends BaseModel {
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    private Category category;

    //Business specific fields
    private Boolean isPrime;
    private Long commission;
}
