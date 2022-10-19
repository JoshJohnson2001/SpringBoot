package com.Restaurant.Restaurant.service.services;

import com.Restaurant.Restaurant.entity.FoodLine;
import com.Restaurant.Restaurant.repository.FoodLineRepository;
import com.Restaurant.Restaurant.service.FoodLineServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodLineService implements FoodLineServiceInterface {
    @Autowired
    private FoodLineRepository foodLineRepository;

    @Override
    public List<FoodLine> getAllFoodLines() {
        return (List<FoodLine>) foodLineRepository.findAll();
    }

    @Override
    public FoodLine getFoodLineById(int id_foodLines) {
        return foodLineRepository.findById(id_foodLines).orElse(null);
    }

    @Override
    public FoodLine addOrUpdateFoodLine(FoodLine foodLine) {
        return foodLineRepository.save(foodLine);
    }

    @Override
    public FoodLine deleteFoodLine(int id_foodLines) throws Exception {
        FoodLine deletedFoodLine = null;
        try {
            deletedFoodLine = foodLineRepository.findById(id_foodLines).orElse(null);
            if(deletedFoodLine == null) {
                throw new Exception("Food line not available");
            }else {
                foodLineRepository.deleteById(id_foodLines);
            }
        }catch(Exception ex) {
            throw ex;
        }
        return deletedFoodLine;
    }
}
