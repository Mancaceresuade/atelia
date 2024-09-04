package com.atelia.quiz.controllers;

import java.util.HashMap;

public class Pregunta {
    private int id;
    private String pregunta;
    private HashMap<Integer, String> respuestas;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPregunta() {
        return pregunta;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    public HashMap<Integer, String> getRespuestas() {
        return respuestas;
    }
    public void setRespuestas(HashMap<Integer, String> respuestas) {
        this.respuestas = respuestas;
    }
    @Override
    public String toString() {
        return "Pregunta [id=" + id + ", pregunta=" + pregunta + ", respuestas=" + respuestas + "]";
    }

        
}
