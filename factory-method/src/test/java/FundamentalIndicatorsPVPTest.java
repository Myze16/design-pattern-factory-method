import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundamentalIndicatorsPVPTest {
    @Test
    void deveCalcularPVP() {
        IFundamentalIndicators calculation = FundamentalIndicatorsFactory.getCalculation("PVP");
        assertEquals("PVP calculado!", calculation.calculation());
    }
}