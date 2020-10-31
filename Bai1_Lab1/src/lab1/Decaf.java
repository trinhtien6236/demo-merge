package lab1;

public class Decaf extends Beverage {
	private double costDecaf = 1.05;

	public Decaf(boolean milk, boolean soy, boolean mocha, boolean whip) {
		super(milk, soy, mocha, whip);
		description = "Decaf Coffee";
	}

	@Override
	public double cost() {
		double cost = costDecaf;
		cost += hasMilk() ? MILK : 0;
		cost += hasSoy() ? SOY : 0;
		cost += hasMocha() ? MOCHA : 0;
		cost += hasWhip() ? WHIP : 0;
		return cost;
	}

}
