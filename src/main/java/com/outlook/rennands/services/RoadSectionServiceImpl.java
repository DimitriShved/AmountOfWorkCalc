package com.outlook.rennands.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.outlook.rennands.entities.RoadSection;
import com.outlook.rennands.repos.RoadSectionRepository;

@Transactional
@Service("roadSectionService")
public class RoadSectionServiceImpl implements RoadSectionService {

	private RoadSectionRepository roadSectionRepository;

	@Override
	@Transactional(readOnly = true)
	public List<RoadSection> findAll() {
		return roadSectionRepository.findAll();
	}

	@Override
	public RoadSection save(RoadSection roadSection) {
		return roadSectionRepository.save(roadSection);
	}

	@Autowired
	public void setRoadSectionRepository(RoadSectionRepository roadSectionRepository) {
		this.roadSectionRepository = roadSectionRepository;
	}

}
