public class FundamentalIndicatorsFactory {
    public static IFundamentalIndicators getCalculation(String calculation) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FundamentalIndicators" + calculation);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Calculo inexistente");
        }
        if (!(objeto instanceof IFundamentalIndicators)) {
            throw new IllegalArgumentException("Calculo inválido");
        }
        return (IFundamentalIndicators) objeto;
    }
}