package test_week_1;

import junit.framework.TestCase;
import week_1.Question_4_Mail_Prices;

public class Question_4_Mail_PricesTest extends TestCase {
    
    public void testCalculateStampPrice() throws Exception {

        assertEquals("Rectangular, flat letters should cost 49c", 49, Question_4_Mail_Prices.calculateStampPrice(true, true));
        assertEquals("Rectangular, bumpy letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(true, false));
        assertEquals("Non-rectangular, flat letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(false, true));
        assertEquals("Non-rectangular, bumpy, letters should cost 70c", 70, Question_4_Mail_Prices.calculateStampPrice(false, false));

    }
}