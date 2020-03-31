
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//List
public class Driver {
	static List<RescueAnimal> list = new ArrayList<>();

    public static void main(String[] args) {
    	

        // Class variables

    	//Created new Dog
    	
    	Dog d = new Dog();
    	
    	// created new Monkey
    	
    	Monkey m = new Monkey();


        // Method to process request for a rescue animal
    	RescueAnimal animal = getARescueAnimal();
    	
        // Method(s) to update information on existing animals
    	updateAnimal(animal);
    	list.add(animal);

        // Method to display matrix of aninmals based on location and status/training phase
    	updateAnimal(animal);



        // Method to add animals



        // Method to out process animals for the farm or in-service placement



        // Method to display in-service animals



        // Process reports from in-service agencies reporting death/retirement
    	
    	printAll();
    	
    	
    }
    public static void printAll() {
    	for (RescueAnimal a:list) {
    		System.out.println(a);
    	}
    	
    }
    
    public static void displayBasedOnLoc() {
    	String temp;
    	System.out.println("Enter the location to search");
    	Scanner sc = new Scanner(System.in);
    	temp = sc.next();
    	for (RescueAnimal a:list) {
    		if (a.getTrainingLocation().equals(temp)) {
    			System.out.println(a);
    		}
    	}
    }
    
    public static void displayBasedOnLoc() {
    	String temp;
    	System.out.println("Enter the status of training to search");
    	Scanner sc = new Scanner(System.in);
    	temp = sc.next();
    	for (RescueAnimal a:list) {
    		if (a.getTrainingStatus().equals(temp)) {
    			System.out.println(a);
    
    		}
    	
   
    	}
   



    }
    
   /* 
    public static void updateAnimal(RescueAnimal r) {
    	Scanner sc = new Scanner(System.in);
    	int choice =0;
    	boolean loop = true;
    	do {
    		
    		System.out.println("Enter 1 for Name Update");
    		System.out.println("Enter 2 for type Update");
    		System.out.println("Enter 3 for updating gender");
    		System.out.println("Enter 4 for age Update");
    		System.out.println("update acquisition Date: Format:6: ");
    		System.out.println("update trainingStart Date:Format: 7: ");
    		System.out.println("update trainingEnd Date:8 ");
    		System.out.println("trainingStatus 9");
    		System.out.println("InServiceCountry 10");
    		System.out.println("InServiceCity 11");
    		System.out.println("InServiceAge 12");
    		System.out.println("InServicePOC 15");
    		System.out.println("Reserved?True:False 14");
    		System.out.println("acq source 15");
    		 r.setAquisitionSource(sc.next());
    		System.out.println("In Service Email 16");
    		System.out.println("17 to exit");
    		choice = sc.nextInt();
    	}
    	
    	switch (choice) {
    	  case1;
    	      System.out.println("Enter name");
    	      r.setName(sc.next());
    	      break;
    	      
    	      
    	   case2;
    	      System.out.println("Enter type");
    	      r.setType(sc.next());
    	      break;
    	      
    	   case3;
    	      System.out.println("Enter gender");
    	      r.setGender(sc.next());
    	      break;
    	      
    	   case4;
    	      System.out.println("Enter age");
    	      r.setAge(sc.next());
    	      break;
    	      
    	   case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      
    	   case6;
    	      System.out.println("Acq date");
    	      r.setAcquisitionDate(LocalDate.parse(sc.next()));
    	      break;
    	      
    	   case7;
    	      System.out.println("Enter Tr st date");
    	      r.setTrainingStrart(LocalDate.parse(sc.next());
    	      break;
    	      
    	   case8;
    	      System.out.println("Enter tr end dt");
    	      r.setTrainingEnd(LocalDarte.parse(sc.next());
    	      break;
    	      
    	   case9;
    	      System.out.println("Enter tr stat");
    	      r.setTrainingStatus(sc.next());
    	      break;
    	      
    	   case10;
    	      System.out.println("Enter country inservice");
    	      r.setInServiceCountry(sc.next());
    	      break;
    	      
    	   case5;
    	      System.out.println("Enter serv city");
    	      r.setInServicecity(sc.next());
    	      break;
    	      
    	      case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      case5;
    	      System.out.println("Enter weight");
    	      r.setWeight(sc.next());
    	      break;
    	      
    	      
    		
    	}
    }
}
*/