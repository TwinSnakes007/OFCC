package org.gradle;

public class LowerFee implements IFee {
	
	private double belowAmount = 0, rate = 0;
	
	public LowerFee(double pRate, double pBelowAmount)
	{ 
		this.belowAmount = pBelowAmount;
		this.rate = pRate;
	}

	public double assessFee(double invoice) {
		if (invoice == 0) return 0;
		return rate * (invoice > belowAmount ? belowAmount : invoice);
	}

}
