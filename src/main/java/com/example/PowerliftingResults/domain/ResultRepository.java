package com.example.PowerliftingResults.domain;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ResultRepository extends CrudRepository <Result, Long> {
	
	List<Result> findBylift(String lift);
	List<Result> findByUser(User user);
	
	}

	


