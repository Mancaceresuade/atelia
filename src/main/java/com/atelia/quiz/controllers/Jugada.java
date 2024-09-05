package com.atelia.quiz.controllers;

/**
 * Jugada
 */
public class Jugada {

    private int jugador;
    private int pregunta;
    private int respuesta;


    public Jugada(int jugador, int pregunta, int respuesta) {
        this.jugador = jugador;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }
    

    public int getJugador() {
        return jugador;
    }
    public void setJugador(int jugador) {
        this.jugador = jugador;
    }
    public int getPregunta() {
        return pregunta;
    }
    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }
    public int getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }
    @Override
    public String toString() {
        return "Jugada [jugador=" + jugador + ", pregunta=" + pregunta + ", respuesta=" + respuesta + "]";
    }

    
}