public class Dog {

    // instance variables
    public String type;
    public String breed;
    public String name;
    public String topTrick;
    
    

    // constructor
    public Dog(String dogType, String dogBreed, String dogName)
    {
    this.type = "cattel herding";
    this.breed = "Pembroke Welsh Corgi";
    this.name = "java";
    }
    
   
    // methods

    public void setTopTrick(String trick) {
    	topTrick = trick;
    	
    }
    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
