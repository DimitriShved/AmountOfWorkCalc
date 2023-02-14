package com.outlook.rennands.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.outlook.rennands.entities.RoadSection;
import com.outlook.rennands.repos.RoadSectionRepository;

import jakarta.annotation.PostConstruct;

@Transactional
@Service("roadSectionService")
public class RoadSectionServiceImpl implements RoadSectionService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RoadSectionServiceImpl.class);

	private RoadSectionRepository roadSectionRepository;
	
	@PostConstruct
	public void status() {
		LOGGER.info("road section service implimentation created");
	}

	@Override
	@Transactional(readOnly = true)
	public List<RoadSection> findAll() {
		LOGGER.info("service find all called");
		return roadSectionRepository.findAll();
	}

	@Override
	public RoadSection save(RoadSection roadSection) {
		LOGGER.info("service save called");
		return roadSectionRepository.save(roadSection);
	}

	@Autowired
	public void setRoadSectionRepository(RoadSectionRepository roadSectionRepository) {
		this.roadSectionRepository = roadSectionRepository;
	}

}
