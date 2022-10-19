package com.Restaurant.Restaurant.controller;

import com.Restaurant.Restaurant.entity.FoodLine;
import com.Restaurant.Restaurant.service.FoodLineServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FoodLines")
public class FoodLineController {

    @Autowired
    private FoodLineServiceInterface foodLineService;

    @GetMapping()
    public ResponseEntity<List<FoodLine>> getAllFoodLines(){
        List<FoodLine> foodLines = null;
        try {
            foodLines = foodLineService.getAllFoodLines();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<FoodLine>>(foodLines, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodLine> getFoodLineById(@PathVariable("id") int userId){
        FoodLine foodLines = null;
        try {
            foodLines = foodLineService.getFoodLineById(userId);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<FoodLine>(foodLines,HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<FoodLine> addOrUpdateFoodLine(@RequestBody FoodLine foodLine){
        FoodLine foodLines = null;
        try {
            foodLines = foodLineService.addOrUpdateFoodLine(foodLine);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<FoodLine>(foodLines,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FoodLine> deleteFoodLine(@PathVariable("id") int id_foodLines){
        FoodLine foodLines = null;
        try {
            foodLines = foodLineService.deleteFoodLine(id_foodLines);
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<FoodLine>(foodLines,HttpStatus.OK);
    }
}
