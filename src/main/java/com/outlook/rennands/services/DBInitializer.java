package com.outlook.rennands.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.outlook.rennands.entities.RoadSection;

import jakarta.annotation.PostConstruct;

@Service
public class DBInitializer {

	RoadSectionService roadSectionService;

	@PostConstruct
	public void initDB() {
		RoadSection roadSection = new RoadSection();
		roadSection.setSectionStart(0);
		roadSection.setSectionEnd(20);
		roadSection.setSectionDistance(20);
		roadSection.setNewBuildingArea(20 * 4.5);
		roadSection.setBroadeningArea(0);
		roadSection.setReinforcementArea(0);
		roadSection.setTotalArea(20 * 4.5);
		roadSectionService.save(roadSection);

		roadSection = new RoadSection();
		roadSection.setSectionStart(20);
		roadSection.setSectionEnd(40);
		roadSection.setSectionDistance(20);
		roadSection.setNewBuildingArea(20 * 4.5);
		roadSection.setBroadeningArea(0);
		roadSection.setReinforcementArea(0);
		roadSection.setTotalArea(20 * 4.5);
		roadSectionService.save(roadSection);

		roadSection = new RoadSection();
		roadSection.setSectionStart(40);
		roadSection.setSectionEnd(60);
		roadSection.setSectionDistance(20);
		roadSection.setNewBuildingArea(20 * 4.5);
		roadSection.setBroadeningArea(0);
		roadSection.setReinforcementArea(0);
		roadSection.setTotalArea(20 * 4.5);
		roadSectionService.save(roadSection);

		roadSection = new RoadSection();
		roadSection.setSectionStart(60);
		roadSection.setSectionEnd(80);
		roadSection.setSectionDistance(20);
		roadSection.setNewBuildingArea(20 * 4.5);
		roadSection.setBroadeningArea(0);
		roadSection.setReinforcementArea(0);
		roadSection.setTotalArea(20 * 4.5);
		roadSectionService.save(roadSection);

		roadSection = new RoadSection();
		roadSection.setSectionStart(80);
		roadSection.setSectionEnd(100);
		roadSection.setSectionDistance(20);
		roadSection.setNewBuildingArea(20 * 4.5);
		roadSection.setBroadeningArea(0);
		roadSection.setReinforcementArea(0);
		roadSection.setTotalArea(20 * 4.5);
		roadSectionService.save(roadSection);

	}

	@Autowired
	public void setRoadSectionService(RoadSectionService roadSectionService) {
		this.roadSectionService = roadSectionService;
	}

}
