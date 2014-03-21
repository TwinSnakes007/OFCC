package org.gradle;

public class UpperFee implements IFee {
	
	private double upperAmount = 0, rate = 0, existingCostBasis = 0;
	
	public UpperFee(double pRate, double pUpperAmount, double pExistingCostBasis)
	{
		this.upperAmount = pUpperAmount;
		this.existingCostBasis = pExistingCostBasis;
		this.rate = pRate;
	}

	public double assessFee(double invoice) {
		double adjustedInvoice = invoice + existingCostBasis;
		if (invoice == 0) return 0;
		else if (adjustedInvoice < upperAmount) return 0;
		
		return rate * (existingCostBasis < upperAmount ? invoice - (upperAmount - existingCostBasis) : invoice);
	}

}
