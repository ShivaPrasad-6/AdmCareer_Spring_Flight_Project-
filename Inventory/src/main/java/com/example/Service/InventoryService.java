package com.example.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Pojo.Inventory;
import com.example.Repository.InventryRepository;

@Service
public class InventoryService {
	
	@Autowired
	private InventryRepository inventryRepository;
	
	public Iterable<Inventory> allInventories() {
		return inventryRepository.findAll();
	}
	
	public Inventory saveFare(Inventory inventry) {
		return inventryRepository.save(inventry);
	}

	public Inventory updateInventory(Inventory inventry, Integer inventoryId) {
		inventry.setInventoryId(inventoryId);
		return inventryRepository.save(inventry);
	}

	public int deleteInventory(Integer inventoryId) {

		System.out.println("dtl starting");
		Optional<Inventory> inventry = inventryRepository.findById(inventoryId);
		Inventory inv = inventry.get();
		int ID = inv.getInventoryId();
		inventryRepository.delete(inventry.get());
		System.out.println("Deleted flight number is: " + ID);
		return ID;
	}

	public Optional<Inventory> findFareById(Integer inventoryId) {

		Optional<Inventory> fare = inventryRepository.findById(inventoryId);
		return Optional.ofNullable(fare.get());
	}

}
