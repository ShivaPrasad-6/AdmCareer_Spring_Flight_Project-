package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Pojo.BookingRecord;

@Repository
public interface BookingRecordRepository extends CrudRepository<BookingRecord, Long>{
	
	Iterable<BookingRecord> findAll();

}
