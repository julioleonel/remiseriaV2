package ar.edu.undef.fie;

public class Vehiculo {

    //Atributos
    private String dominio;
    private String marca;
    private String modelo;
    private int kilometraje;

    private boolean disponible;


    //Constructor
    public Vehiculo(String dominio, String marca, String modelo, int kilometraje, boolean disponible) {
        this.dominio = dominio;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.disponible = disponible;
    }

    //Getters y Setters


    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Metodos

    public boolean disponibilidad() {

        if (this.kilometraje < 15000) {
            return true;
        }
        return false;
    }


}
