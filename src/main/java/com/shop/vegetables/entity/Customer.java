package com.shop.vegetables.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entity representing a customer in the vegetables shop.
 * Maps to the `vegetables.customer` table in the database.

 * Fields:
 * - customerId: Unique identifier for the customer (auto-generated).
 * - name: Customer's full name.
 * - email: Customer's email address.
 * - phoneNumber: Customer's contact phone number.
 * - address: Customer's physical address.
 */

@Entity(name = "vegetables.customer")
@Table(name = "vegetables.customer")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;

    private String name;

    private String email;

    private String phoneNumber;

    private String address;
}
