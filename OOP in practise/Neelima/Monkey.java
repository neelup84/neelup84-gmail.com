package graziosoTest;

public class Monkey {
	enum Species{
		CAPUCHIN,GUENON,MACAQUE,MARMOSET,SQUIRRELMONKEY,TAMARIN;
	}
	private float taillength,height,bodyLength,torsoLength,skullLength,neckLength;
	Species species;
	
	public float getTaillenght() {
		return taillength;
	}
	
	public void setTaillenght(float tailength) {
		this.taillength = taillength;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLenght(float bodyLenght) {
		this.bodyLength = bodyLength;
	}
	
	public float getTorsoLength() {
		return torsoLength;
	}
	
	public void setTorsoLength() {
		this.torsoLength = torsoLength;
		
	}
	
	publci flaot getSkullLength() {
		return skullLenght;
	}
	
	public void setSkullLength(float skullLength) {
		this.skullLength = skullLength;
	}
	public float getNeckLength() {
		return neckLength;
	}
	public void setNeckLength(float neckLength) {
		this.neckLength = neckLength;
	}
	
    public Species getSpecies() {
    	return species;
    }
    
    public void setSpecies() {
    	
    	this.species = species;
    }
    	
	

}
