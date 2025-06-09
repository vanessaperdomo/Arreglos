/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosnombres;

/**
 *
 * @author gimji
 */
import java.util.Scanner;

public class ArreglosNombres {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cantidad = 2;
        int seleccion;
        int opcion;
        
        String[] primerNombre = new String[cantidad];
        String[] segundoNombre = new String[cantidad];
        String[] primerApellido = new String[cantidad];
        String[] segundoApellido = new String[cantidad];
        String[] correo = new String[cantidad];
        String[] rh = new String[cantidad];
        String[] celular = new String[cantidad];
        String[] direccion = new String[cantidad]; 
        String[] identificacion = new String[cantidad]; 

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Persona " + (i + 1) + ":");

            System.out.print("Primer nombre: ");
            primerNombre[i] = teclado.nextLine();

            System.out.print("Segundo nombre: ");
            segundoNombre[i] = teclado.nextLine();

            System.out.print("Primer apellido: ");
            primerApellido[i] = teclado.nextLine();

            System.out.print("Segundo apellido: ");
            segundoApellido[i] = teclado.nextLine();

            System.out.print("Numero celular: ");
            celular[i] = teclado.nextLine();

            System.out.print("Direccion: ");
            direccion[i] = teclado.nextLine();

            System.out.print("Correo: ");
            correo[i] = teclado.nextLine();

            System.out.print("Tipo de RH: ");
            rh[i] = teclado.nextLine();
            
            System.out.print("Identificacion: ");
            identificacion[i] = teclado.nextLine();
        }

        System.out.println("Lista del nombre de las personas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println((i + 1) + ". " + primerNombre[i] + " " + segundoNombre[i] + " " + primerApellido[i] + " " + segundoApellido[i]);
        }

        System.out.print("Ingrese el numero de la persona que quieres ver (1- " + cantidad + "): ");
        seleccion = teclado.nextInt();
        teclado.nextLine(); 

        if (seleccion >= 1 && seleccion <= cantidad) {
            int i = seleccion - 1;
            System.out.println("Datos completos de la persona " + seleccion + ":");
            System.out.println("Nombre completo: " + primerNombre[i] + " " + segundoNombre[i] + " " + primerApellido[i] + " " + segundoApellido[i]);
            System.out.println("Celular: " + celular[i]);
            System.out.println("Dirección: " + direccion[i]);
            System.out.println("Correo: " + correo[i]);
            System.out.println("Tipo de RH: " + rh[i]);
            System.out.println("Identificacion: " + identificacion[i]);
        } else {
            System.out.println("Numero incorrecto");
        }
        
        do {
            System.out.println("Filtrar personas");
                System.out.println("Selecciona una opcion");
            System.out.println("1. Filtrar por identificacion");
            System.out.println("2. Filtrar por dirección");
            System.out.println("3. Filtrar por nombre completo");
            System.out.println("4. Salir del programa");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la identificacion a buscar: ");
                    String idBuscar = teclado.nextLine();
                    for (int i = 0; i < cantidad; i++) {
                        if (identificacion[i].equalsIgnoreCase(idBuscar)) {
                            System.out.println(primerNombre[i] + " " + segundoNombre[i] + " " + primerApellido[i] + " " + segundoApellido[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la direccion a buscar: ");
                    String dirBuscar = teclado.nextLine();
                    for (int i = 0; i < cantidad; i++) {
                        if (direccion[i].equalsIgnoreCase(dirBuscar)) {
                            System.out.println(primerNombre[i] + " " + segundoNombre[i] + " " + primerApellido[i] + " " + segundoApellido[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre completo a buscar: ");
                    String nombreBuscar = teclado.nextLine();
                    for (int i = 0; i < cantidad; i++) {
                        String nombreCompleto = primerNombre[i] + " " + segundoNombre[i] + " " + primerApellido[i] + " " + segundoApellido[i];
                        if (nombreCompleto.equalsIgnoreCase(nombreBuscar)) {
                            System.out.println(nombreCompleto);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del filtro.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion == 4);

        teclado.close();
    }
}
