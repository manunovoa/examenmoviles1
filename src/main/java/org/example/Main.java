package org.example;

import org.example.clasesSeleccion.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        int option;

        System.out.println("\n****** Seleccion Colombia ******");
        do {
            System.out.println("\n***** Menu *****");
            System.out.println("1. Agregar un jugador ");
            System.out.println("2. Buscar un jugador ");
            System.out.println("3. Editar un jugador");
            System.out.println("4. Ver jugadores");
            System.out.println("5. Cerrar programa ");
            System.out.print("Digite una opcion: ");
            option = entradaDatos.nextInt();

            switch (option){
                case 1:
                    if(jugadores.size() < 23){
                        Jugador objetoJugador = new Jugador();
                        System.out.println("\nInformacion del jugador ");
                        System.out.print("-Ingrese el numero del jugador: ");
                        int numeroJugador = entradaDatos.nextInt();
                        boolean bandera = false;

                        for (Jugador jugador:jugadores){
                            if (jugador.getNumeroCamiseta() == numeroJugador){
                                bandera = true;
                                break;
                            }else{
                                bandera = false;
                            }
                        }
                        if(bandera){
                            System.out.println("El número de la camiseta ya es existente, debes ingresar otro numero.");
                        }else{
                            objetoJugador.setNumeroCamiseta(numeroJugador);
                            System.out.print("-Ingrese el nombre del jugador: ");
                            objetoJugador.setNombres(entradaDatos.next());
                            System.out.print("-Ingrese los apellido del jugador: ");
                            objetoJugador.setApellidos(entradaDatos.next());
                            System.out.print("-Ingrese la posición del jugador : ");
                            objetoJugador.setPosicion(entradaDatos.next());
                            System.out.print("-Ingrese la edad del jugador: ");
                            objetoJugador.setEdad(entradaDatos.nextInt());
                            System.out.print("-Ingrese el equipo donde juega: ");
                            objetoJugador.setEquipoJugador(entradaDatos.next());

                            jugadores.add(objetoJugador);
                        }
                    }else {
                        System.out.println("La seleccion está llena.");
                    }
                    break;

                case 2:
                    int buscarJugador;
                    System.out.println("\nBuscar jugador");
                    System.out.print("*Ingrese el numero del jugador que desea buscar:");
                    buscarJugador = entradaDatos.nextInt();
                    boolean jugadorNoEncontrado = false;
                    for (Jugador jugador:jugadores) {
                        if(jugador.getNumeroCamiseta() == buscarJugador){
                            System.out.println("*El numero de la camisa es: " + jugador.getNumeroCamiseta());
                            System.out.println("*El nombre del jugador es: " + jugador.getNombres());
                            System.out.println("*El apellido del jugador es: " + jugador.getApellidos());
                            System.out.println("*La posicion del jugador es: " + jugador.getPosicion());
                            System.out.println("*La edad del jugador es: " + jugador.getEdad());
                            System.out.println("*El equipo donde juega es: " + jugador.getEquipoJugador());
                            jugadorNoEncontrado = false;
                            break;
                        }else{
                            jugadorNoEncontrado = true;
                        }
                    }
                    if(jugadorNoEncontrado){
                        System.out.println("El jugador no fue encontrado.");
                    }else{
                        System.out.println("La busqueda fue exitosa");
                    }
                    break;

                case 3:
                    int editarJugador;
                    System.out.println("\nEditar jugador");
                    System.out.print("-Ingrese el número del jugador que desea editar: ");
                    editarJugador = entradaDatos.nextInt();
                    int optionEditar;

                    for (Jugador jugador:jugadores) {
                        if(jugador.getNumeroCamiseta() == editarJugador){
                            System.out.println("** El jugador está en la base de datos **");

                            do {
                                System.out.println("\n1. Editar numero de camiseta");
                                System.out.println("2. Editar nombres");
                                System.out.println("3. Editar apellidos");
                                System.out.println("4. Editar posicion del jugador");
                                System.out.println("5. Editar Edad del jugador");
                                System.out.println("6. Editar equipo del jugador");
                                System.out.println("7. Salir de la edición del jugador");
                                System.out.print("Digite una opcion: ");
                                optionEditar = entradaDatos.nextInt();
                                System.out.println("\n");

                                switch (optionEditar){
                                    case 1:
                                        int nuevoNumeroCamiseta;
                                        System.out.print("-Ingrese el nuevo numero de la camiseta del jugador: ");
                                        nuevoNumeroCamiseta = entradaDatos.nextInt();
                                        for (Jugador verificarJugador:jugadores) {
                                            if (verificarJugador.getNumeroCamiseta() == nuevoNumeroCamiseta){
                                                System.out.println("El numero de camisa ya existe.");
                                            }else{
                                                jugador.setNumeroCamiseta(nuevoNumeroCamiseta);
                                                System.out.println("Cambio de numero exitoso.");
                                            }
                                        }
                                        break;

                                    case 2:
                                        System.out.println("-Ingrese el nuevo nombre del jugador: ");
                                        jugador.setNombres(entradaDatos.next());
                                        break;

                                    case 3:
                                        System.out.print("-Ingrese el nuevo apellido del jugador");
                                        jugador.setApellidos(entradaDatos.next());
                                        break;

                                    case 4:
                                        System.out.print("-Ingrese la nueva posición del jugador");
                                        jugador.setPosicion(entradaDatos.next());
                                        break;

                                    case 5:
                                        System.out.print("-Ingrese la nueva edad del jugador: ");
                                        int nuevaEdad = entradaDatos.nextInt();
                                        jugador.setEdad(nuevaEdad);
                                        break;

                                    case 6:
                                        System.out.print("-Ingrese el nuevo equipo del jugador: ");
                                        jugador.setEquipoJugador(entradaDatos.next());
                                        break;

                                    case 7:
                                        System.out.println("Has elegido salir del editor.");
                                        break;

                                    default:
                                        System.out.println("Opcion no valida.");

                                }// Fin switch editar jugador
                            }while (optionEditar != 7);

                        }else{
                            System.out.println("Jugador no encontrado.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nLista de jugadores");
                    for (Jugador jugador:jugadores) {
                        System.out.println("**************** jugador ****************");
                        System.out.println("-El numero: " + jugador.getNumeroCamiseta());
                        System.out.println("-El nombre del jugador es: " + jugador.getNombres());
                        System.out.println("-El apellido del jugador es: " + jugador.getApellidos());
                        System.out.println("-La posicion del jugador es: "+ jugador.getPosicion());
                        System.out.println("-La edad del jugador es: " + jugador.getEdad());
                        System.out.println("-El equipo del jugador es: " + jugador.getEquipoJugador()+"\n");
                    }
                    break;

                case 5:
                    System.out.println("**** Programa cerrado ****");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }while (option !=5);
    }//Fin clase Main
}