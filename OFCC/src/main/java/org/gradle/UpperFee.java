package org.gradle;

public class UpperFee implements IFee {
	
	private double upperAmount = 0, rate = 0;
	
	public UpperFee(double pRate, double pUpperAmount)
	{
		this.upperAmount = pUpperAmount;
		this.rate = pRate;
	}

	public double assessFee(double invoice) {
		if (invoice == 0) return 0;
		return rate * (invoice > upperAmount ? invoice - upperAmount : 0);
	}

}
