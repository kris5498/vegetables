package com.shop.vegetables.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity representing a customer's order in the vegetables shop.
 * Maps to the `vegetables.order` table in the database.
 * <p></p>
 * Fields:
 * <ul>
 *   <li>orderId: Unique identifier for the order (auto-generated).</li>
 *   <li>customer: Reference to the {@link Customer} who placed the order.</li>
 *   <li>orderDate: Date and time when the order was placed.</li>
 *   <li>status: Current {@link OrderStatus} of the order.</li>
 *   <li>totalAmount: Total price for the order as a {@link java.math.BigDecimal}.</li>
 *   <li>orderItems: List of {@link OrderItem} entities included in the order.</li>
 * </ul>
 *
 * Annotations:
 * <ul>
 *   <li>{@code @Entity}, {@code @Table}: Specifies that the class is an entity mapped to a database table.</li>
 *   <li>{@code @ManyToOne}, {@code @JoinColumn}: Defines the relationship to the customer entity.</li>
 *   <li>{@code @OneToMany}: Defines the relationship to the order items.</li>
 *   <li>Lombok: {@code @Data}, {@code @AllArgsConstructor}, {@code @NoArgsConstructor}, {@code @Builder} for boilerplate code generation.</li>
 * </ul>
 */

@Entity(name = "vegetables.order")
@Table(name = "vegetables.order")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private LocalDateTime orderDate;

    private OrderStatus status;

    private BigDecimal totalAmount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;
}
