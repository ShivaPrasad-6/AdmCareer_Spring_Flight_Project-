package com.example.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pojo.Inventory;
import com.example.Service.InventoryService;



@RestController
@RequestMapping("/Inventory")
public class InventoryController {
	
		@Autowired
		private InventoryService inventoryservice;
		
		@RequestMapping("/getAllInventories")
		public Iterable<Inventory> getAllInventory() {
			return inventoryservice.allInventories();
		}
		
		
		@PostMapping("/saveFare")
		public Inventory saveFare(@RequestBody Inventory inv) {
			return inventoryservice.saveFare(inv);
		}

		@PutMapping("/updateInventory/{fareId}")
		public Inventory updateInventoryById(@RequestBody Inventory inv, @PathVariable("id") Integer inventoryId) {
			return inventoryservice.updateInventory(inv, inventoryId);

		}

		@DeleteMapping("/deleteInventory/{inventoryId}")
		public int deleteInventory(@PathVariable("inventoryId") Integer inventoryId) {
			return inventoryservice.deleteInventory(inventoryId);
		}

		@GetMapping("/findOneInAll/{inventoryId}")
		public Optional<Inventory> findInventoryInAll(@PathVariable("fareId") Integer inventoryId) {
			return inventoryservice.findFareById(inventoryId);

		}


}
