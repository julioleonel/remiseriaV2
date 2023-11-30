package ar.edu.undef.fie;


public class Main {
    public static void main(String[] args) {


        // Creo los objetos
        Empleado empleado1 = new Empleado("Leonel", "Sendra", "31747476", "A", "2023-12-01", true, 60);
        Empleado empleado2 = new Empleado("Jorge", "Sandoval", "30254789", "A", "2023-12-02", true, 50 );

        //uno con la licencia vencida
        Empleado empleado3 = new Empleado("Pepe", "Quiroga", "32254789", "A", "2022-12-02", true, 50 );

        Vehiculo vehiculo1 = new Vehiculo("Mas-608", "Focus", "ford", 16000, true);
        Vehiculo vehiculo2 = new Vehiculo("Mas-609", "Focus", "ford", 14000, true);
        Sistema sistema = new Sistema(50);

        //verificamos las licencias
        sistema.incorporarEmpleado(empleado1);
        sistema.incorporarEmpleado(empleado2);

        //agrego un chofer con la licencia vencida, no deberia poder entrar para el cobro
        sistema.incorporarEmpleado(empleado3);

        sistema.liquidarSueldos();

        sistema.aptoService(vehiculo1); // necesita service
        sistema.aptoService(vehiculo2); // no necesita service



        sistema.mostrarAptoService();

    }
}


