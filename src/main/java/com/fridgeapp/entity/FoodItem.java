package com.fridgeapp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "food_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@EntityListeners(AuditingEntityListener.class)
public class FoodItem extends BaseModel{

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

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

//    @CreatedDate
//    @Column(name = "storage_date", nullable = false, updatable = false)
//    private LocalDate storageDate;

//    @LastModifiedDate
//    @Column(name = "updated_date", nullable = false)
//    private LocalDate updatedDate;

    @Column(name = "expiry_date", nullable = false)
    private LocalDate expiryDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by", referencedColumnName = "id", nullable = false, updatable = false)
    private User createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modified_by", referencedColumnName = "id")
    private User modifiedBy;

    @Column(length = 100)
    private String location; // e.g., Crisper Drawer, Door

    @Column(name = "image_url", length = 1000)
    private String imageUrl;

    @PrePersist
    public void prePersistFoodItem() {
        if (this.modifiedBy == null) {
            this.modifiedBy = this.createdBy;
        }
    }
}