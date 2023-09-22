import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundamentalIndicatorsFactoryTest {
    @Test
    void deveRetornarExcecaoParaCalculoInexistente() {
        try {
            IFundamentalIndicators calculation = FundamentalIndicatorsFactory.getCalculation("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Calculo inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCalculoInvalido() {
        try {
            IFundamentalIndicators calculation = FundamentalIndicatorsFactory.getCalculation("LPA");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Calculo inválido", e.getMessage());
        }
    }
}