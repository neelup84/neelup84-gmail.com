public class Cruise {

    // class Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }

    // print cruise details
    public void printCruiseDetails() {
    	
    	System.out.println("CruiseName: "+ cruiseName );
    	System.out.println("CruiseShipName: "+cruiseShipName);
    	System.out.println("DeparturPort: " +departurePort);
    	System.out.println("Destination: " + destination);
    	System.out.println("ReturnPort: " + returnPort);
    	
    	
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }

	public static void main(String[] args) {
		
		Cruise c = new Cruise("Cruise X", "Cruise ship","Port1","Port2","Port3");
		
		
		System.out.println("Cruise(\"Cruise X\",\"Cruise ship\",\"Port1\",\"Port2\",\"Port3\")");
				
		c.printCruiseDetails();
				
		
	}

	
}


