package Models.CalculadorasDeTributos;

public class CalculadoraTributoAlimentacao  implements CalculadoraDeTributos{

    @Override
    public double calculaTributo(double valorProduto) {
        return valorProduto * 0.01;
    }
}
