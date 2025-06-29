package com.shop.vegetables.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Entity representing a vegetable in the shop.
 * Maps to the `vegetables.vegetable` table in the database.
 * This class contains details about each vegetable available for sale, including its name, price per kilogram, and stock quantity.
 * Fields:
 * <ul>
 *   <li>vegetableId: Unique identifier for the vegetable (auto-generated).</li>
 *   <li>name: Name of the vegetable.</li>
 *   <li>pricePerKg: Price per kilogram as a {@link java.math.BigDecimal}.</li>
 *   <li>stockKg: Available stock in kilograms.</li>
 * </ul>
 *
 * Annotations:
 * <ul>
 *   <li>{@code @Entity}: Specifies that the class is an entity and is mapped to a database table.</li>
 *   <li>{@code @Data}, {@code @AllArgsConstructor}, {@code @NoArgsConstructor}, {@code @Builder}: Lombok annotations for boilerplate code generation.</li>
 * </ul>
 */

import java.math.BigDecimal;

@Entity(name = "vegetables.vegetable")
@Table(name = "vegetables.vegetable")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vegetable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vegetableId;

    private String name;

    private BigDecimal pricePerKg;

    private Double stockKg;
}
