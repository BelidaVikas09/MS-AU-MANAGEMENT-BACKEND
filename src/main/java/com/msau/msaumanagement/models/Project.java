package com.msau.msaumanagement.models;

public class Project {
    private int id;
    private String projname;
    private String candidatename;
    private String trainer;
    private int buildmarks;
    private int testingmarks;
    private int processmarks;
    private String location;
    private String course;
    private int year;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	public int getBuildmarks() {
		return buildmarks;
	}
	public void setBuildmarks(int buildmarks) {
		this.buildmarks = buildmarks;
	}
	public int getTestingmarks() {
		return testingmarks;
	}
	public void setTestingmarks(int testingmarks) {
		this.testingmarks = testingmarks;
	}
	public int getProcessmarks() {
		return processmarks;
	}
	public void setProcessmarks(int processmarks) {
		this.processmarks = processmarks;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
