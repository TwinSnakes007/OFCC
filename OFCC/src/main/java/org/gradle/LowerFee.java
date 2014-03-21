package org.gradle;

public class LowerFee implements IFee {
	
	private double belowAmount = 0, rate = 0, existingCostBasis = 0;
	
	public LowerFee(double pRate, double pBelowAmount, double pExistingCostBasis)
	{ 
		this.belowAmount = pBelowAmount;
		this.existingCostBasis = pExistingCostBasis;
		this.rate = pRate;
	}

	public double assessFee(double invoice) {
		double fee = 0;
		if (invoice == 0) return 0;
		else if (existingCostBasis > belowAmount) return 0;
		
		return rate * (invoice > belowAmount ? belowAmount - existingCostBasis : ( invoice - existingCostBasis > 0 ? invoice - existingCostBasis : 0 ) );
	}

}
