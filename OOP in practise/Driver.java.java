import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        // Class variables
    	String name;
        String type;
        String gender;
        int age;
        float weight;
        String acquisitionDate;
        String acquisitionSource;
        String reserved;
        String trainingLocation;
        String trainingStart;
        String trainingEnd;
        String trainingStatus;

    	Scanner scan = new Scanner(System.in);

        // Create New Dog

    	Dog Fred = new Dog();
    	Fred.setBreed("French Bulldog");

        // Create New Monkey

    	Monkey Jeff = new Monkey();
    	Jeff.setBreed("Capuchin");
	
    	// Method to add animals
    	
    	//System Prompt for Info
    	System.out.println("Add Animal");
    	
    	System.out.println("What is the name of the animal?");
    	name = scan.next();
    	
    	System.out.println("What is the type?");
    	type = scan.next();
    	
    	System.out.println("What is the gender?");
    	gender = scan.next();
    	
    	System.out.println("What is the age?");
    	age = scan.nextInt();
    	
    	System.out.println("What is the weight?");
    	weight = scan.nextFloat();
    	
    	System.out.println("What is the date of acquisition?");
    	acquisitionDate = scan.next();
    	
    	System.out.println("Where is the source of acquisition?");
    	acquisitionSource = scan.next();
    	
    	System.out.println("Is this animal reserved?");
    	reserved = scan.next();
    	
    	System.out.println("What is the training location?");
    	trainingLocation = scan.next();
    	
    	System.out.println("When does the training start?");
    	trainingStart = scan.next();
    	
    	System.out.println("When will the training end?");
    	trainingEnd = scan.next();
    	
    	System.out.println("What is the training status?");
    	trainingStatus = scan.next();
    	
    	//Create animal object with attributes
    	
    	RescueAnimal animal1 = new RescueAnimal(name, type, gender, age, weight);
    	
    	//Print created info for user to see
    	animal1.printInfo();
    }
}





---------
parsing strings





Scanner scnr = new Scanner(System.in);
    String lineString = "";
    int commaLocation = 0;
    String firstWord = "";
    String secondWord = "";
    boolean inputDone = false;

    while (!inputDone) {
        System.out.println("Enter input string: ");
        lineString = scnr.nextLine();


        if (lineString.equals("q")) {
            inputDone = true;
        }

        else {
        commaLocation = lineString.indexOf(',');
        firstWord = lineString.substring(0, commaLocation);
        secondWord = lineString.substring(commaLocation + 1, lineString.length());

        System.out.println("First word: " + firstWord);
        System.out.println("Second word:" + secondWord);
        System.out.println();
        System.out.println();
        }
    }  


    return;
    }
}



