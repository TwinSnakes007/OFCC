package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssessFeeTest {
	private AssessFee assessor = new AssessFee();
	
    @Test
    public void noFee() {
        assertEquals(0.0f, assessor.fee(), 0.0f);
    }
    
    @Test
    public void feeFor50k() {
    	assessor.setInvoice(50000.00f);
    	assertEquals(10000.0f, assessor.fee(), 0.0f);
    }
    
    @Test
    public void feeFor200k() {
    	assessor.setInvoice(200000.00f);
    	assertEquals(30000.00f, assessor.fee(), 0.0f);
    }
}
