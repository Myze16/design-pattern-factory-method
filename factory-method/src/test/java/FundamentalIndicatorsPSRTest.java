import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundamentalIndicatorsPSRTest {
    @Test
    void deveCalcularPSR() {
        IFundamentalIndicators calculation = FundamentalIndicatorsFactory.getCalculation("PSR");
        assertEquals("PSR calculado!", calculation.calculation());
    }
}