 
public class Door {
	
	String color;
	boolean hasLock;
	int numOfHinges;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Door yellowDoor = new Door();
		yellowDoor.color = "yellow";
		yellowDoor.hasLock = false;
		yellowDoor.numOfHinges=4;
		
		Door whiteDoor = new Door();
		whiteDoor.color = "white";
		whiteDoor.hasLock = true;
		whiteDoor.numOfHinges = 2;
		
		System.out.println("Color: " + yellowDoor.color + ", Hinges: " + yellowDoor.numOfHinges + ", hasLock: "+ yellowDoor.hasLock);

		System.out.println("Color: " + whiteDoor.color + ", Hinges: " + whiteDoor.numOfHinges + ", hasLock: "+ whiteDoor.hasLock);
	}

}
