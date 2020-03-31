package graziosoTest;
public class Dog extends RescueAnimal {

    // instance variables
    public String type;
    public String Breed;
    public String name;
    public String topTrick;
    
    

    // constructor
   public Dog(String Type, String Breed, String Name) {
	   
	   
    this.type = "cattel herding";
    this.Breed= "Husky";
    this.name = "java";
    
    }
   
    
   
    // methods

    public void setTopTrick(String trick) {
    	topTrick = trick;
    	
    }
    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + Breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }



	public void setBreed(Object string) {
		// TODO Auto-generated method stub
		
	}

}
