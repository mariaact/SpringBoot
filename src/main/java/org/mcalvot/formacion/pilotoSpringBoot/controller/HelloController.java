package org.mcalvot.formacion.pilotoSpringBoot.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    private String cadena = "Hola";

    @GetMapping("/saludos")
    public String saludos(){

        return cadena;
    }

    @PostMapping("/cambiarSaludos")
    public CambiarSaludos cambiarSaludos(@RequestBody CambiarSaludos newCambiarSaludos){

        cadena = newCambiarSaludos.getCadena();

        return newCambiarSaludos;
    }




}
