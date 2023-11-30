package ar.edu.undef.fie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado {

    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    private String tipoLicencia;

    private String fechaVencimientoLicencia;

    private boolean disponible;

    private int horasTrabajadas;

    //Constructor

    public Empleado(String nombre, String apellido, String dni, String tipoLicencia, String fechaVencimientoLicencia, boolean disponible, int horasTrabajadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tipoLicencia = tipoLicencia;
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
        this.disponible = disponible;
        this.horasTrabajadas = horasTrabajadas;
    }


    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public String getFechaVencimientoLicencia() {
        return fechaVencimientoLicencia;
    }

    public void setFechaVencimientoLicencia() {
        this.fechaVencimientoLicencia = fechaVencimientoLicencia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    // metodos
    // es responsabilidad de la clase empleado ver si esta habilitado para manejar un vehiculo

    public boolean verificarVencimiento() {
        Date fechaActual = new Date();
        Date fechaVencimiento;

        try {
            fechaVencimiento = new SimpleDateFormat("yyyy-MM-dd").parse(fechaVencimientoLicencia);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return fechaVencimiento.after(fechaActual);
    }


    public boolean habilitarChofer() {
        if (verificarVencimiento()) {
            return true;
        }
        return false;

    }


}
