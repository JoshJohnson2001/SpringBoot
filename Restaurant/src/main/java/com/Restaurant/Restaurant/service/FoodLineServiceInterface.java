package com.Restaurant.Restaurant.service;

import com.Restaurant.Restaurant.entity.FoodLine;

import java.util.List;

public interface FoodLineServiceInterface {
    public List<FoodLine> getAllFoodLines();
    public FoodLine getFoodLineById(int id_foodLines);
    public FoodLine addOrUpdateFoodLine(FoodLine foodLine);
    public FoodLine deleteFoodLine(int id_foodLines) throws Exception;
}
