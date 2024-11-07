package co.edu.uniquindio.poo.model;

public class Vehiculo implements Combustible {
    private  String marca, condicion, modelo, cambios;
    private  int cilindraje, VelMaxima, numeroPasajeros, precio;
   

    public Vehiculo(String marca, String condicion, String modelo, String cambios, int cilindraje, int velMaxima, int numeroPasajeros, TipoCombustible tipoCombustible, int precio){
        this.marca = marca;
        this.condicion = condicion;
        this.modelo = modelo;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        this.VelMaxima = velMaxima;
        this.numeroPasajeros = numeroPasajeros;
        this.precio = precio;
               
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
