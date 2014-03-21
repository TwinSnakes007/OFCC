package org.gradle;

public class AssessFee {

	private float invoice;
	public float getInvoice() { return this.invoice; }
	public void setInvoice(float pInvoice) {this.invoice = pInvoice; }
	
	public AssessFee() {}
	public AssessFee(float pInvoice)
	{
		invoice = pInvoice;
	}
	
	public float fee()
	{
		float fee = 0.0f;
		return fee;
	}
}
