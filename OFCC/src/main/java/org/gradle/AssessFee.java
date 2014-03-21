package org.gradle;

import java.util.ArrayList;
import java.util.List;

public class AssessFee {

	private double invoice;	
	public double getInvoice() { return this.invoice; }
	public void setInvoice(double pInvoice) {this.invoice = pInvoice; }
	
	public AssessFee() {}
	public AssessFee(double pInvoice)
	{
		invoice = pInvoice;
	}
	
	public double fee(double existingCostBasis)
	{
		List<IFee> fees = new ArrayList<IFee>();
		double fee = 0;
		
		fees.add(new LowerFee(0.2, 100000, existingCostBasis));
		fees.add(new RangedFee(0.1, 100000, 500000, existingCostBasis));
		fees.add(new UpperFee(0.05, 500000, existingCostBasis));
		
		for (IFee iFee : fees) {
			fee += iFee.assessFee(invoice);
		}
		
		return fee;
	}
}