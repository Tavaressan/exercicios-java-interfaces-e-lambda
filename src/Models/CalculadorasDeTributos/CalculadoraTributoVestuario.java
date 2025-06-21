package Models.CalculadorasDeTributos;

public class CalculadoraTributoVestuario implements CalculadoraDeTributos{

    @Override
    public double calculaTributo(double valorProduto) {
        return valorProduto * 0.025;
    }
}
