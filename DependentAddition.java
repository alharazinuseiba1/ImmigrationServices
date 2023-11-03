package org.openjfx;

import java.util.ArrayList;

public class DependentAddition{

	public static ArrayList<DependentAddition> database = new ArrayList();
    private DependentAddition dependent;
    private String name;
    private String dateOfBirth;
    private String address;
    private String alienNum;
    private String applicantName; 
    private String applicantAlienNum;
    private String applicantEmail;

  

    private DependentAddition(String name, String dateOfBirth, String address, String alienNum, 
                                String applicantName, String applicantAlienNum, String applicantEmail)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.alienNum = alienNum;
        this.applicantName = applicantName;
        this.applicantAlienNum = applicantAlienNum; 
        this.applicantEmail = applicantEmail;
    }

    private DependentAddition(){}

    public static DependentAddition dependentCreation(String name, String dateOfBirth, String address, String alienNum, 
                                    String applicantName, String applicantAlienNum, String applicantEmail)
    {
    	DependentAddition dep = new DependentAddition(name, dateOfBirth, address, alienNum,applicantName,applicantAlienNum,applicantEmail);                          
    	database.add(dep);
    	return dep;                                
    }

    /*
     * Allows the values to be set later by using the setters
     */
    public static DependentAddition dependentCreation(){
        return new DependentAddition();
    }

    public boolean validateDependent(DependentAddition da){
        return false;
    }

    public Boolean saveToDB(DependentAddition dependent){
        return null;
    }

    public static DependentAddition getDependentFromDB(int alienNumber){
        return null;
    }

    /*
    * Should call validate dependent before updating
    */
    public Boolean updateDependent(DependentAddition dependent){
        return null;
    }

    // Setters

    public void setName(String name){
	    this.name = name;
    }

    public void setDateOfBirth(String birthdate){
	    this.dateOfBirth = birthdate;
    }

    public void setAddress(String address){
	    this.address = address;
    }

    public void setAlienNum(String alienNum){
	    this.alienNum = alienNum;
    }

    public void setApplicantName(String applicantName){
	    this.applicantName = applicantName;
    }

    public void setApplicantAlienNum(String applicantAlienNum){
	    this.applicantAlienNum = applicantAlienNum;
    }

    public void setApplicantEmail(String applicantEmail){}

    // Getters

    public String getName(){
        return this.name;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public String getAddress(){
        return this.address;
    }

    public String getAlienNum(){
        return this.alienNum;
    }

    public String getApplicantName(){
        return this.applicantName;
    }

    public String getApplicantAlienNum(){
        return this.applicantAlienNum;
    }

    public String getApplicantEmail(){
        return this.applicantEmail;
    }

    public DependentAddition getDependent(){
        return null;
    }
    
    public String toString() {
    	return "Name: " + name + " DOB: " + dateOfBirth;
    }
}


