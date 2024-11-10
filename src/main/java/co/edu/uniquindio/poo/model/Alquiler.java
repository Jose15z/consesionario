package co.edu.uniquindio.poo.model;

public class Alquiler extends Transaccion {
    public double calcularValor() {
        return vehiculo.getPrecio() / 250;
    }
}
