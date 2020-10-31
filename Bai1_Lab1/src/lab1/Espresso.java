package lab1;

public class Espresso extends Beverage {
	private double costExpresso = 1.989;

	public Espresso(boolean milk, boolean soy, boolean mocha, boolean whip) {
		super(milk, soy, mocha, whip);
		description = "Espresso Coffee";
	}

	@Override
	public double cost() {
		double cost = costExpresso;
		cost += hasMilk() ? MILK : 0;
		cost += hasSoy() ? SOY : 0;
		cost += hasMocha() ? MOCHA : 0;
		cost += hasWhip() ? WHIP : 0;
		return cost;
	}

}
