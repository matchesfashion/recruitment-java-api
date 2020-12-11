package com.matchesfashion.papi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Product {

    @GeneratedValue
    @Id
    private Integer id;

    @Column
    private String title;

    @Column
    private String category;

    @Column
    private Integer price;

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
