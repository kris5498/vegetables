package com.shop.vegetables.entity;

/**
 * Enumeration representing the status of an order in the vegetables shop.
 * <p>
 * Possible statuses:
 * <ul>
 *   <li>PLACED: The order has been placed by the customer.</li>
 *   <li>SHIPPED: The order has been shipped to the customer.</li>
 *   <li>DELIVERED: The order has been delivered to the customer.</li>
 *   <li>CANCELLED: The order has been cancelled.</li>
 * </ul>
 */
public enum OrderStatus {
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED
}
