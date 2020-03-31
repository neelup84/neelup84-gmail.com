package graziosoTest;

import java.text.SimpleDateFormat;


public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat status;
    private String AcquisitionSource;
    private Boolean reserved;

    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;

    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }

    // Add Accessor Methods here
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    	
    
    public String getType() {
    	return type;
    }
    
    public void setType(String type) {
    	this.type = type; 
    }

    public String getGender() {
    	return gender;
    	
    }
    
    public void setGender(String gender) {
    	this.gender = gender;
    }
    
    public int getAge() {
    	return age;
    }
    
   
    
    public void setAge(int age) {
    	this.age = age;
    
    }
    
    public float getWeight() {
    	return weight;
    	
    }
    
    public void setWeight(float weight) {
    	
    	this.weight = weight;
    	
    }
    public SimpleDateFormat getAcquisitionDate() {
    	return acquisitionDate;
    	
    	
    }
    
    public void setAcquisitionDate(SimpleDateFormat acquisitionDate) {
    	this.acquisitionDate = acquisitionDate;
    }
    
    public Boolean getReserved() {
    	return reserved;
    }
    
    public void setReserved(Boolean reserved) {
    	this.reserved = reserved;
    }
    
    public String getTrainingLocation() {
    	return trainingLocation;
    }
    
    public void setTrainingLocation(String trainingLocation) {
    	this.trainingLocation = trainingLocation;
    }
    public SimpleDateFormat getTrainingStart() {
    	return trainingStart;
    }
    
    public void setTrainingStart(SimpleDateFormat trainingStart) {
    	this.trainingStart = trainingStart;
    }
    public SimpleDateFormat getTrainingEnd() {
    	return trainingEnd;
    }
    
    public void setTrainingEnd(SimpleDateFormat trainingEnd) {
    	this.trainingEnd = trainingEnd;
    }
    
    public String getTrainingStatus() {
    	return trainingStatus;
    }
    
    public void setTrainingStatus(String trainingStatus) {
    	this.trainingStatus = trainingStatus;
    }
    
    public String getInServiceCountry() {
    	return inServiceCountry;
    }
    public void setInServiceCountry(String inServiceCountry) {
    	this.inServiceCountry = inServiceCountry;
    }

	public static void printInfo() {
		// TODO Auto-generated method stub
		
	}
    
    }
    



