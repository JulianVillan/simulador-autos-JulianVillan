package ar.edu.unahur.obj2;

public class Ecologica implements TipoConduccion {

    @Override
    public double consumo() {
        return 16;
    }

    @Override
    public double velocidadMaxima() {
        return 120;
    }
}
