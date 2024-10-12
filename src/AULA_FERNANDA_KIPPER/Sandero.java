package AULA_FERNANDA_KIPPER;

public class Sandero implements Carro {

    @Override
    public void acelerar() {
        System.out.println("acelerando a 100km");
    }

    @Override
    public void freiar() {
        System.out.println("freiando o carro");
    }

    @Override
    public void parar() {

    }
}
