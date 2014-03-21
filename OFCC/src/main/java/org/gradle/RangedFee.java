package org.gradle;

public class RangedFee implements IFee {
	
	private double lowerRange = 0, upperRange = 0, rate = 0;
	
	public RangedFee(double pRate, double pLowerRange, double pUpperRange)
	{
		this.lowerRange = pLowerRange;
		this.upperRange = pUpperRange;
		this.rate = pRate;
	}

	public double assessFee(double invoice) {
		double adjustedInvoice = 0;
		
		if (invoice == 0) return 0;
		
		if (invoice > lowerRange || invoice > upperRange)
		{
			if (invoice > upperRange)
				adjustedInvoice = upperRange - lowerRange;
			else
				adjustedInvoice = upperRange - invoice;
		}

		return rate * adjustedInvoice;
	}

}


/*
 * 		over500k = invoice > 500000.00 ? invoice - 500000.00 : 0;
		between100and500k = invoice > 100000 && invoice < 5000000 ? ( invoice > 500000 ? 400000 : 500000 - invoice  ) : 0;
		under100k = invoice > 100000.00 ? 100000 : invoice;

		fee = (under100k * 0.2) + (between100and500k * 0.1) + (over500k * 0.05);
		
*/
