package co.edu.uniquindio.poo.model;

public class Compra extends Transaccion{

    @Override
    public double calcularValor() {
        return vehiculo.getPrecio();
    }
    
}
