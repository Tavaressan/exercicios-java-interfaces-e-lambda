package Models.CalculadorasDeTributos;

public class CalculadoraTributoCultura implements CalculadoraDeTributos{

    @Override
    public double calculaTributo(double valorProduto) {
        return valorProduto * 0.04;
    }
}
