package lab1;

public abstract class Beverage {
	protected String description;
	protected boolean milk;
	protected boolean soy;
	protected boolean mocha;
	protected boolean whip;
	
	public static final double MILK=0.10;
	public static final double SOY=0.15;
	public static final double MOCHA=0.20;
	public static final double WHIP=0.10;
	
	public Beverage(boolean milk,boolean soy,boolean mocha,boolean whip) {
		this.milk=milk;
		this.soy=soy;
		this.mocha=mocha;
		this.whip=whip;
	}
	public String getDescription() {
		return description;
	}
	public abstract double cost();
	public boolean hasMilk() {
		return milk;
	}
	public void setMilk() {
		this.milk=milk;
	}
	public boolean hasSoy() {
		return this.soy;
	}
	public void setSoy() {
		this.soy=soy;
	}
	/**
	 * @return the mocha
	 */
	public boolean hasMocha() {
		return mocha;
	}
	/**
	 * @param mocha the mocha to set
	 */
	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}
	/**
	 * @return the whip
	 */
	public boolean hasWhip() {
		return whip;
	}
	/**
	 * @param whip the whip to set
	 */
	public void setWhip(boolean whip) {
		this.whip = whip;
	}
	
	

}
