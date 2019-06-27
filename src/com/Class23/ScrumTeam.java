package com.Class23;

public class ScrumTeam extends Employee{
	//employee'ye bagli class
	public String artifacts;
	public String ceremonies;
	
	public void workOnArtifacts() {
		System.out.println("scrum team work on " +artifacts);
	}
	public void attendScrumMeetings() {
		System.out.println("scrum team attends " +ceremonies);
	}
	
}
