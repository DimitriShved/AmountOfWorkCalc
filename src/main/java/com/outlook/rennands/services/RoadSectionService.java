package com.outlook.rennands.services;

import java.util.List;

import com.outlook.rennands.entities.RoadSection;

public interface RoadSectionService {

	List<RoadSection> findAll();

	RoadSection save(RoadSection roadSection);

	
}
