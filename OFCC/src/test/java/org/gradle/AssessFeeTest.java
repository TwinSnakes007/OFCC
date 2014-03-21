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
    public void feeFor600k() {
    	assessor.setInvoice(600000);
    	assertEquals(65000, assessor.fee(), 0.0f);
    }
    
}
