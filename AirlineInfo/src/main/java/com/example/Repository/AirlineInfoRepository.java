package com.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Pojo.AirlineInfo;

@Repository
public interface AirlineInfoRepository  extends CrudRepository<AirlineInfo, Long>{

	Iterable<AirlineInfo> findAll();
}
