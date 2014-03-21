package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssessFeeTest {
	private AssessFee assessor = new AssessFee();
	
    @Test
    public void noFee() {
        assertEquals(0.0f, assessor.fee(0), 0.0f);
    }
    
    @Test
    public void feeFor600k() {
    	assessor.setInvoice(200000);
    	assertEquals(15000, assessor.fee(400000), 0.0f);
    }
    
}
