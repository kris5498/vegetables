package com.shop.vegetables.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Entity representing an item within a customer's order in the vegetables shop.
 * Maps to the `vegetables.order_item` table in the database.
 * <p></p>
 * Fields:
 * <ul>
 *   <li>orderItemId: Unique identifier for the order item (auto-generated).</li>
 *   <li>order: Reference to the associated {@link Order} entity.</li>
 *   <li>vegetable: Reference to the {@link Vegetable} entity being ordered.</li>
 *   <li>quantityKg: Quantity of the vegetable ordered, in kilograms.</li>
 *   <li>price: Price for the ordered quantity as a {@link java.math.BigDecimal}.</li>
 * </ul>
 *
 * Annotations:
 * <ul>
 *   <li>{@code @Entity}, {@code @Table}: Specifies that the class is an entity mapped to a database table.</li>
 *   <li>{@code @ManyToOne}, {@code @JoinColumn}: Defines relationships to other entities.</li>
 *   <li>Lombok: {@code @Data}, {@code @AllArgsConstructor}, {@code @NoArgsConstructor}, {@code @Builder} for boilerplate code generation.</li>
 * </ul>
 */

@Entity(name = "vegetables.order_item")
@Table(name = "vegetables.order_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderItemId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "vegetable_id", nullable = false)
    private Vegetable vegetable;

    private Double quantityKg;

    private BigDecimal price;


}
