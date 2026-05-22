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

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(length = 500)
    private String description;

    @Column(nullable = false)
    private String category; // e.g., Dairy, Vegetable, Fruit

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal quantity;

    @Column(length = 50)
    private String unit; // e.g., kg, pieces, ml

    @CreationTimestamp
    @Column(name = "storage_date", nullable = false, updatable = false)
    private LocalDate storageDate;

    @Column(name = "expiry_date", nullable = false)
    private LocalDate expiryDate;

    @Column(name = "created_by", columnDefinition = "bigint references users(id)", nullable = false, updatable = false)
    private Long createdBy;

    @Column(name = "modified_by", columnDefinition = "bigint references users(id)")
    private Long modifiedBy;

    @Column(length = 100)
    private String location; // e.g., Crisper Drawer, Door

    @Column(name = "image_url", length = 1000)
    private String imageUrl;

}