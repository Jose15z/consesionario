package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Consesionario {
    private String nombre;
    private Collection<Empleado> empleados;
    private Collection<Administrador> administradores;
    private Collection <Vehiculo> vehiculos;
    private Collection <Transaccion> transacciones;
    

    
    public Consesionario(String nombre){
        this.nombre = nombre;
        empleados = new LinkedList<>();
        administradores = new LinkedList<>();
        vehiculos = new LinkedList<>();
        transacciones = new LinkedList<>();
    }

    public boolean verificarEmpleado(String id){
        boolean estaEmpleado = false;
        for (Empleado empleado : empleados) {
            if(empleado.getId().equals(id)){
                estaEmpleado = true;
            }
        }
        return estaEmpleado;
    }
    
    public void agregarEmpleado(Empleado empleado){
        if(!verificarEmpleado(empleado.getId())){
            empleados.add(empleado);
            
        }
    }
    public boolean iniciarSesionEmpleado(String id, String contraseña){
        boolean accesoValido = false;
        for(Empleado empleado: empleados){
            if(id.equals(empleado.getId())||contraseña.equals(empleado.getClaveAcceso())){
                accesoValido = true;
            }
        }
        return accesoValido;
    }
    public boolean iniciarSesionAdministrador(String id, String contraseña){
        boolean accesoValido = false;
        for(Administrador administrador: administradores){
            if(id.equals(administrador.getId())||contraseña.equals(administrador.getClaveAcceso())){
                accesoValido = true;
            }
        }
        return accesoValido;
    }
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Collection<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(Collection<Administrador> administradores) {
        this.administradores = administradores;
    }

    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
