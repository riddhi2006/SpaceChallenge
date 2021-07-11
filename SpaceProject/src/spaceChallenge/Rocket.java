package spaceChallenge;

public class Rocket implements SpaceShip {
	
	 private int currentWeight;
	 private int weight;
	 private int maxCargo;
	 private double totalWeight = currentWeight + weight;
	 private int cost;
	@Override
	public boolean launch() {
		return true;
	}
	@Override
	public boolean land() {
		return true;
	}
	@Override
	public boolean cancarry(Item item) {
		if (maxCargo >= (currentWeight + item.getWeight())) {

            return true;
        } else {
            System.out.println("Can't carry item: " + item.getName() + "\tWeight: " + item.getWeight());
            return false;
        }
	}
	@Override
	public void carry(Item item) {
		 System.out.println("Carrying item: " + item.getName() + "\tWeight: " + item.getWeight());
	     currentWeight += item.getWeight();
	}
	public int getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getMaxCargo() {
		return maxCargo;
	}
	public void setMaxCargo(int maxCargo) {
		this.maxCargo = maxCargo;
	}
	public double getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
	
