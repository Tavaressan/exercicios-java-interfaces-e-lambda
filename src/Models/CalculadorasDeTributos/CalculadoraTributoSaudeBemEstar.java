package Models.CalculadorasDeTributos;

public class CalculadoraTributoSaudeBemEstar implements CalculadoraDeTributos{

    @Override
    public double calculaTributo(double valorProduto) {
        return valorProduto * 0.015;
    }
}
