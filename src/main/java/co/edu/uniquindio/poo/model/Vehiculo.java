package co.edu.uniquindio.poo.model;

public class Vehiculo {
    private  String marca, condicion, modelo, cambios;
    private  int cilindraje, VelMaxima, numeroPasajeros;
    private Combustible combustible;

    public Vehiculo(String marca, String condicion, String modelo, String cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible) {
        this.marca = marca;
        this.condicion = condicion;
        this.modelo = modelo;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        VelMaxima = velMaxima;
        this.numeroPasajeros = numeroPasajeros;
        combustible = new Combustible(tipoCombustible);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getVelMaxima() {
        return VelMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        VelMaxima = velMaxima;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }


}
