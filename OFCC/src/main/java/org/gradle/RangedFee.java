package org.gradle;

public class RangedFee implements IFee {
	
	private double lowerRange = 0, upperRange = 0, rate = 0, existingCostBasis = 0;
	
	public RangedFee(double pRate, double pLowerRange, double pUpperRange, double pExistingCostBasis)
	{
		this.lowerRange = pLowerRange;
		this.upperRange = pUpperRange;
		this.existingCostBasis = pExistingCostBasis;
		this.rate = pRate;
	}

	public double assessFee(double invoice) {
		double adjustedInvoice = invoice + existingCostBasis;
		
		if (invoice == 0) return 0;
		else if (existingCostBasis > upperRange) return 0;
		
		if (adjustedInvoice > lowerRange)
		{
			if (adjustedInvoice > upperRange)
				adjustedInvoice = upperRange - existingCostBasis > 0 ? upperRange - existingCostBasis : 0;
			else
			{
				adjustedInvoice = invoice > lowerRange ? lowerRange - existingCostBasis : ( invoice - existingCostBasis > 0 ? invoice - existingCostBasis : 0 );
			}
		}

		return rate * adjustedInvoice;
	}

}