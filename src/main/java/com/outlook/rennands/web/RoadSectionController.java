package com.outlook.rennands.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.outlook.rennands.entities.RoadSection;
import com.outlook.rennands.services.RoadSectionService;

@RequestMapping("/roadSections")
@Controller
public class RoadSectionController {

	RoadSectionService roadSectionService;

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model uiModel) {
		List<RoadSection> roadSections = roadSectionService.findAll();
		uiModel.addAttribute("roadSections", roadSections);
		return "roadSections/list";
	}

	@Autowired
	public void setRoadSectionService(RoadSectionService roadSectionService) {
		this.roadSectionService = roadSectionService;
	}

}
