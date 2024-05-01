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
@Table(name = "users")
@NoArgsConstructor(access = AccessLevel. PRIVATE)
@Schema(name = "User", description = "User model schema")
@AllArgsConstructor
@Getter
@Setter
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Schema(example = "1234")
    private Long id;

    @Column
    @Schema(example = "Victor")
    private String firstName;

    @Column
    @Schema(example = "Amaya")
    private String lastName;

    @Column
    @Schema(example = "victor.amaya@demo.com")
    private String email;
}
