package com.atelia.quiz.controllers;

public class Puntaje {
    private int jugador;
    private int pregunta;
    private int puntaje;
        

    public int getJugador() {
        return this.jugador;
    }

    public void setJugador(int jugador) {
        this.jugador = jugador;
    }

    public int getPregunta() {
        return this.pregunta;
    }

    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "{" +
            " jugador='" + getJugador() + "'" +
            ", pregunta='" + getPregunta() + "'" +
            ", puntaje='" + getPuntaje() + "'" +
            "}";
    }

}
