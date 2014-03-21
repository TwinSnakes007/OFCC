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
		double under100k, between100and500k, over500k;
		
		if (invoice == 0) return fee;
		
		over500k = invoice > 500000.00 ? invoice - 500000.00 : 0;
		between100and500k = invoice > 100000 && invoice < 5000000 ? ( invoice > 500000 ? 400000 : 500000 - invoice  ) : 0;
		under100k = invoice > 100000.00 ? 100000 : invoice;
		
		fee = (under100k * 0.2) + (between100and500k * 0.1) + (over500k * 0.05);
		
		return fee;
	}
}
