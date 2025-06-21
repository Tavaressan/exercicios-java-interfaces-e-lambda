package Models.CalculadorasGeometricas;

public class CalculadoraFormasGeometricas implements CalculadoraGeometrica{

    @Override
    public float calculaAreaQuadrado(float lado) {
        return lado * lado;
    }

    @Override
    public float calculaAreaRetangulo(float base, float altura) {
        return base * altura;
    }

    @Override
    public float calculaAreaCirculo(float raio) {
        return (float) (Math.pow(raio, 2) * 3.1415);
    }
}
