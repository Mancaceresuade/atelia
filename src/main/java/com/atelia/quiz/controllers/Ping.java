package com.atelia.quiz.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ping
 */
@RestController
public class Ping {

    ArrayList<Pregunta> preguntas = new ArrayList<>();
    HashMap<Integer,Jugada> jugadas = new HashMap<>();    

    @GetMapping("/ping")
    public String pingPong() {
        return "pong";
    }

    @GetMapping("/preguntas")
    public ResponseEntity<ArrayList<Pregunta>> getPreguntas() {
        Pregunta pregunta1 = new Pregunta();
        pregunta1.setId(1);
        pregunta1.setPregunta("¿Cual de los siguientes es un tipo de dato primitivo en java ?");
        HashMap<Integer,String> respuesta1 = new HashMap<>();
        respuesta1.put(1, "String");
        respuesta1.put(2, "int");
        respuesta1.put(3, "Integer");
        respuesta1.put(4, "Test");
        pregunta1.setRespuestas(respuesta1);
        preguntas.add(pregunta1);
        Pregunta pregunta2 = new Pregunta();
        pregunta2.setId(2);
        pregunta2.setPregunta("¿Que se utiliza para declarar un arreglo unidimensional en java ?");
        HashMap<Integer,String> respuesta21 = new HashMap<>();
        respuesta21.put(1, "int arr=new int[10]");
        respuesta21.put(2, "int arr");
        respuesta21.put(3, "Integer[]");
        respuesta21.put(4, "Test");
        pregunta2.setRespuestas(respuesta21);
        preguntas.add(pregunta2);
        return new ResponseEntity<>(preguntas, HttpStatus.OK);
    }


    @GetMapping("/jugar")
    public boolean jugar(@RequestParam("jugador") String jugador) {
                
        return false;
    }

    @GetMapping("/resultados")
    public ArrayList<Puntaje> resultados() {
        ArrayList<Puntaje> puntajes = new ArrayList<>();
        return puntajes;
    }

}