package com.outlook.rennands.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "road_section")
public class RoadSection {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "SECTION_START")
	private double sectionStart;

	@Column(name = "SECTION_END")
	private double sectionEnd;

	@Column(name = "SECTION_DISTANCE")
	private double sectionDistance;

	@Column(name = "NEW_BUILDING_AREA")
	private double newBuildingArea;

	@Column(name = "BROADENING_AREA")
	private double broadeningArea;

	@Column(name = "REINFORCMENT_AREA")
	private double reinforcementArea;

	@Column(name = "TOTAL_AREA")
	private double totalArea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getSectionStart() {
		return sectionStart;
	}

	public void setSectionStart(double sectionStart) {
		this.sectionStart = sectionStart;
	}

	public double getSectionEnd() {
		return sectionEnd;
	}

	public void setSectionEnd(double sectionEnd) {
		this.sectionEnd = sectionEnd;
	}

	public double getSectionDistance() {
		return sectionDistance;
	}

	public void setSectionDistance(double sectionDistance) {
		this.sectionDistance = sectionDistance;
	}

	public double getNewBuildingArea() {
		return newBuildingArea;
	}

	public void setNewBuildingArea(double newBuildingArea) {
		this.newBuildingArea = newBuildingArea;
	}

	public double getBroadeningArea() {
		return broadeningArea;
	}

	public void setBroadeningArea(double broadeningArea) {
		this.broadeningArea = broadeningArea;
	}

	public double getReinforcementArea() {
		return reinforcementArea;
	}

	public void setReinforcementArea(double reinforcementArea) {
		this.reinforcementArea = reinforcementArea;
	}

	public double getTotalArea() {
		return totalArea;
	}

	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}

	
}
