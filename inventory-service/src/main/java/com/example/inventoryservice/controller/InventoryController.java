package com.example.inventoryservice.controller;


import com.example.inventoryservice.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@Slf4j
public class InventoryController {
    private InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping()
    public boolean isInStock(@RequestBody String skuCode){
        return inventoryService.isInStock(skuCode);
    }

}
