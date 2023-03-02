package com.outlook.rennands.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.outlook.rennands.entities.RoadSection;
import com.outlook.rennands.services.RoadSectionService;

import jakarta.annotation.PostConstruct;

@RequestMapping("/roadSections")
@Controller
public class RoadSectionController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RoadSectionController.class);

	private RoadSectionService roadSectionService;

	private MessageSource messageSource;

	@PostConstruct
	public void status() {
		LOGGER.info("road section controller created");
	}

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model uiModel) {
		LOGGER.info("enter controller list");
		List<RoadSection> roadSections = roadSectionService.findAll();
		uiModel.addAttribute("roadSections", roadSections);
		return "roadSections/list";
	}

	@Autowired
	public void setRoadSectionService(RoadSectionService roadSectionService) {
		this.roadSectionService = roadSectionService;
	}

	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
