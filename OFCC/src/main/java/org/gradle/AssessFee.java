package org.gradle;

public class AssessFee {

	private double invoice;	
	public double getInvoice() { return this.invoice; }
	public void setInvoice(double pInvoice) {this.invoice = pInvoice; }
	
	public AssessFee() {}
	public AssessFee(double pInvoice)
	{
		invoice = pInvoice;
	}
	
	public double fee()
	{
		double fee = 0;
		double under100k, over100k;
		
		if (invoice == 0) return fee;
		
		over100k = invoice > 100000.00 ? invoice - 100000.0 : 0;
		under100k = invoice > 100000.00 ? 100000 : invoice;
		
		fee = (over100k * 0.1) + (under100k * 0.2);
		
		return fee;
	}
}
