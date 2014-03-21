package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssessFeeTest {
    @Test
    public void noFee() {
        AssessFee fee = new AssessFee();
        assertEquals(0,0f, fee.fee());
    }
}
