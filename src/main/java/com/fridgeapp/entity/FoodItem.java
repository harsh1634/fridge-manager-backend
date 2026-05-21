package com.fridgeapp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "food_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Maps back to the User table
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String name;

    @Column(length = 500)
    private String description;

    @Column(nullable = false)
    private String category; // e.g., Dairy, Vegetable, Fruit

    @CreationTimestamp
    @Column(name = "storage_date", updatable = false)
    private LocalDate storageDate;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(precision = 10, scale = 2)
    private BigDecimal quantity;

    @Column(length = 50)
    private String unit; // e.g., kg, pieces, ml

    @Column(length = 100)
    private String location; // e.g., Crisper Drawer, Door

    @Column(name = "image_url", length = 1000)
    private String imageUrl;

}