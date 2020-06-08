package com.msau.msaumanagement.models;

public class Mcq {
	    private int id;
	    private String mcqname;
	    private String candidatename;
	    private String trainer;
	    private int marks;
	    private String location;
	    private String course;
	    private int year;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMcqname() {
			return mcqname;
		}
		public void setMcqname(String mcqname) {
			this.mcqname = mcqname;
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
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
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
