package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Pojo.Inventory;

@Repository
public interface InventryRepository extends CrudRepository<Inventory, Integer> {
	
	Iterable<Inventory> findAll();

}
