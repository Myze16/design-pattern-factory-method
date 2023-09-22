import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundamentalIndicatorsPLTest {
    @Test
    void deveCalcularPL() {
        IFundamentalIndicators calculation = FundamentalIndicatorsFactory.getCalculation("PL");
        assertEquals("PL calculado!", calculation.calculation());
    }
}