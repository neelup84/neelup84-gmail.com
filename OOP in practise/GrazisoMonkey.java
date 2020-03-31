package graziosoTest;

public class Monkey extends RescueAnimal{
	
	
	//variables
	String breed;
	double tailLength;
	double height;
	double bodyLength;
	double torso;
	double Skull;
	double neck;
	String Species;
	
	//Constructor
	public Monkey() {
		
	}
	
	// getter and setter
		
	public String getBreed() {
		return breed;
	}
	
	
	public void setBreed(String breed) {
		breed = this.breed;
		
	}
	
	public double getTailLenth() {
		return tailLength;
			
	}
	
	public void setTailLength(double tailLength) {
		tailLength = this.tailLength;
		
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public double getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLenght(float bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public double getTorso() {
		return torso;
	}
	
	public void setTorso(double torso) {
		this.torso = torso;
		
	}
	
	public double getSkullLength() {
		return Skull;
	}
	
	public void setSkullLength(double Skull) {
		this.Skull = Skull;
	}
	public double getNeck() {
		return neck;
	}
	public void setNeck(double neck) {
		this.neck = neck;
	}
	
    public  String getSpecies() {
    	return Species;
    }
    
    public void setSpecies(String Species) {
    	
    	this.Species = Species;
    }
    	
	

}
