package com.ecomerce.api.demo.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@NoArgsConstructor(access = AccessLevel. PRIVATE)
@Schema(name = "Product", description = "Product model schema")
@AllArgsConstructor
@Getter
@Setter
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(example = "1234")
    private Long id;

    @Column
    @Schema(example = "Consolador")
    private String name;

    @Column
    @Schema(example = "Producto para el placer")
    private String description;

    @Column
    @Schema(example = "999.99")
    private Double price;
}
