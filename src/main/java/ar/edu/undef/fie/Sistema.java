package ar.edu.undef.fie;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sistema {

    private double precioPorHora;
    private Map<String, Double> sueldoEmpleado;

    private List<String> taller;

    public Sistema(double precioPorHora) {
        this.precioPorHora = precioPorHora;
        sueldoEmpleado = new HashMap<>();
        taller = new ArrayList<>();
    }

    //calcular sueldo del empleado
    public double calcularSueldo(Empleado empleado) {
        if (empleado.verificarVencimiento()) {
            return this.precioPorHora * empleado.getHorasTrabajadas();
        }
        return 0;
    }

    public void incorporarEmpleado(Empleado empleado) {
        if (empleado.verificarVencimiento()) {
            sueldoEmpleado.put(empleado.getApellido(), calcularSueldo(empleado));
        } else {
            System.out.println("Imposible incorporar a un chofer con la licencia vencida");
        }

    }

    public void liquidarSueldos() {
        System.out.println("Liquidacion de sueldos");
        for (Map.Entry<String, Double> entry : sueldoEmpleado.entrySet()) {
            String apellido = entry.getKey();
            Double sueldo = entry.getValue();
            System.out.println("Apellido: " + apellido + ", Sueldo: " + sueldo);
        }
    }

    public void aptoService(Vehiculo vehiculo){
        if(vehiculo.disponibilidad()){
            taller.add(vehiculo.getDominio());
        }
    }

    public void mostrarAptoService(){
        System.out.println("Vehiculos aptos para service");
        for(String vehiculo : taller){
            System.out.println(vehiculo);
        }
    }

}


