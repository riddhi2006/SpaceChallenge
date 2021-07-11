package spaceChallenge;

public interface SpaceShip {
	
	boolean launch();
	boolean land();
	boolean cancarry(Item item);
	void carry(Item item);

}
