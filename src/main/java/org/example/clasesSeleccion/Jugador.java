package org.example.clasesSeleccion;

import java.util.Scanner;

public class Jugador {
    Scanner entradaDatos = new Scanner(System.in);

    //Atributos
    private int numeroCamiseta;
    private String nombres;
    private String apellidos;
    private String posicion;
    private int edad;
    private String equipoJugador;

    // Método constructor
    public Jugador() {
    }

    public Jugador(int numeroCamiseta, String nombres, String apellidos, String posicion, int edad, String equipoJugador) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.posicion = posicion;
        this.edad = edad;
        this.equipoJugador = equipoJugador;
    }

    // Get y set

    public int getNumeroCamiseta() {

        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {

        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombres() {

        return nombres;
    }

    public void setNombres(String nombres) {

        this.nombres = nombres;
    }

    public String getApellidos() {

        return apellidos;
    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    public String getPosicion() {

        return posicion;
    }

    public void setPosicion(String posicion) {

        this.posicion = posicion;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {
        while(edad <= 17){
            System.out.print("La edad debe ser igual o mayor de 18 años, ingresa la edad nuevamente: ");
            edad = entradaDatos.nextInt();
        }
        this.edad = edad;
    }

    public String getEquipoJugador() {

        return equipoJugador;
    }

    public void setEquipoJugador(String equipoJugador) {

        this.equipoJugador = equipoJugador;
    }
}










