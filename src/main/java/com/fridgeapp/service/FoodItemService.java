package com.fridgeapp.service;

import com.fridgeapp.entity.FoodItem;
import com.fridgeapp.repository.FoodItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FoodItemService {

    private final FoodItemRepository foodItemRepository;

    public FoodItemService(FoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;
    }

    public FoodItem save(FoodItem foodItem) {
        return foodItemRepository.save(foodItem);
    }

    public Optional<FoodItem> findById(Long id) {
        return foodItemRepository.findById(id);
    }

    public List<FoodItem> findAllByCreatedBy(Long createdBy) {
        return foodItemRepository.findByCreatedBy(createdBy);
    }

    public List<FoodItem> findAll() {
        return foodItemRepository.findAll();
    }

    public void deleteById(Long id) {
        foodItemRepository.deleteById(id);
    }
}