import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ISS()));

        Orcamento orcamento2 = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora2 = new CalculadoraDeImpostos();
        System.out.println(calculadora2.calcular(orcamento2, new ICMS()));

    }
}
