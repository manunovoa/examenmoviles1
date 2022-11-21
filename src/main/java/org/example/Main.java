package org.example;

import org.example.clasesSeleccion.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaDatos = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int option;

        System.out.println("****** Seleccion Colombia ******");

        do {
            System.out.println("****** DIGITE UNA OPCION ******");
            System.out.println("1. AGREGAR UN JUGADOR A LA SELECCION COLOMBIA ");
            System.out.println("2. BUSCAR UN JUGADOR DE LA SELECCION COLOMBIA ");
            System.out.println("3. EDITAR JUGDOR DE LA SELECCION COLOMBIA ");
            System.out.println("4. MOSTRAR A LOS JUGADORES CONVOCADOS ");
            System.out.println("5. CERRAR PROGRAMA ");
            option = entradaDatos.nextInt();

            switch (option){
                case 1:

                    if(jugadores.size() <= 23){

                        Jugador objetoJugador = new Jugador();
                        System.out.println("Ingrese el numero del jugador");




                    }else {
                        System.out.println("La seleccion está llena");
                    }




                    break;

            }

        }while (option !=5);







    }//
}