package com.atelia.quiz.controllers;

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

    HashMap<Integer,Pregunta> preguntas = new HashMap<>();    
    HashMap<Integer,Jugada> jugadas = new HashMap<>();    

    @GetMapping("/ping")
    public String pingPong() {
        return "pong";
    }
    public Ping() {
        Pregunta pregunta1 = new Pregunta();
        pregunta1.setId(1);
        pregunta1.setPregunta("¿Cual de los siguientes es un tipo de dato primitivo en java ?");
        HashMap<Integer,String> respuesta1 = new HashMap<>();
        respuesta1.put(1, "String");
        respuesta1.put(2, "int");
        respuesta1.put(3, "Integer");
        respuesta1.put(4, "Test");
        pregunta1.setRespuestas(respuesta1);
        preguntas.put(1,pregunta1);
        Pregunta pregunta2 = new Pregunta();
        pregunta2.setId(2);
        pregunta2.setPregunta("¿Que se utiliza para declarar un arreglo unidimensional en java ?");
        HashMap<Integer,String> respuesta21 = new HashMap<>();
        respuesta21.put(1, "int arr=new int[10]");
        respuesta21.put(2, "int arr");
        respuesta21.put(3, "Integer[]");
        respuesta21.put(4, "Test");
        pregunta2.setRespuestas(respuesta21);
        preguntas.put(2,pregunta2);
    }    
    @GetMapping("/preguntas")
    public ResponseEntity<HashMap<Integer,Pregunta>> getPreguntas() {
        return new ResponseEntity<>(preguntas, HttpStatus.OK);
    }

    @GetMapping("/pregunta")
    public ResponseEntity<Pregunta> getPregunta(@RequestParam("pregunta") Integer pregunta) {
        return new ResponseEntity<>(this.preguntas.get(pregunta), HttpStatus.OK);
    }


    @GetMapping("/jugar")
    public boolean jugar(@RequestParam("jugador") Integer jugador, 
                         @RequestParam("pregunta") Integer pregunta, 
                         @RequestParam("respuesta") Integer respuesta) {
        jugadas.put(pregunta, new Jugada(jugador,pregunta,respuesta));
        return true;
    }

    @GetMapping("/resultados")
    public ResponseEntity<HashMap<Integer,Jugada>> resultados() {
        return new ResponseEntity<>(jugadas, HttpStatus.OK);
    }
    
}