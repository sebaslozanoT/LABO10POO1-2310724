/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pracalificada2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Us
 */
public class PraCalificada2 {
private List<Paciente> listaPacientes = new ArrayList<>();
private List<Medico> listaMedicos = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("****** MENU ********");
            System.out.println("1-REGISTAR DATOS DEL PACIENTE");
            System.out.println("2-ELIMINAR DATOS DEL PACIENTE");
            System.out.println("3-MODIFICAR DATOS DEL PACIENTE  ");
            System.out.println("4-MOSTRAR EL PESO QUE REPITENTE");
            System.out.println("5-MOSTRAR CANTIDAD DE PACEINTES CON PESO REPITENTE");
            System.out.println("6-MOSTRAR EL PESO MAYOR Y MENOR");
            System.out.println("7-MOSTRAR A QUE RANGO PERTENECE CADA PACIENTE");
            System.out.println("8-MOSTRAR PACIENTES ORDENADOS ALFABETICAMENTE (APELLIDO)");
            System.out.println("9-DOCTOR -> PACIENTE ATENDIDO");
            System.out.println("10-BUSCAR LOS DOCTORES POR ESPECIALIDAD");
            System.out.println("0-SALIR");
            System.out.println("*********************");
            System.out.print("SELECCIONE UNA OPCION: ");
            opcion = scanner.nextInt();   
        switch (opcion) {
                case 1:
                    //registrarPaciente();
                    break;
                case 2:
                    //eliminarPaciente();
                    break;
                case 3:
                    //modificarPaciente();
                    break;
                case 4:
                    //mostrarPesoQueMasSeRepite();
                    break;
                case 5:
                    //mostrarCantidadPacientesConPesoRepetido();
                    break;
                case 6:
                    //mostrarPesoMayorYMenor();
                    break;
                case 7:
                    //dividirRangoDePesos();
                    break;
                case 8:
                    //mostrarListaPacientesOrdenadosPorApellidos();
                    break;
                case 9:
                    //indicarDoctorQueAtendioPaciente();
                    break;
                case 10:
                    //buscarDoctoresPorEspecialidad();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no valida. Por favor, seleccione una opción valida.");
            }
        }while (opcion != 0);
    }
    private void registrarPaciente() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** INGRESAR LOS DATOS DEL PACIENTE *****");
        System.out.println("Ingresar Dni:");
        int Dni  = scanner.nextInt();
        System.out.println("Ingresar Nombre:");
        String Nombre = scanner.next();
        System.out.println("Ingresar Apellido");
        String Apellido = scanner.next();
        System.out.println("Ingrese Direccion:");
        String Direccion = scanner.next();
        System.out.println("Ingresar Peso:");
        float Peso = scanner.nextFloat();
        System.out.println("Ingresar Temperatura");
        float Temperatura = scanner.nextFloat();
        
        Paciente paciente = new Paciente(Dni, Nombre,Apellido, Direccion, Peso, Temperatura);
        asignarMedico(paciente);
        listaPacientes.add(paciente);
        
        System.out.println("Paciente registrado correctamente");       
    }
    
    private void asignarMedico(Paciente paciente){
        if(!listaMedicos.isEmpty()){
            Medico medicoAsignado = listaMedicos.get(0);
            paciente.setMedico(medicoAsignado);
            System.out.println("Paciente asignado al medico" + medicoAsignado.getNombre());
        }   else{
            System.out.println("No hay medicos discponibles para asignar al paciente.");
        }
    }
    
    private void eliminarPaciente() {
    Scanner scanner = new Scanner(System.in);
    if (listaPacientes.isEmpty()) {
        System.out.println("No hay pacientes para eliminar.");
        return;
    }
    System.out.println("Lista de pacientes:");
    mostrarListaPacientes();
    System.out.print("Ingrese la posición del paciente a eliminar: ");
    int posicion = scanner.nextInt();

    if (posicion >= 1 && posicion <= listaPacientes.size()) {
        Paciente pacienteEliminado = listaPacientes.remove(posicion - 1);
        System.out.println("Paciente eliminado exitosamente: " + pacienteEliminado.getNombre());
    } else {
        System.out.println("Posición invalida. No se pudo eliminar al paciente.");
    }
}
    
    private void mostrarListaPacientes() {
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes registrados.");
        } else {
            for (int i = 0; i < listaPacientes.size(); i++) {
                System.out.println((i + 1) + ". " + listaPacientes.get(i).getNombre());
            }
        }
    }
    
    private void modificarPaciente(){
       Scanner scanner = new Scanner(System.in);
        if (listaPacientes.isEmpty()) {
            System.out.println("No hay pacientes para modificar.");
            return;
        }
        System.out.println("Lista de pacientes:");
        mostrarListaPacientes();

        System.out.print("Ingrese la posición del paciente a modificar: ");
        int posicion = scanner.nextInt();

        if(posicion >= 1 && posicion <= listaPacientes.size()){
            Paciente paciente = listaPacientes.get(posicion - 1);

            System.out.println("Datos actuales del paciente:");
            System.out.println("1. DNI: " + paciente.getDni());
            System.out.println("2. Nombre: " + paciente.getNombre());
            System.out.println("3 Apellido: "+ paciente.getApellido());
            System.out.println("4. Dirección: " + paciente.getDireccion());
            System.out.println("5. Peso: " + paciente.getPeso());
            System.out.println("6. Temperatura: " + paciente.getTemperatura());
            System.out.print("Seleccione el número del dato a modificar (0 para salir): ");
            int opcionModificar = scanner.nextInt();

            switch(opcionModificar){
                case 1:
                    System.out.print("Nuevo DNI: ");
                    paciente.setDni(scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Nuevo nombre: ");
                    paciente.setNombre(scanner.next());
                    break;
                 case 3:
                    System.out.println("Nuevo apellido:");
                    paciente.setApellido(scanner.next());
                    break;
                case 4:
                    System.out.print("Nueva dirección: ");
                    paciente.setDireccion(scanner.next());
                    break;
                case 5:
                    System.out.print("Nuevo peso: ");
                    paciente.setPeso(scanner.nextFloat());
                    break;
                case 6:
                    System.out.print("Nueva temperatura: ");
                    paciente.setTemperatura(scanner.nextFloat());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println("Paciente modificado exitosamente: " + paciente.getNombre());
        } else {
            System.out.println("Posición inválida. No se pudo modificar al paciente.");
        }
    }


    private void mostrarPesoQueMasSeRepite() {
    if (listaPacientes.isEmpty()) {
        System.out.println("No hay pacientes registrados.");
        return;
    }
    Map<Float, Integer> conteoPesos = new HashMap<>();

    for (Paciente paciente : listaPacientes) {
        float pesoActual = paciente.getPeso();
        conteoPesos.put(pesoActual, conteoPesos.getOrDefault(pesoActual, 0) + 1);
    }
    
    float pesoMasRepetido = 0;
    int maxFrecuencia = 0;

    for (Map.Entry<Float, Integer> entry : conteoPesos.entrySet()) {
        if (entry.getValue() > maxFrecuencia) {
            maxFrecuencia = entry.getValue();
            pesoMasRepetido = entry.getKey();
        }
    }
    if (maxFrecuencia > 1) {
        System.out.println("El peso que más se repite es: " + pesoMasRepetido + " con " + maxFrecuencia + " pacientes.");
    } else {
        System.out.println("No hay un peso que se repita más de una vez.");
    }
    }

    private void mostrarCantidadPacientesConPesoRepetido(){
        if (listaPacientes.isEmpty()){
        System.out.println("No hay pacientes registrados.");
        return;
    }
    Map<Float, Integer> conteoPesos = new HashMap<>();
    for (Paciente paciente : listaPacientes){
        float pesoActual = paciente.getPeso();
        conteoPesos.put(pesoActual, conteoPesos.getOrDefault(pesoActual, 0) + 1);
    }
    float pesoMasRepetido = 0;
    int maxFrecuencia = 0;

    for (Map.Entry<Float, Integer> entry : conteoPesos.entrySet()){
        if (entry.getValue() > maxFrecuencia){
            maxFrecuencia = entry.getValue();
            pesoMasRepetido = entry.getKey();
        }
    }
    if (maxFrecuencia > 1){
        System.out.println("La cantidad de pacientes con el peso que más se repite (" + pesoMasRepetido + ") es: " + maxFrecuencia);
    }else{
        System.out.println("No hay un peso que se repita más de una vez.");
    }
    }

    private void mostrarPesoMayorYMenor() {
        if (listaPacientes.isEmpty()) {
        System.out.println("No hay pacientes registrados.");
        return;
    }
    double pesoMayor = Double.MIN_VALUE;
    double pesoMenor = Double.MAX_VALUE;
    
    for (Paciente paciente : listaPacientes) {
        double pesoActual = paciente.getPeso();
        if (pesoActual > pesoMayor) {
            pesoMayor = pesoActual;
        } 
        if (pesoActual < pesoMenor) {
            pesoMenor = pesoActual;
        }
    }
    System.out.println("Peso mayor: " + pesoMayor);
    System.out.println("Peso menor: " + pesoMenor);
    }

    private void dividirRangoDePesos(){
        if (listaPacientes.isEmpty()){
        System.out.println("No hay pacientes registrados.");
        return;
    }
    double pesoMinimo = Double.MAX_VALUE;
    double pesoMaximo = Double.MIN_VALUE;

    for (Paciente paciente : listaPacientes){
        double pesoActual = paciente.getPeso();
        pesoMinimo = Math.min(pesoMinimo, pesoActual);
        pesoMaximo = Math.max(pesoMaximo, pesoActual);
    }
    double rango = (pesoMaximo - pesoMinimo) / 4;
    int[] contadores = new int[4];
    for (Paciente paciente : listaPacientes){
        double pesoActual = paciente.getPeso();
        
        if(pesoActual >= pesoMinimo && pesoActual < pesoMinimo + rango){
            contadores[0]++;
        }else if(pesoActual >= pesoMinimo + rango && pesoActual < pesoMinimo + 2 * rango){
            contadores[1]++;
        }else if(pesoActual >= pesoMinimo + 2 * rango && pesoActual < pesoMinimo + 3 * rango){
            contadores[2]++;
        }else{
            contadores[3]++;
        }
    }
    System.out.println("Cantidad de pacientes en cada rango de pesos:");
    System.out.println("[" + pesoMinimo + " - " + (pesoMinimo + rango) + "]: " + contadores[0] + " pacientes");
    System.out.println("[" + (pesoMinimo + rango) + " - " + (pesoMinimo + 2 * rango) + "]: " + contadores[1] + " pacientes");
    System.out.println("[" + (pesoMinimo + 2 * rango) + " - " + (pesoMinimo + 3 * rango) + "]: " + contadores[2] + " pacientes");
    System.out.println("[" + (pesoMinimo + 3 * rango) + " - " + pesoMaximo + "]: " + contadores[3] + " pacientes");
    }

    private void mostrarListaPacientesOrdenadosPorApellidos(){
        if (listaPacientes.isEmpty()){
        System.out.println("No hay pacientes registrados.");
        return;
    }
        Collections.sort(listaPacientes, Comparator.comparing(Paciente::getApellido));
    System.out.println("Lista de pacientes ordenados por apellidos:");
    for (Paciente paciente : listaPacientes){
        System.out.println(paciente);
    }
}

    private void indicarDoctorQueAtendioPaciente(){
       Scanner scanner = new Scanner(System.in);

        if(listaPacientes.isEmpty()){
            System.out.println("No hay pacientes para buscar.");
            return;
        }

        System.out.print("Ingrese el nombre del paciente: ");
        String nombrePaciente = scanner.next();

        for (Paciente paciente : listaPacientes){
            if (paciente.getNombre().equalsIgnoreCase(nombrePaciente)){
                if (paciente.getMedico() != null){
                    System.out.println("El paciente fue atendido por el medico: " + paciente.getMedico().getNombre());
                } else{
                    System.out.println("El paciente no tiene asignado un médico.");
                }
                return;
            }
        }

        System.out.println("Paciente no encontrado.");
    }

    private void buscarDoctoresPorEspecialidad(){
        Scanner scanner = new Scanner(System.in);
        if (listaMedicos.isEmpty()){
            System.out.println("No hay medicos registrados.");
            return;
        }
        System.out.print("Ingrese la especialidad a buscar: ");
        String especialidadBuscada = scanner.next();
        boolean encontrado = false;
        for (Medico medico : listaMedicos){
            if (medico.getEspecialidad().equalsIgnoreCase(especialidadBuscada)){
                System.out.println("Medico encontrado: " + medico.getNombre());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("No se encontraron médicos con la especialidad especificada.");
        }
    }
}



    
