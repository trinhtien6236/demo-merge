package lab1;

public class HouseBlend extends Beverage {
	private double costHouseBlend = 0.89;

	public HouseBlend(boolean milk, boolean soy, boolean mocha, boolean whip) {
		super(milk, soy, mocha, whip);
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		double cost = costHouseBlend;
		cost += hasMilk() ? MILK : 0;
		cost += hasSoy() ? SOY : 0;
		cost += hasMocha() ? MOCHA : 0;
		cost += hasWhip() ? WHIP : 0;
		return cost;
	}

}
