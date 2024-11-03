package co.edu.uniquindio.poo.model;
import  java.time.Duration;
public class Combustible {
    private TipoCombustible tipoCombustible;
    private double autonomia;
    private Duration tiempoDeCarga;
    private boolean esEnchuflable;
    private boolean esHibrido;

    public Combustible(TipoCombustible tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public Duration getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    public void setTiempoDeCarga(Duration tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    public boolean isEsHibrido() {
        return esHibrido;
    }

    public void setEsHibrido(boolean esHibrido) {
        this.esHibrido = esHibrido;
    }

    public boolean isEsEnchuflable() {
        return esEnchuflable;
    }

    public void setEsEnchuflable(boolean esEnchuflable) {
        this.esEnchuflable = esEnchuflable;
    }
}
